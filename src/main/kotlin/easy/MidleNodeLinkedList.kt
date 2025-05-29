package easy


fun main () {

    val linkedList = LinkedList(2)
    linkedList.next = LinkedList(7)
    val expected = LinkedList(3)
    linkedList.next!!.next = expected
    expected.next = LinkedList(5)

    println(middleNode(linkedList).value)
}
fun middleNode(linkedList: LinkedList): LinkedList {
    // Write your code here.
    var fastNode:LinkedList?  = linkedList
    var slowNode:LinkedList? = linkedList

    while(fastNode != null && fastNode.next != null) {
        slowNode = slowNode?.next
        fastNode = fastNode.next?.next
    }

    return slowNode!!
}