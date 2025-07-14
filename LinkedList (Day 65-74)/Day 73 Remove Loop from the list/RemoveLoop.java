import java.lang.*;

public class RemoveLoop {
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

    
    public static Node findFirstNode(Node head) {
            Node fast = head; 
            Node slow = head; 
            
            while(fast != null && fast.next != null){
                slow = slow.next; 
                fast = fast.next.next;
                if(fast == slow){
                    break;
                }
            }
            
            if(fast == null || fast.next == null){
                return null;
            }
            
            
            slow = head; 
            
            while(fast != slow){
                slow = slow.next; 
                fast = fast.next;
            }
            
            return slow;
            
        }

        public int findFirstNode(){
            return findFirstNode(head).data;
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

    public void removeLoop(Node head) {
        if(head == null || head.next == null) return; 
        
        Node slow = head; 
        Node fast = head; 
        
        while(fast != null && fast.next != null){
            slow = slow.next; 
            fast = fast.next.next; 
            
            if(slow == fast) break;
        }
        
        if(slow != fast) return; 
        
        slow = head;
        Node prev = slow; 
        
        
        // for head if loop is from head
       if(slow == fast){
           while(fast.next != slow){
               fast =fast.next;
           }
           
           fast.next = null;
           return;
       }
       
       while(slow.next != fast.next){
           slow = slow.next; 
           fast = fast.next; 
       }
       
       fast.next = null;
        
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
        RemoveLoop list = new RemoveLoop();

        // Creating nodes
        list.add(1);
        list.add(2);
        list.add(3);

       list.createLoop(1); //0-based indexing

       System.out.println(list.findFirstNode());


       list.removeLoop(list.head);

       list.printList(list.head);
    }
}





 