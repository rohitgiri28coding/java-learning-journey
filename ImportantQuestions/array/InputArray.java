package array;

import java.util.Scanner;

public class InputArray {
    Scanner sc;
    int[] arr;
    int size;
    public  InputArray(){
        sc = new Scanner(System.in);
    }
    public void size(){
        System.out.print("Enter size of array: ");
        size = sc.nextInt(); 
        arr = new int[size];
    }
    public int[] getArray(){
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    public void showArray(){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
