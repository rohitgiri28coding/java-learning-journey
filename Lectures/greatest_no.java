import java.util.*;
public class greatest_no {
    public static void main(String args[]) {
        System.out.println("Enter three number: ");
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        if ((n1>n2 && n1>n3)||(n3 == n2 && n1>n2))
        System.out.println(n1+ " is greatest among all three.");
        else if ((n2>n1 && n2>n3)||(n1 == n3 && n2>n1))
        System.out.println(n2+ " is greatest among all three.");
        else if ((n3>n1 && n3>n2)||(n1 == n2 && n3>n1))
        System.out.println(n3+ " is greatest among all three.");
        else 
        System.out.println("All are Equal.");
    }
}
