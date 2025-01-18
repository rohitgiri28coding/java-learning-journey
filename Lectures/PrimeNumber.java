import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int r1,r2,flag=0,j,i=0;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the first term for the range: ");
        r1 = sc.nextInt();
        System.out.println("//Inorder to check whether the number is prime or not enter the same number");
        System.out.print("Enter end limit for the range: ");
        r2 = sc.nextInt();
        if(r1<0 || r2<0)
            flag++;
        else{
            int []num =new int[(r2-r1+1)];
        for(; r1 <= r2 ; r1++){
    inner:    for(j = 2; j<r1;j++){
                if(r1%j == 0){
                    flag++;
                    break inner;
                }
            }
            if(flag == 0 && r1!=1){
                num[i] = r1;
                i++;
            }
            flag = 0;
        }
        if(i==0){
            System.out.println(r2+" is not a Prime Number");
        }else{
        System.out.print("Prime Number: ");
        for(j=0;j<i;j++){
            System.out.print(num[j]);
            if(j+1!=i)
                System.out.print(",");}        
    }
}
}
}