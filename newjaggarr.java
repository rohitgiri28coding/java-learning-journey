import java.util.Scanner;

class jaggedArray{

    int row_size,column_size;
    int []num = new int[5];
    
    Scanner sc;

    public jaggedArray(){
        sc = new Scanner(System.in);
    }
    
    public void array(){
        for(int i = 0;i<5;i++){
            num[i] = i;
        }
    }

    public void rowSize(){
        System.out.println("Enter row size for jagged array: ");
        row_size = sc.nextInt();
    }

    int arr[][] = new int[row_size][];

    public void columnSize(){
        for(int i=0;i<row_size;i++){
            System.out.println("Enter coulum size for row "+(i+1)+" for jagged array: ");
            column_size = sc.nextInt();//1,2,3,4,5
            arr[i] = new int[(num[i])];
        }
    }
    
    public void getArr(){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Enter element "+(i+1)+" * "+(j+1)+" : ");
                arr[i][j] = sc.nextInt();
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
public class newjaggarr{
    public static void main(String[] args) {
        jaggedArray jA = new jaggedArray();
        jA.rowSize();
        jA.array();
        jA.columnSize();
        jA.getArr();
        jA.showArr(); 
    }
}
