public class Main {
    public static void main(String[] args){
        doublyLinkedlist dll = new doublyLinkedlist();
        dll.createdll(10);
        dll.ibeg(5);
        dll.ibeg(1);
        dll.ilast(200);
        dll.imid(100,3);
        dll.traverse();
        dll.search(200);
        dll.search(100);
        dll.dbeg();
        System.out.println("Removing first node");
        dll.traverse();
        dll.dlast();
        System.out.println("Removing last node");
        dll.traverse();
        dll.dmid(1);
        dll.traverse();
    }
}
