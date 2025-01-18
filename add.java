import java.util.Scanner;
public class add{
    public static void main(String args[]) {
        int num1,num2,sum;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num1=s.nextInt();
        System.out.println("Enter another number: ");
        num2=s.nextInt();
        sum = num1 + num2;
        System.out.println("Sum = "+sum);
    }
}
