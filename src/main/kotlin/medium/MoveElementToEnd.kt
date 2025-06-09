package medium


fun main() {
    val input = mutableListOf<Int>(4, 1, 3, 2, 2, 2, 2, 2)
    val toMove = 2

    println(moveElementToEnd(input, toMove))
}


// Time O(n) / Space O(1)
fun moveElementToEnd(array: MutableList<Int>, toMove: Int): List<Int> {
    var pL = 0
    var pR = array.size - 1

    while(pL < pR) {
        while (pL < pR && array[pR] == toMove) {
            pR -= 1
        }
        if (array[pL] == toMove)
            swap(array, pL , pR)

        pL += 1
    }

    return array
}

//Swap Function
fun swap(arrSwap: MutableList<Int>, i: Int, j: Int) {
    val aux = arrSwap[i]
    arrSwap[i] = arrSwap[j]
    arrSwap[j] = aux
}