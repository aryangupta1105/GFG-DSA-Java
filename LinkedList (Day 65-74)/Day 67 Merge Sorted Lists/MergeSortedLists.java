import java.lang.*; 

public class MergeSortedLists {
    class Node{
        int data; 
        Node next; 

        Node(int data){
            this.data = data; 
            this.next = null;
        }
    }
    public Node head; 
    private Node tail;

    public Node sortedMerge(Node head1, Node head2) {
        // code here
        Node dummyHead = new Node(-1); 
        Node curr1 = head1;
        Node curr2 = head2; 
        Node dummyTail = dummyHead;
        while(curr1 != null && curr2 != null){
            if(curr1.data < curr2.data){
                dummyTail.next = curr1;
                curr1 = curr1.next;
            }
            else{
                dummyTail.next = curr2; 
                curr2 = curr2.next;
            }
            
            dummyTail = dummyTail.next;
        }
        
        if(curr1 != null){
            dummyTail.next = curr1;
        }
        else{
            dummyTail.next = curr2;
        }
        
        return dummyHead.next;
    }



    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode; 
            tail = newNode;
            return;
        }
        tail.next = newNode; 
        tail = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("The list is empty!");
        }
        else{
            Node curr =head; 
            while(curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }
    public void printList(Node head){
        if(head == null){
            System.out.println("The list is empty!");
        }
        else{
            Node curr =head; 
            while(curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        MergeSortedLists r = new MergeSortedLists();

        r.add(10);
        r.add(20);
        r.add(30);
        r.add(40);
        r.add(50);
        r.printList();
        

        MergeSortedLists r2 = new MergeSortedLists();

        r2.add(15);
        r2.add(25);
        r2.add(35);
        r2.add(45);
        r2.add(55);

        
        r2.printList();


        r2.sortedMerge(r.head , r2.head);

        r2.printList();

    

    }
}
