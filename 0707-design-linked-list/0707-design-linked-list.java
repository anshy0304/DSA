class MyLinkedList {
    Node head;
    int size =0;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    public int get(int index) {
        if(index >= size) return -1;
        Node temp = head;
        for(int i = 0;i<index;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
       Node n = new Node(val);
       n.next = head;
       head = n;
       size++;
    }
    
    public void addAtTail(int val) {
        size++;
        if(head == null){ 
            head = new Node(val);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if(index == 0) {addAtHead(val);return;}
        if(index == size) {addAtTail(val);return;}
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        Node n = new Node(val);
        n.next = temp.next;
        temp.next = n;
        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size) return;
        size--;
        if(index == 0) {head = head.next;return;} 
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        if(temp.next != null) temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */