public class CSLinkedList_Exercises {
    Node head;
    Node tail;
    int length;

    public CSLinkedList_Exercises() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    /*
     ! Implement a Circular Singly Linked List
     * Create a circular singly linked list with methods to insert a new node at the 
     * beginning, end, and toString  to display the list. 
     */
    public void append(int value) {
        Node newNode = new Node();
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
            newNode.next = newNode;
        } else {
            this.tail.next = newNode;
            newNode.next = this.head;
            this.tail = newNode;
        }
        this.length++;
    }
 
    public void prepend(int value) {
        Node newNode = new Node();
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
            this.tail.next = newNode;
        }
        this.length++;
    }
 
    @Override
    public String toString() {
        if (this.length == 0) {
            return "";
        }
 
        Node tempNode = this.head;
        StringBuilder result = new StringBuilder();
        
        do {
            result.append(tempNode.value);
            tempNode = tempNode.next;
            if (tempNode != this.head) {
                result.append(" -> ");
            }
        } while (tempNode != this.head);
 
        return result.toString();
    }
    
    /*
     ! Delete a Node from a Circular Singly Linked List
     * Implement a method in the CircularLinkedList class to delete a node by value.
     */
    public boolean deleteByValue(int value) {
        if (this.length == 0) {
            return false;
        }
 
        if (this.head == this.tail && this.head.value == value) {
            this.head = null;
            this.tail = null;
            this.length = 0;
            return true;
        }
 
        Node current = this.head;
        Node prev = null;
 
        do {
            if (current.value == value) {
                if (current == this.head) {
                    this.head = this.head.next;
                    this.tail.next = this.head;
                } else if (current == this.tail) {
                    prev.next = this.head;
                    this.tail = prev;
                } else {
                    prev.next = current.next;
                }
 
                this.length--;
                return true;
            }
 
            prev = current;
            current = current.next;
        } while (current != this.head);
 
        return false;
    }

    /*
     ! Count the Number of Nodes
     * Add a method to count the number of nodes in the circular singly linked list.
     */
    public int countNodes() {
        int count = 0;
        Node temp = this.head;
        if (temp == null) {
            return 0;  // Return 0 immediately if the list is empty
        }
 
        do {
            count++;  // Increment the count for each node
            temp = temp.next;  // Move to the next node
        } while (temp != this.head);  // Continue until the list cycles back to the head
 
        return count;  // Return the total count
    }
}