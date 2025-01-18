import java.util.*;
public class factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
            System.out.println("Enter a number: ");
            int n = sc.nextInt(),temp;
            if(n<0)
                System.out.println("Wrong input ");
            else if(n==0)
                System.out.println("0! = 1");
            else{
                long fact = 1;
                temp = n;
                while(n!=1){
                    fact *= n;
                    n--;
                }
                System.out.println(temp+ "! = " +fact );
            }
        }
    }
