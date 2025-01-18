import java.util.Scanner;

class factorial{
    Scanner sc;
    long f=1,n,temp;

    public factorial(){
    sc = new Scanner(System.in);
    }
    public void getNumber(){
        System.out.println("Enter a number: ");
        n= sc.nextLong();
        temp = n;
    }
    public void check(){
        if (n<0){
            System.out.println("Invalid input");
        }else
        return;   
    }   
    public void showResult(){
        System.out.println(n+"! = "+f);
    }
    public void calculate(){
        for(;temp>1;f*=temp,temp--);
    }
    }

public class factReal {
    public static void main(String args[]) {
        factorial f = new factorial();
        f.getNumber();
        f.check();
        f.calculate();
        f.showResult();
    }
}