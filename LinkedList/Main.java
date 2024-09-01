public class Main {
        public static void main(String[] args){
        singlyLinkedList sll = new singlyLinkedList();
        sll.createSinglyLinkedList(5);
        sll.insert(10,1);
        sll.insert(20, 2);
        System.out.println(sll.head);
        sll.traversal();
        sll.search(20);
}
}
