
public class RotateList {
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

    public int findLength(Node head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        
        return len;
    }
    
    public Node rotate(Node head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        
        int length = findLength(head);
        k = k % length; 
        if(k == 0) return head;
        
        Node curr = head; 
        int count = 1; 
        while(count < k && curr != null){
            curr = curr.next;
            count++;
        }
        
        if(curr == null || curr.next == null){
            return head;
        }
        
        Node newHead = curr.next;   
        curr.next = null; 
        
        Node temp = newHead; 
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = head;
        
        
        
        return newHead;
    }

    public void rotate(int k){
        head = rotate(head, k);
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
        RotateList r = new RotateList();

        r.add(10);
        r.add(20);
        r.add(30);
        r.add(40);
        r.add(50);

        r.printList();
        r.rotate(4);
        
        r.printList();

    }
}
