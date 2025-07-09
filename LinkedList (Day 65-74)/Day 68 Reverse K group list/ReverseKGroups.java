import java.lang.*;


class ReverseKGroups{
    static class Node{
        int data; 
        Node next; 


        Node(){
            this.data = 0; 
            this.next = null;
        }

        Node(int data)
        {
            this.data  = data; 
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

        
        public void add(int data){
            Node newNode = new Node(data);
            
            if(head == null){
                head = newNode;
            }
            else{
                Node current = head; 
                while(current.next != null){
                    current = current.next;
                }

                current.next = newNode;
            }
        }




        public static int length(Node head){
        if(head == null) return 0; 
        int len = 0; 
        while(head != null){
            head = head.next; 
            len++;
        }
        return len;
    }
    
    
    public static Node reverseKGroup(Node head, int k) {
        if(head == null || k<=1) return head; 
        
        Node curr = head; 
        Node prev = null; 
        int count = 0 ;
        
        
        Node temp = head; 
        int actualCount = 0; 
        
        while(temp != null && actualCount < k){
            temp = temp.next; 
            actualCount++;
        }
        
        while(curr != null && count < actualCount){
            Node nextNode = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = nextNode; 
            count++;
        }
        
        if(curr != null){
            head.next = reverseKGroup(curr , k);
        }
        
        return prev;
    }

    public void reverse(int k){
        head = reverseKGroup(head, k);
    }

        public void displayList(){
            Node current = head;
            if(current == null){
                System.out.println("The list is empty!");
                return;
            }

            while(current != null){
                System.out.print( current.data + " -> ");
                current = current.next;
            }

            System.out.println("end");
        }

        public static void main(String[] args) {
            ReverseKGroups list1 = new ReverseKGroups();

            list1.add(23);
            list1.add(24);
            list1.add(25);
            list1.add(26);
            list1.add(27);

            list1.displayList();
            list1.reverse(3);
            list1.displayList();
        }
}