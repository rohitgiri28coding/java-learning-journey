import java.util.Scanner;

public class oddFunc {
    public static void odd(int lowLimit,int upLimit){
        for(;lowLimit <= upLimit;lowLimit++){
            if(lowLimit %2 != 0){
                System.out.print(lowLimit);
                if(lowLimit == upLimit){
                    continue;
                }
                else{
                    System.out.print(",");
                }
            }
        }
    }
    
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        int lowLimit,upLimit;
        System.out.println("Enter the lowerlimit for the range ");
        lowLimit = s.nextInt();
        System.out.println("Enter the upperlimit for the range ");
        upLimit = s.nextInt();
        odd(lowLimit,upLimit);
    }
    
}
