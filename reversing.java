import java.util.Scanner;

class reverse{
    Scanner sc;
    int rev=0,num,temp;
    public reverse(){
        sc = new Scanner(System.in);
    }
    public void getNumber(){
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        temp = num;
    }
    public void calculate(){
        for(int i=0;temp!=0;temp /=10,i++){
            rev = rev*10 + temp%10;  
        }
    }
    public void showResult() {
        System.out.println(rev+" is the reverse order of "+num);
    }
}
public class reversing{
    public static void main(String[] args) {
        reverse rev = new reverse();
        rev.getNumber();
        rev.calculate();
        rev.showResult();
    }
}