import java.util.*;
public class bolvote {
    public static boolean vote(int age) {
        if(age>=18){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int age ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age ");
        age = sc.nextInt();
        System.out.println(vote(age));
    }
}    

