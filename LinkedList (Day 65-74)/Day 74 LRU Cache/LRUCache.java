import java.util.*;

class LRUCache {
    
    class Node{
        int key , value; 
        Node next, prev; 
        Node(int key ,int value){
            this.key = key; 
            this.value = value; 
        }
    }
    private  int capacity; 
    private  Map<Integer , Node> map; 
    private Node head, tail; 
    
    public  LRUCache(int capacity){
        this.capacity = capacity; 
        this.map = new HashMap<>();
        
        head = new Node(0 , 0); 
        tail = new Node(0 , 0);
        
        head.next = tail; 
        tail.prev = head; 
    }
    
    public  int get(int key) {
        if(!map.containsKey(key)) return -1;
        
        Node node = map.get(key);
        
        remove(node);
        insert(node);
        return node.value;
        
    }

        
    public  void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key); 
            node.value = value;
            remove(node); 
            insert(node);
        }
        else{
            if(map.size()== capacity){
                Node lru = tail.prev; 
                remove(lru);
                map.remove(lru.key);
            }
            Node newNode = new Node(key, value);
            insert(newNode);
            map.put(key , newNode);
        }
    }
    
    private void remove(Node curr){
        curr.prev.next = curr.next; 
        curr.next.prev = curr.prev;
    }
    
    private void insert(Node curr){
        Node temp = head.next; 
        head.next = curr; 
        curr.prev = head;
        curr.next = temp; 
        temp.prev = curr;
    }
}