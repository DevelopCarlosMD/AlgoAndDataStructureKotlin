
fun main() {
    val list = mutableListOf(12, 3, 1, 2, -6, 5, -8, 6)
    val targetSum = 0

    println(threeNumberSum(list, targetSum))
}


fun threeNumberSum(array: MutableList<Int>, targetSum: Int): List<List<Int>> {
    // Write your code here
    val resultList = mutableListOf<List<Int>>()
    array.sort()

    for (i in 0 until array.size) {
        var pL = i + 1
        var pR = array.size - 1
        while (pL < pR) {
            val currentSum = array[i] + array[pL] + array[pR]
            if (currentSum == targetSum) {
                resultList.add(listOf(array[i], array[pL], array[pR]))
                ++pL
                --pR
            } else if (currentSum > targetSum)
                --pR
            else
                ++pL
        }
    }

    return resultList
}