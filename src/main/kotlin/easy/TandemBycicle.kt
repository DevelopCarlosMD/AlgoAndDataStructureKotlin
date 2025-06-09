package easy

import kotlin.math.max


fun main() {

    val bluSpeeds = listOf(3, 6, 7, 2, 1)
    val redSpeeds = listOf(5, 5, 3, 9, 2)
    val fastest = true

}

fun tandemBicycle(redShirtSpeeds: MutableList<Int>, blueShirtSpeeds: MutableList<Int>, fastest: Boolean): Int {
    var totalSpeed = 0
    redShirtSpeeds.sort()
    blueShirtSpeeds.sort()

    if (!fastest)
        redShirtSpeeds.reverse()


    for (i in 0 until redShirtSpeeds.size) {
        val rider1 = redShirtSpeeds[i]
        val rider2 = blueShirtSpeeds[(blueShirtSpeeds.size) - i -1]
        totalSpeed += max(rider1, rider2)
    }

    return totalSpeed
}

fun reverseList(listSpeeds: MutableList<Int>) : MutableList<Int> {
    var start  = 0
    var end = listSpeeds.size - 1

    while(start < end) {
        val tempEnd = listSpeeds[end]
        val tempStart = listSpeeds[start]
        listSpeeds[start] = tempEnd
        listSpeeds[end] = tempStart;

        start += 1
        end -= 1
    }

    return listSpeeds
}