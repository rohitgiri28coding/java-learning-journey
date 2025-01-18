import java.util.Scanner;

public class factorialMethod{
    public static long fact(int n){
        if (n<0){
        System.out.println("Wrong Input ");
        return 0;}
        else if(n==0)
            return 1;
        else{
            return n*fact(n-1);
        }
    }
    
    public static void main(String args[]) 
    {
        int num;
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        long factorial = fact(num);
        if (factorial!=0)
        System.out.println(num+"! = "+factorial);

    }
    }
