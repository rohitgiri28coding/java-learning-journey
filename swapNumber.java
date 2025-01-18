import java.util.Scanner;

public class swapNumber {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num1 = sc.nextInt();
        System.out.println("Enter another number: ");
        num2 = sc.nextInt();
        System.out.println("Before swap numbers are "+num1+" & "+num2 );
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swap numbers are "+num1+" & "+num2 );
        /* Swap with 3 variables
         int temp = num1; 
              num1 =num2;
              num2 = temp; */
    }
}
