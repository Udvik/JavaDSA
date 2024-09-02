class Main{
    public static void main(String[] args){
        stack newStack = new stack(4);
        newStack.push(10);
        int top = newStack.peek();
        newStack.printStack();
        newStack.delete();
        System.out.println("Stack is deleted");
        newStack.printStack();
    }
}