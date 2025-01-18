import java.util.Scanner;

class jaggedArray{
    int row_size,column_size;
    Scanner input;

    public jaggedArray(){
        input = new Scanner(System.in);
    }

    public void rowSize(){
        System.out.print("Enter row size for jagged array: ");
        row_size = input.nextInt();
    }

    int arr[][] = new int[row_size][];

    public void columnSize(){
        for(int i=0;i<row_size;i++){
            System.out.print("Enter coulum size for row "+(i+1)+" for jagged array: ");
            column_size = input.nextInt();
            arr[i-1] = new int[column_size];
        }
    }
    
    public void getArr(){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Enter element "+(i+1)+" * "+(j+1)+" : ");
                arr[i][j] = input.nextInt();
            }
        }    
    }

    public void showArr(){
        System.out.println("Elements of Jagged array are :- ");
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
     
}
public class jaggedarr{
    public static void main(String[] args) {
        jaggedArray jA = new jaggedArray();
        jA.rowSize();
        jA.columnSize();
        jA.getArr();
        jA.showArr(); 
    }
}