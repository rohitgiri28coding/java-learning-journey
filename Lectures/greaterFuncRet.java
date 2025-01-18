import java.util.*;
public class greaterFuncRet{
    public static int greater(int n1,int n2) {
        if(n1<n2)
            return n2;
        else
            return n1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num1,num2;
        System.out.println("Enter two numbers ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (greater(num1,num2)==num1){
            System.out.println(num1+" is greater than "+num2);
        }
        else
        System.out.println(num2+" is greater than "+num1);

    }
}
