import java.util.*;
public class gcd {
    public static int Gcd(int n1,int n2) {
        int cd,g_cd=1;
        for(int i =2;n1 >i ;i++){
            if (n1%i == 0 && n2%i == 0){
                cd = i ;
                if (cd>g_cd)
                g_cd = cd;
            }
        }
        return g_cd;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers ");
        int num1=sc.nextInt(),num2=sc.nextInt();
        System.out.println( "gcd(" +num1+ "," +num2+") = " +Gcd(num1,num2));
    }
    
}
