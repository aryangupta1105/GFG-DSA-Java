import java.lang.*;

public class FCD {
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

    public static boolean detectLoop(Node head) {
        // Add code here
        Node slow = head; 
        Node fast = head; 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; 
            
            if(fast == slow){
                return true;
            }
        }
        
        return false;
    }
    public boolean detectLoop( ) {
        return detectLoop(head);
    }


    public void createLoop(int pos){
        if(pos == 0) return;
        Node curr = head; 

        while(pos != 0){
            curr = curr.next;
            pos--;
        }

        tail.next = curr; 
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
        FCD list = new FCD();

        // Creating nodes
        list.add(1);
        list.add(2);
        list.add(3);

       list.createLoop(2);

       System.out.println(list.detectLoop());
    }
}


