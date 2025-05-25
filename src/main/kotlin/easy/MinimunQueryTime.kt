package easy

// Time (n log(n))
// Space O(1)
fun main() {
    val queries = mutableListOf(3, 2, 1, 2, 6)
    
    queries.sort()
    var totalSumQueries = 0

    for (i in queries.indices) {
        val remain = (queries.size - (i + 1))
        totalSumQueries += queries[i] * remain
    }
    print(totalSumQueries)
}