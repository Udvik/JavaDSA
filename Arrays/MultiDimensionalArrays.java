
public class MultiDimensionalArrays {
    int[][] arr=null;
    int rows = Integer.MIN_VALUE;
    int columns = Integer.MIN_VALUE;

    public MultiDimensionalArrays(int rows , int columns){
        this.rows = rows;
        this.columns = columns;
        this.arr = new int[rows][columns];
        for(int i = 0 ; i<rows ; i++){
            for (int j = 0 ; j<columns ; j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

//Inserting a element
    public void insert(int row , int column , int value){
        try {
            if(arr[row][column]==Integer.MIN_VALUE){
                arr[row][column] = value;
           }else{
               System.out.print("This Index is already occupied");
           } 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void getValueByIndex(int row,int column){
        try{
            System.out.print(arr[row][column]);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    public void traverse(){
        for (int i=0 ; i<rows ; i++){
            for (int j=0 ; j<columns ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void searchValue(int value){
        for (int i=0 ; i<rows ; i++){
            for (int j=0 ; j<columns ; j++){
                if(arr[i][j] == value){
                    System.out.println("Value found");
                    return;
                }
            }
            
        }
        System.out.println("Value not found ");
    }
}
