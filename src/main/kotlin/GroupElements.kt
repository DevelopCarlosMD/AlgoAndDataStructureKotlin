fun main() {

    val arrList = arrayListOf("3", "110", "110", "001")
    val arr2List = arrayListOf("4", "1100", "1110", "0110", "0001")
    val arr3List = arrayListOf("5", "10000", "01000", "00100", "00010", "00001")
    var matrix = arrayListOf<ArrayList<Int>>()

    for (i in 1 until arr3List.size) {

        /*for (char in arrList[i]) {
            val intValue = char.digitToInt()
            row.add(intValue)
        }*/
        val row = arr3List[i].map { it.digitToInt() } as ArrayList<Int>
        matrix.add(row)
    }

    calculateRelationShip(matrix)
}

fun calculateRelationShip(matrix: ArrayList<ArrayList<Int>>) : Unit {
    val rows = matrix.size
    val cols = matrix[0].size
    var related = 0
    var groups = 0
    for(x in 0 until cols) {
        for(y in 0 until rows) {
            if(matrix[x][y] == 0) {
                continue
            } else {
                if (matrix[x][y] == 1) {
                    related += 1
                    if (y != x && matrix[x][y] == 1 && matrix[y][x] == 1) {
                        groups += 1
                    }
                }
            }
        }
    }

    println(related)
    println(groups)
}
