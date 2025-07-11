import java.lang.*;

public class CopyListRandom {
    static class Node {
        int data;
        Node next;
        Node random;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.random = null;
        }
    }

    private Node head;
    private Node tail;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Step 1: Clone nodes and insert them into the list
    public Node clone(Node firstNode) {
        if (firstNode == null) {
            System.out.println("The list is empty!");
            return null;
        }

        Node current = firstNode;
        while (current != null) {
            Node newNode = new Node(current.data);
            newNode.next = current.next;
            current.next = newNode;
            current = newNode.next;
        }

        return firstNode;
    }

    // Step 2: Assign random pointers
    public Node assigningLinks(Node firstNode) {
        if (firstNode == null) {
            System.out.println("The list is empty!");
            return null;
        }

        Node current = firstNode;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next; // Move to the next original node
        }

        return firstNode;
    }

    // Step 3: Detach cloned nodes from original nodes
    public Node detach(Node firstNode) {
        if (firstNode == null) {
            System.out.println("The list is empty!");
            return null;
        }

        Node current = firstNode;
        Node copiedHead = firstNode.next;
        Node copiedCurrent = copiedHead;

        while (current != null) {
            current.next = copiedCurrent.next;
            current = current.next;
            if (current != null) {
                copiedCurrent.next = current.next;
                copiedCurrent = copiedCurrent.next;
            }
        } 

        return copiedHead; // Return the head of the copied list
    }

    public Node detach2(Node firstNode) {
        if (firstNode == null) {
            System.out.println("The list is empty!");
            return null;
        }
    
        Node current = firstNode;
        firstNode = firstNode.next; // Correctly pointing to the copied list
    
        while (current != null && current.next != null) {
            Node temp = current.next; // Save reference to copied node
            current.next = temp.next; // Restore original list link
            current = temp; // Move to copied node
    
            if (current.next != null) { // Ensure safe access to next node
                current.next = current.next.next; // Link copied list correctly
            }
    
            current = temp.next; // Move to next original node
        }
    
        return firstNode; // Return head of copied list
    }
    

    // Combine all steps to copy the list
    public Node CopyListRandom(Node firstNode) {
        if (firstNode == null) {
            System.out.println("The list is empty!");
            return null;
        }

        firstNode = clone(firstNode);
        assigningLinks(firstNode);
        return detach2(firstNode);
    }

    // Print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print("Data: " + temp.data);
            System.out.print(", Random: " + (temp.random != null ? temp.random.data : "null"));
            System.out.println();
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        CopyListRandom list = new CopyListRandom();

        // Creating nodes
        list.add(1);
        list.add(2);
        list.add(3);

        // Manually setting random pointers
        list.head.random = list.head.next.next;  // 1 -> 3
        list.head.next.random = list.head;       // 2 -> 1
        list.head.next.next.random = list.head.next; // 3 -> 2

        System.out.println("Original List:");
        list.printList(list.head);

        // Copying the list
        Node copiedHead = list.CopyListRandom(list.head);

        System.out.println("\nCopied List:");
        list.printList(copiedHead);
    }
}
