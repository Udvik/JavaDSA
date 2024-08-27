
public class singleDimensionalArray {
    int arr[] = null;

    public singleDimensionalArray(int arrlength){
        arr = new int[arrlength];
        for(int i=0 ; i< arrlength ; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
//Inserting Element into array
    public void insert(int location , int value){
        try{
            if(arr[location] != Integer.MIN_VALUE){
                System.out.println("The position is already occupied");
            }else{
                arr[location] = value;
                System.out.println("Successfully inserted");
            }

        }catch(Exception e){
            System.out.println("Exception Raised : "+e);
        }
        
    }

    public void valueAt(int index){
        try {
            System.out.println("Value at index "+ index+" is "+arr[index]);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }

    public void traversal(){
        try {
            for (int i=0;i < arr.length ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void searchInArray(int ValueToSearch){
        for (int i=0;i<arr.length;i++){
            if(arr[i] == ValueToSearch){
                System.out.println("Value is found at the index "+i);
                return;
            }
        }
        System.out.println(ValueToSearch + " is not found in the array");
    }

    public void deleteValue(int valueToDelete){
        for (int i=0;i<arr.length;i++){
            if(arr[i] == valueToDelete){
                arr[i]=Integer.MIN_VALUE;
                return;
            }
        }
        System.out.println("Unable to find the value");
    }

    public void deleteIndex(int indexToDelete){
        try {
            arr[indexToDelete] = Integer.MIN_VALUE;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
