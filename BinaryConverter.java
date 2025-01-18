import java.util.Scanner;

public class BinaryConverter{
    static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        double n = sc.nextDouble(),res =0;
        int  temp = (int)n, flag = 0;
        float floatingTemp =(float) (n-temp);
        floatingTemp *= 100000;
        for(int i=0; temp!=0 ; i++){
            if(temp%10 == 0 ||temp%10 == 1){
                res += ((temp%10)*(Math.pow(2,i)));
                temp /=10;
            }
            else{
                flag = 1;
                break;
            }    
        }
        temp = (int)floatingTemp;
        for(int j=-5;j!=0;j++){
            if(temp%10 == 0 ||temp%10 == 1){
                res += ((temp%10)*Math.pow(2,j));
                temp = temp / 10;
            }
            else{
                flag = 1;
                break;
            }
        }

        if (flag == 0){
            System.out.println(n+" in decimal number system will be "+res);}
        else
            System.out.println("Entered number is not a binary number");
        }
}
