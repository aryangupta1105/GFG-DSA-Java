import java.lang.*;


class AddTwoLists{
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

    public Node reverseList(Node head){
        Node curr = head; 
        Node prev = null; 
        while(curr != null){
            Node nextNode= curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = nextNode;
        }
        
        return prev;
    }
    public Node removeLeadingZeroes(Node head){
        while(head != null && head.data == 0){
            head = head.next;
        }
        
        return head == null? new Node(0): head;
    }
    public Node addTwoLists(Node num1, Node num2) { 
        Node curr1 = reverseList(num1); 
        Node curr2 = reverseList(num2); 
        
        int carry = 0;
        Node newHead = new Node(-1);
        Node ans = newHead;
        while(curr1 != null || curr2 != null || carry != 0){
            int sum = carry; 
            
            if(curr1 != null){
                sum += curr1.data; 
                curr1 = curr1.next;
            }
            
            if(curr2 != null){
                sum += curr2.data; 
                curr2 = curr2.next;
            }
            
            carry  = sum / 10 ;
            ans.next = new Node(sum %10);
            ans = ans.next;
        }
        
        
        Node ansHead = reverseList(newHead.next);
        head = ansHead;
        
        return removeLeadingZeroes(ansHead);
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
            AddTwoLists list1 = new AddTwoLists();
            AddTwoLists list2 = new AddTwoLists();

            list1.add(3);
            list1.add(4);
            list1.add(5);
            list1.add(6);
            list1.add(7);
            list2.add(4);
            list2.add(8);
            list2.add(9);
            list2.add(9);
            list2.add(9);

            list1.displayList();

            

            list2.displayList();

            list2.addTwoLists(list1.head, list2.head);

            list2.displayList();
        }
}