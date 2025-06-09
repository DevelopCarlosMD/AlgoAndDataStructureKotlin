open class BinaryTree(value: Int) {
    var value = value
    var left: BinaryTree? = null
    var right: BinaryTree? = null
}

fun branchSums(root: BinaryTree?): List<Int> {
    // Write your code here.
    if(root == null) return emptyList()
    if(root.left == null && root.right == null) return listOf(root.value)

    return(branchSums(root.left) + branchSums(root.right)).map { it + root.value }
}

/*
* tree =     1
        /     \
       2       3
     /   \    /  \
    4     5  6    7
  /   \  /
 8    9 10

*
* */

fun main() {
// Create nodes
    val node1 = BinaryTree(1)
    val node2 = BinaryTree(2)
    val node3 = BinaryTree(3)
    val node4 = BinaryTree(4)
    val node5 = BinaryTree(5)
    val node6 = BinaryTree(6)
    val node7 = BinaryTree(7)
    val node8 = BinaryTree(8)
    val node9 = BinaryTree(9)
    val node10 = BinaryTree(10)

    // Set up the tree structure
    node1.left = node2
    node1.right = node3
    node2.left = node4
    node2.right = node5
    node3.left = node6
    node3.right = node7
    node4.left = node8
    node4.right = node9
    node5.left = node10
    node5.right = null

    // Create a list of nodes (if needed)
    val input = mutableListOf(node1, node2, node3, node4, node5, node6, node7, node8, node9, node10)

    // Example usage of sumOfAllBranches
    val totalSum = branchSums(node1)
    println("Sum of all branches: $totalSum")
}