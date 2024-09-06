public class doublyLinkedlist {
    public Node head;
    public Node tail;
    public int size;

    public Node createdll(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = null; 
        node.prev = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void ibeg(int nodeValue){
        if(head == null){
            createdll(nodeValue);
        }else{
            Node node = new Node();
            node.value = nodeValue;
            node.prev = null;
            node.next = head;
            head.prev = node;
            size++;
            head = node;
        }
    }

    public void imid(int nodeValue, int position){
        if(position<0 || position>size){
            System.out.println("Element "+ nodeValue + " cannot be inserted at position" + position);
        }else{
            Node node = new Node();
            node.value = nodeValue;
            Node current = head;
            for(int i=0; i<position-1; i++){
                current = current.next;
            }
            node.next = current.next;
            node.prev = current;
            current.next.prev = node;
            current.next = node;
            size++;
        }
    }
    public void ilast(int nodeValue){
        if(head == null){
            createdll(nodeValue);
        }else{
            Node node = new Node();
            node.value = nodeValue;
            node.next = tail.next;
            node.prev = tail;
            tail.next = node;
            tail = node;
            size++;
        }
    }
    
    public void search(int nodeValue){
        Node current = head;
        while(current != tail){
            if(current.value == nodeValue){
                System.out.println(nodeValue+" is found in the linkedlist");
                return;
            }
            current = current.next;
        }
        if(current.value == nodeValue){
            System.out.println(nodeValue + " is found in the linkedlist");
        }
        else{
            System.out.println(nodeValue+" not found in the linkedlist");
        }
        }
    public void dbeg(){
        Node current = head.next;
        head.next.prev = null;
        head.next = null;
        head = current;
    }

    public void dlast(){
        Node current = tail.prev;
        tail.prev.next = null;
        tail.prev = null;
        tail = current;
    }

    public void dmid(int position){
        if(position>0 && position<size){
            Node current = head;
        for(int i=0; i<position; i++){
            current = current.next;
        }
        if(current == tail){
            tail.prev.next = null;
            tail.prev = null;
            tail = current.prev;
        }
        current.prev.next = current.next;
        if(current.next!=null){
            current.next.prev = current.prev;
        }

        size--;
        }
    }

    public void traverse(){
        Node current1 = head;
        Node current2 = tail;
        while(current1 != tail){
            System.out.print(current1.value + "->");
            current1 = current1.next;
        }
        System.out.print(current1.value);
        System.out.println();

        while(current2 != head){
            System.out.print(current2.value + "->");
            current2 = current2.prev;
        }
        System.out.print(current2.value);
        System.out.println();

    }
}
