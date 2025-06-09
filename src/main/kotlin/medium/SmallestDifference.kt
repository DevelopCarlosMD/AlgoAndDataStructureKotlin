
// Medium Level
// pointer and the start and at the end, then iterate
fun main() {
    val arr1 = mutableListOf(-1, 5, 10, 20, 28, 3)
    val arr2 = mutableListOf(26, 134, 135, 15, 17)

    println(smallestDifference(arr1, arr2))
}

// Space O(1) / Time O(nlog(n) + mlog(m))
fun smallestDifference(arrayOne: MutableList<Int>, arrayTwo: MutableList<Int>): List<Int> {
    // Write your code here.
    arrayOne.sort()
    arrayTwo.sort()

    var pIdxOne = 0
    var pIdxTwo  = 0
    var smallestDifferencePair = IntArray(2) { 0 }
    var smallestDifference = Int.MAX_VALUE

    while(pIdxOne < arrayOne.size
        && pIdxTwo < arrayTwo.size) {
        var firstN = arrayOne[pIdxOne]
        var secondN = arrayTwo[pIdxTwo]
        var currentSmallDifference = kotlin.math.abs(firstN - secondN)

        if (currentSmallDifference < smallestDifference) {
            smallestDifference = currentSmallDifference
            smallestDifferencePair[0] = firstN
            smallestDifferencePair[1] = secondN

            if (smallestDifference == 0) break
        }

        if (firstN < secondN) {
            pIdxOne += 1
        }
        else {
            pIdxTwo += 1
        }
    }

    return smallestDifferencePair.toList()
}
