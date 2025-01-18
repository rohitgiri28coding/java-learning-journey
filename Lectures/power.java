import java.lang.Math;
import java.util.Scanner;

public class power {
    public static long power(int x, int n) {
        return (long)Math.pow(x,n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x,n;
        System.out.println("Enter a number: ");
        x= sc.nextInt();
        System.out.println("Enter power for the number ");
        n = sc.nextInt();
        System.out.println(x+" to the power "+n+" = "+power(x, n));
    }
}
