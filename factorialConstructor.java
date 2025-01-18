import java.util.*;

class factorial{
    int n,temp;
    long fact=1;
    Scanner sc;
    public  factorial(){
        sc = new Scanner(System.in);}

    public void get(){
        System.out.println("Enter a number ");
        n = sc.nextInt();
        temp = n;
    }
    
    public void calculate() {
        if(n>0){
            for (;temp!=0;temp--){
                fact *= temp;
            }
        }
    }
    public void show() {
        if (n<0)
            System.out.println("Wrong Input ");
        else if(n==0)
            System.out.println("0! = 1") ;
        else
            System.out.println(n+"! = "+fact);
    }
    
}
public class factorialConstructor {
    public static void main(String args[]) {
        factorial f = new factorial();
        f.get();
        f.calculate();
        f.show();
    }
    
}
