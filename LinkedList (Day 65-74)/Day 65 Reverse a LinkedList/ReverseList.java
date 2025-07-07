
public class ReverseList {
    class Node{
        int data; 
        Node next; 

        Node(int data){
            this.data = data; 
            this.next = null;
        }
    }
    private Node head; 
    private Node tail;

    public Node reverseList(Node head) {
        // code here
        Node prev = null; 
        Node curr = head; 
        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr; 
            curr = nextNode; 
        }
        
        return prev;
    }

    public void reverse(){
        head = reverseList(head);
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
    

    public static void main(String[] args) {
        ReverseList r = new ReverseList();

        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(5);
        r.add(6);

        r.printList();
        
        r.reverse();
        
        r.printList();

    }
}
