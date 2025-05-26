package easy

// O(n*log(n)) Time / Space O(1)
fun main() {

    val map1 = mutableMapOf<String, Int>()
    map1["deadline"] = 8
    map1["payment"] = 3
    val map2 = mutableMapOf<String, Int>()
    map2["deadline"] = 1
    map2["payment"] = 1
    val map3 = mutableMapOf<String, Int>()
    map3["deadline"] = 1
    map3["payment"] = 2


    val input = mutableListOf<MutableMap<String, Int>>()
    input.add(map1)
    input.add(map2)
    input.add(map3)

    println(optimalFreelancing(input))
}

fun optimalFreelancing(jobs: MutableList<MutableMap<String, Int>>): Int {
    // Write your code here.
    // Order the map based on the highest payment
    val weekLength = 7
    var profit = 0
    val daysSchedule = mutableSetOf<Int>()

    val jobList = jobs.map {
        Job(it["deadline"]!!, it["payment"]!!)
    }
        .sortedByDescending { it.payment }

    //println(jobList)
    var a = 0

    for (job in jobList) {
        if (daysSchedule.size == weekLength) break
        for (day in job.deadLine downTo    1) {
            if (day !in daysSchedule) {
                profit += job.payment
                println("$day , $profit")
                daysSchedule.add(day)
                break
            }
        }
    }

    return profit
}

data class Job(
    val deadLine: Int,
    val payment: Int
)