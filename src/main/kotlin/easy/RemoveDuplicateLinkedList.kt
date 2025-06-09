package easy


open class LinkedList(value: Int) {
    var value = value
    var next: LinkedList? = null
}


fun main() {
    val input = addMany(LinkedList(1), listOf(1, 3, 4, 4, 4, 5, 6, 6))
    printLinkedList(removeDuplicatesFromLinkedList(input))
}

fun addMany(linkedList: LinkedList, values: List<Int>): LinkedList {
    var current = linkedList
    while (current.next != null) {
        current = current.next!!
    }
    for (value in values) {
        current.next = LinkedList(value)
        current = current.next!!
    }
    return linkedList
}

fun removeDuplicatesFromLinkedList(linkedList: LinkedList): LinkedList {
    // Write your code here.
    var currentNode: LinkedList? = linkedList
    while (currentNode != null) {
        if (currentNode.value == currentNode.next?.value) {
            currentNode.next = currentNode.next?.next
        } else {
            currentNode = currentNode.next
        }
    }
    return linkedList
}

fun printLinkedList(linkedList: LinkedList) {
    var currentNode: LinkedList? = linkedList
    while (currentNode != null) {
        println(currentNode.value)
        currentNode = currentNode.next
    }
}
