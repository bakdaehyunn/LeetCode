class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    int capacity;
    Map<Integer,Node> map;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node  = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(capacity==map.size()){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    void remove(Node node){
        map.remove(node.key);
        node.prev.next= node.next;
        node.next.prev = node.prev;
    }
    void insert(Node node){
        map.put(node.key,node);
        Node temp = head.next;
        head.next= node;
        node.prev = head;
        node.next = temp;
        temp.prev = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */