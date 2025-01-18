import java.util.Scanner;

public class DecimalConvertor {
    public static void main(String args[]) {
        float n,binary_no,temp,c=0;
        int a,b=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        n = sc.nextFloat();
        a = (int)n;
        temp =  (n-a);
        for(int i = 0;a!=0;i++){
            b+= ((int) (a%2*(Math.pow(10, i))));
            a /= 2; 
        }
        for(int i=-1;i>=(-5);i--){
            c  += (((int)(temp*2))*(Math.pow(10, i))); 
            temp = (temp*2);
            temp -= ((int)temp);
        }
        binary_no=b+(c);
        System.out.println("("+n+") => (" +binary_no+")");
        
    }
}
