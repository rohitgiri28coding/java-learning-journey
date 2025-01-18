import java.util.Scanner;


public class jaggcla{
    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);
        
        int arr[][] = new int[(Integer.parseInt(args[0]))][];

        for(int i=1 ;i<=arr.length;i++)
            arr[i-1]=new int[(Integer.parseInt(args[i]))];
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Enter element "+(i+1)+" * "+(j+1)+" : ");
                arr[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Elements of Jagged array are :- ");
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }   
    }
}