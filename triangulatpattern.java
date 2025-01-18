import java.util.Scanner;

public class triangulatpattern {
    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
