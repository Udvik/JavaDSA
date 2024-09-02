
import java.util.Arrays;



public class stack {
    int arr[];
    int topOfStack;
    public stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;

    }

    //isEmpty
    public boolean isEmpty(){
        return topOfStack == -1;
    }

    public boolean isFull(){
        return (topOfStack == arr.length-1);
    }

    public void push(int value){
        if(!isFull()){
            topOfStack++;
            System.out.println("Element " + value + "is successfully pushed");
            arr[topOfStack] = value;
        }else{
            System.out.println("Stack is full");
        }
    }

    public int pop(){
        int last = -1;
        if(!isEmpty()){
            System.out.println("Stack is empty");
        }else{
            last =  arr[topOfStack];
            topOfStack--;
            System.out.println("Element " + last + " is successfully popped");
        }
        return last;
    }

    public int peek(){
        if(!isEmpty()){
            System.out.println("The Peek Element is "+arr[topOfStack]);
        }
        return arr[topOfStack];
    }

    public int size(){
        return topOfStack + 1;
    }

    public void printStack(){
        System.out.println(Arrays.toString(arr));
    }

    public void delete(){
        this.arr = null;
        System.out.println("Stack deleted");
    }
}
