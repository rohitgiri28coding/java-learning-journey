import java.util.Scanner;

public class rectPattern {
    public static void main(String[] args) {
        int rows, columns;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        columns = sc.nextInt(); 
        for(int i = 0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print("* ");
            }
            System.out.println();
        }    
    }
}
