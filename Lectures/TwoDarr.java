import java.util.Scanner;

public class TwoDarr {
    public static void main(String[] args) {
        int p,q;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the row size: ");
        p= sc.nextInt();
        System.out.println("Enter the column size: ");
        q= sc.nextInt();
        int [][]num = new int [p][q];
        for(int i = 0; i<p;i++){
            for(int j=0;j<q;j++){
                System.out.println("Enter element "+(i+1)+"*"+(j+1));
                num [i][j]= sc.nextInt();
            }
            for(int k = 0; i<p;i++){
                for(int j=0;j<q;j++){
                    System.out.print(num[k][j]+"\t");  
        }
        System.out.println();
    }

    }
}
}
