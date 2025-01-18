import java.util.Scanner;

public class reverse_no{
    public static void main(String args[]) 
    {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),rev=0,temp,i;
        temp = num;
        for(i=0;temp!=0;i++){
            rev = rev*10 + temp%10;
            temp /=10;  
        }
        System.out.println(rev+" is the reverse order of "+num);
        System.out.println("Total number of digits in "+num+" is "+i);
    }
}