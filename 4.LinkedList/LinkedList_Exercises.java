/*
 * Implement the following on the SinglyLinkedList class:push
 * This function should take in a value and add o node to the end of the SinglyLinkedList.
 */
public class LinkedList_Exercises {
    public Node head;
    public Node tail;
    public int size;

    public Node insertSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void push(int nodeValue) {
        if (head == null) {
            insertSinglyLinkedList(nodeValue);
            return;
        } else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }
    }

    /*
     * Implement the following on the SinglyLinkedList class:pop
     * This function should remove a node at the end of the SinglyLinkedList. It
     * should return the node removed.
     */
    public Node pop() {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return null;
        }
        Node removeNode;
        Node currentNode;
        if (head == tail) {
            removeNode = head;
            head = tail = null;
        } else {
            currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            removeNode = currentNode.next;
            currentNode.next = null;
            tail = currentNode;
        }
        size--;
        return removeNode;
    }

    /*
     * Implement the following on the SinglyLinkedList class:Insert
     * This function should insert a node at a specified index in a
     * SinglyLinkedList.
     * It should return true if the index is valid, and false if the index is
     * invalid (less than 0 or greater the length of the list).
     */
    public boolean insert(int data, int index) {
        Node newNode = new Node();
        newNode.value = data;
        if (index < 0 || index >= size) {
            return false;
        }
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else if (index == 1) {
                newNode.next = head.next;
                head.next = newNode;
            } else if (index == size) {
                tail.next = newNode;
                newNode.next = null;
                tail = newNode;
            } else {
                Node tempNode = head;
                int inx = 0;
                while (inx < index - 1) {
                    tempNode = tempNode.next;
                    inx += 1;
                }
                Node nextNode = tempNode.next;
                tempNode.next = newNode;
                newNode.next = nextNode;
            }
        }
        size += 1;
        return true;

    }

    /*
     * Implement the following on the SinglyLinkedList class:get
     * This function should find a node at a specified index in a SinglyLinkedList.
     * It should return the found node.
     */
    public Node get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node tempNode = head;
        int inx = 0;
        while (inx < index) {
            tempNode = tempNode.next;
            inx += 1;
        }
        return tempNode;
    }

    /*
     * Implement the following on the SinglyLinkedList class:Rotate
     * This function should rotate all the nodes in the list by some number passed
     * in.
     * For instance, if your list looks like 1 -> 2 -> 3 -> 4 -> 5 and you rotate by
     * 2, the list should be modified to 3 -> 4 -> 5 -> 1 -> 2.
     * The number passed in to rotate can be any integer.
     * Time Complexity : O(N), where N is the length of the list.
     * Space Complexity : O(1)
     */
    public String rotate(int number) {
        int index = number;
        if (number < 0) {
            index = number + size;
        }
        if (index < 0 || index >= size) {
            return null;
        }
        if (index == 0) {
            return "No Rotation";
        }
        Node prevNode = head;
        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.next;
        }
        if (prevNode == null) {
            return "No Rotation";
        }
        tail.next = head;
        head = prevNode.next;
        tail = prevNode;
        prevNode.next = null;
        return "Success";
    }

    /*
     * Implement the following on the SinglyLinkedList class:Set
     * This function should accept an index and a value and update the value of the
     * node in the SinglyLinkedList at the index with new value.
     * It should return true if the node is updated successfully or false if an
     * invalid index is passed in.
     */
    public boolean set(int index, int value) {
        if (head == null) {
            head.value = value;
            tail.value = value;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
                if (currentNode == null) {
                    return false;
                }
            }
            currentNode.value = value;
        }
        return true;
    }
    /*
     * Implement a function on the SinglyLinkedList class which should remove a node at a specified index in a SinglyLinkedList. 
     * If the index is valid it should return the removed node otherwise it should return null.
     */
    public Node remove(int index) {
        if (index<0 || index >= size) {
          return null;
        }
        Node removeNode;
        Node currentNode;
        size--;
        if (index == 0) {
          removeNode = head;
          if (head == tail) {
            head = tail = null;
          } else {
            head = head.next;
          }
          return removeNode;    
        } else {
          currentNode = head;
          int indx = 0;
          while (indx < index - 1) {
            currentNode = currentNode.next;
            indx ++;
          }
          removeNode = currentNode.next;
          Node nextNode = currentNode.next;
          currentNode.next = nextNode.next;
          return removeNode;
        }
      }

}