package easy

fun main() {

    val redShirtHeights = mutableListOf(6, 9, 2, 4, 5)
    val blueShirtHeights = mutableListOf(5, 8, 1, 3, 4)
    var flag = false




    redShirtHeights.sortDescending()
    blueShirtHeights.sortDescending()

    print(redShirtHeights)
    print(blueShirtHeights)

    val shirtColor = if (redShirtHeights[0] < blueShirtHeights[0]) "RED" else "BLUE"

    for (i in redShirtHeights.indices) {
        var redShirtHeight = redShirtHeights[i]
        var blueShirtHeight = blueShirtHeights[i]

        if (shirtColor.equals("RED")) {
            if (redShirtHeight >= blueShirtHeight)
                flag = false
        }
        else {
            if (blueShirtHeight >= redShirtHeight)
                flag = false
        }
    }

    flag = true
}