import java.util.Scanner;

public class mul {
    public static void main(String[] args) {
        int[][][] arr=new int [2][][];
        arr[0]=new int [1][2];
        arr[1]=new int [2][1];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i =0;i<arr.length;i++){
                for(int j =0;j<arr[i].length;j++){
                    for(int k= 0;k<arr[i][j].length;k++){
                        System.out.print("Enter element "+(j+1)+" * "+(k+1)+" for array "+(i+1)+" : ");
                        arr[i][j][k]=sc.nextInt();
                    }
                }
            }
        }
        int [][] prod,temp;
        prod = arr[0];
        int sum=0,l;
        for(int i=1;i<arr.length;i++){
            temp = new int[prod.length][arr[i][arr[i].length-1].length];
            for(int j=0;j<prod.length;j++){
                for(int k =0;k<arr[i][arr[i].length-1].length;k++){
                    for( l =0,sum=0;l<prod[j].length;l++){
                        sum += (prod[j][l] * arr[i][l][k]);
                    }
                    temp[j][k] = sum;
                }
            }
            prod = temp;
        }
        System.out.println("Resultant Matrix after performing  operation :-");
        for(int i=0;i<prod.length;i++){
            for(int j=0;j<prod[i].length;j++){
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }
    
    }
}
