import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        int a=0,b=1,sum,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        n = sc.nextInt();
        if (n<0)
        System.out.println("Wrong input");
        else if(n==1)
        System.out.println("Series: " +a);
        else if (n==2)
        System.out.println("Series: " +a+ ","+b);
        else {
            int []series = new int[n-2];
            System.out.print("Series: " +a+","+b+",");
            for(int i=0;n!=2;i++,n--){
                series[i] = a+b;
                a=b;
                b=series[i];
            }
            for(int i=0;i<series.length;i++){
                System.out.print(series[i]);
                if(i+1!=series.length)
                    System.out.print(",");
            }
        }
    } 
}