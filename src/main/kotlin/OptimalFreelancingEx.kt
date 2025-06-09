fun main() {
    /*{
        "jobs": [
        {
            "deadline": 1,
            "payment": 1
        },
        {
            "deadline": 1,
            "payment": 2
        }
        ]
    }*/
    var items = mutableMapOf<String, Int>("deadline" to 1)
    items["payment"] = 1
    items["deadline"] = 1
    items["payment"] = 2

    val mapFreelancing = MutableList(2){items}
    print(optimalFreelancing(mapFreelancing))
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

    for (job in jobList) {
        if (daysSchedule.size == weekLength) break
        for (day in job.deadLine downTo 1) {
            if (day !in daysSchedule) {
                profit += job.payment
                daysSchedule += day
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