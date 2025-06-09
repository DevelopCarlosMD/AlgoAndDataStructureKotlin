fun twoNumbersSum(arrayIn: MutableList<Int>, targetSum: Int)
: List<Int> {
    val numberSet = HashSet<Int>()

    for (element in arrayIn) {
        val expectedPair = targetSum - element
        println("value: $expectedPair")
        if (numberSet.contains(expectedPair))
            return listOf(element, expectedPair)

        numberSet.add(element)
    }
    return listOf()
}


fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
    var sequencePosition = 0

    for (element in array) {
        if (element == sequence[sequencePosition]) {
            ++ sequencePosition
        }
        if(sequencePosition == sequence.size) return true
    }
    return false
}


fun sortedSquaredArray(array: MutableList<Int>): List<Int> {
    for (i in array.indices) {
        array[i] = array[i] * array[i]
    }
    // Write your code here.
    return mutableListOf()
}

class Customer(name: String) {
    val customerKey = name.uppercase()
}

class PointP(private val x: Int, private val y : Int? = 3, private val name:String) {

    fun getX() : Int {
        return x
    }

    fun getY(): Int? {
        return y
    }

    fun getName() : String {
        return name
    }
}

fun main() {
    //var arr = mutableListOf<Int>(3,5,-4,8,11,1,-1,6)
    //System.out.println("two Number was: ${twoNumbersSum(arr, 10)}")

    //var arr2 = mutableListOf<Int>(5,1,22,25,6,-1,8,10)
    //var arr3 = mutableListOf(25)

    //println(isValidSubsequence(arr2, arr3))
    val pnt1 = PointP(23, name = "chocho")
    print(pnt1.getY())
}