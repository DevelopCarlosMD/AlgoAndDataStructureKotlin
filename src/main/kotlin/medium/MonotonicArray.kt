package medium

// O(n) time / O (1) space
fun main() {

    val array = mutableListOf(-1, -5, -10, -1100, -1100, -1101, -1102, -9001)
    println(isMonotonic(array))
}

// You have to consider the direction increses or decreases
// Or logical could give us base in the combination is
/*
* true	true	true	All elements are equal (constant array)
  true	false	true	Monotonically decreasing
  false	true	true	Monotonically increasing
  false	false	false	Not monotonic
* */
fun isMonotonic(array: List<Int>): Boolean {
    // Write your code here.
    var isNonIncreasing = true
    var isNonDecreasing  = true

    for (i in 1 until array.size) {
        if (array[i] < array[i -1])
            isNonIncreasing = false
        if (array[i] > array[i - 1])
            isNonDecreasing = false
    }

    return isNonIncreasing || isNonDecreasing
}

// Time O(n) / Space O(1)
/*fun isMonotonic(array: List<Int>) : Boolean {

    // Check pairs of values to verify non-decreasing
    // Check pairs of values to verify non-increasing
    var direction = array[1] - array[0]
    for (i in 1 until array.size) {
        if (direction == 0) {
            direction = array[i] - array[i-1]
            continue
        }

        if (breaksDirection(direction, array[i - 1], array[i]))
            return false
    }

    return true
}

fun breaksDirection(direction: Int, previousInt: Int, currentInt: Int): Boolean {
    val difference = currentInt - previousInt
    if (difference > 0)
        return false

    return true
}*/
