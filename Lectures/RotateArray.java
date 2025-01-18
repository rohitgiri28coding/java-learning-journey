/*
 * Constructor
 * Array of n size
 * Rotate array n steps
 * Pass by value in array 
 */


import java.util.Scanner;

class Arrays{
    Scanner sc;
    int[] arr;
    int n,size;
    public  Arrays(){
        sc = new Scanner(System.in);
    }
    void size(){
        System.out.print("Enter size of array: ");
        size = sc.nextInt(); 
        arr = new int[size];
    }
    int[] getArray(){
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    void showArray(){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void NoOfRotation(){
        System.out.print("Enter the number of rotation : ");
        n = sc.nextInt();
        n = n%arr.length;
    }
    void Rotate(){
        for(int i =0,j=arr.length-1;i+n==j;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}

public class RotateArray {
    public static void main(String[] args) {
        int[] arr;
        Arrays a_obj = new Arrays();
        a_obj.size();
        arr = a_obj.getArray();
        System.out.println("Original Array :- ");
        a_obj.showArray();
        a_obj.NoOfRotation();
        a_obj.Rotate();
        System.out.println("Rotated array :- ");
        a_obj.showArray();
    }
}
