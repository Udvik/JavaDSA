import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
class ArrayListExample {
    
    public static void main(String[] args){
         ArrayList<Integer> arr = new ArrayList<Integer>();
 //adding
         arr.add(10);
         arr.add(20);
         arr.add(30);
         arr.add(40);
         System.out.println("Elements are successfully added");
//Accessing        
         int firstElement = arr.get(0);
         System.out.println("The first Element is "+ firstElement);

//Traversing
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
//Traversing using a iterator
        Iterator<Integer> iterator = arr.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//Deleting Value at a index
        arr.remove(3);
    }
}
