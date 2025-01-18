import java.util.*;

public class greatestfunc {
    public static void greater(int n1,int n2) {
        if (n1>n2)
        System.out.println(n1+" is greater than "+n2);
        else 
        System.out.println(n2+" is greater than "+n1);
    }

    public static void main(String args[]) {
        int num1,num2;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        greater(num1, num2);
    }
}
