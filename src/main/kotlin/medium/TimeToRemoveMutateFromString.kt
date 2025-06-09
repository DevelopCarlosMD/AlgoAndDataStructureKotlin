package medium

// Time O(N) Space O(1)
fun main() {

    val s1 = "tamem"
    val c1 = 'm'

    val s2 = "luvzliz"
    val c2 = 'z'

    val s3 = "banana"
    val c3 = 'a'

    println(timeToRemoveMutateFromString(s1, c1))
    println(timeToRemoveMutateFromString(s2, c2))
    println(timeToRemoveMutateFromString(s3, c3))
}

fun timeToRemoveMutateFromString(gene: String, mutate: Char): Int {

    var maxCount = 0
    var currentNoTarget = 0

    if (gene.isEmpty()) return 0

    for (c  in gene) {
        if (c == mutate) {
            if (currentNoTarget > maxCount) {
                maxCount = currentNoTarget
            }
            currentNoTarget = 0
        } else {
            ++currentNoTarget
        }
    }

    return maxCount
}