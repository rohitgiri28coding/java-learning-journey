import java.util.Scanner;

public class vote {
    public static String voting(int age) {
        if (age>=18)
        return "Eligible For Voting";
        else
        return "Not Eligible to vote";
    }
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int age;
        System.out.println("Enter age ");
        age = sc.nextInt();
        if (age<=0){
            System.out.println("Apne baap ko jake ullu bnao");
        }
        else{
            System.out.println(vote(age));
        }

    }
}
