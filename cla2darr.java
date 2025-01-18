import java.util.*;

public class cla2darr {
    public static void main(String[] args) {
        int row_size = Integer.parseInt(args[0]);
        int column_size = Integer.parseInt(args[1]);
        Scanner s = new Scanner(System.in);
        int [][] arr = new int[row_size][column_size];
        for(int i = 0;i<row_size; i++){
            for(int j = 0;j<column_size;j++){
                System.out.print("Enter element "+(i+1)+"*"+(j+1)+" : ");
                arr[i][j] = s.nextInt();
            } 
        }

        System.out.println("The array entered is :- ");

        for(int i = 0; i<row_size; i++){
            for(int j=0;j<column_size;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
