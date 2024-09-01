public class singlyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int value){
        head = new Node();
        tail = new Node();
        Node node = new Node();
        node.value = value;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insert(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }
        else if(location == 0){
            node.next = head;
            head = node;
            tail = node;
        }
        else if(location>=size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else{
            Node tempNode = head;
            int index = 0;
            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            node.next = nextNode;
            tempNode.next = node;
        }
        size+=1;
    }
  
        public void traversal(){
            if(head == null){
                System.out.println("SLL does not exist");
            }else{
                Node current = head;
                while(current.next != null){
                    
                    System.out.print(current.value);
                    current = current.next;
                    if(current.next != null){
                        System.out.print("->");
                    }

                }
                System.out.print("->");
                System.out.print(current.value);
                System.out.println();
            }
        }

    public boolean search(int key){
        Node current = head;
        boolean found = false;
        while(current != null){
            if(current.value == key){
                found = true;
            }
            current = current.next;
        }
        if(found){
            System.out.println("Value is found");
            return true;
        }else{
            System.out.println("Value is not found");
            return false;
        }
    }

    public void delete(int value){
         
    }
}
