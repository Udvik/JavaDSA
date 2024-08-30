public class cll {
    public Node head;
    public Node tail;
    public int size;

    public Node createcll(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertatstart(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = head;
        head = node;
        tail.next = head;
        size++;
    }

    public void insertatposition(int nodeValue, int position){
        Node node = new Node();
        node.value = nodeValue;
        Node current = head;
        for(int i=0; i<position-1; i++){
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
        size++;
    }

    public void insertatlast(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = tail.next;
        tail.next = node;
        tail = node;
        size++;
    }

    public void deleteatstart(){
        head = head.next;
        tail.next = head;
        size--;
    }

    public void deleteatposition(int position){
        if(position<0 || position>size){
            return;
        }else{
            Node current = head;
            for(int i=0; i<position-1; i++){
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }

    public void deleteatlast(){
        Node current = head;
        while(current.next != tail){
            current = current.next;
        }
        current.next = tail.next;
        tail = current;
        size--;
    }

    public void update(int nodeValue, int position){
        Node current = head;
        if(position<0 || position>size){
            return;
        }
        else{
            for(int i=0; i<position; i++){
                current = current.next;
            }
            current.value = nodeValue;
        }
    }

    public void count(){
        Node current = head;
        int count = 1;
        while(current.next != tail){
            count++;
            current = current.next;
        }
        System.out.print("Number of nodes are "+(count+1));
    }

    public void print(){
        Node current = head;
        for(int i=0; i<size; i++){
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.print(current.value);
        System.out.println();
    }
}
