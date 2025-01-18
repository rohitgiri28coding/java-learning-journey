import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp, res=0,i;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        temp = n;
        for(i=0;temp!=0;i++,temp/=10);
        temp = n;
        for(;temp!=0;){
            res += (Math.pow((temp%10),i));
            temp /= 10;}
        if(res == n){
            System.out.println(n+" is an Armstrong number");
        }
        else
            System.out.println(n+" is not an Armstrong number");
    }
}
