import java.util.Scanner;

public class dynarr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num;
        System.out.print("Enter size for array: ");
        int n = sc.nextInt(),temp;
        num = new int [n]; 
        for(int i=0;i<n;i++){
            System.out.print("Enter  the elements "+(i+1)+": ");
            num[i]= sc.nextInt();}

        System.out.println("Elements are :-");
        for(int i=0;i<n;i++){ 
            System.out.print(num[i]+"\t");
            }

        // Ascending order
        for (int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if (num[i]>num[j]){
                        temp = num[j];
                        num[j]= num[i];
                        num[i] = temp;
                }
            }}
        
            System.out.println("\nSorted Elements are :-");
            for(int i=0;i<n;i++){ 
                System.out.print(num[i]+"\t");
                }
    }
}