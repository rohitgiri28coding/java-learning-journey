import array.*;
import java.util.Scanner;

class Searching{
    void search(int[] arr,int search){
        int F=0,L=arr.length;
        int M = (F+L)/2;
        while(true){
            if(arr[M]==search){
                System.out.println("Element Found");
                break;
            }
            else if(search>arr[M]){
                F = M + 1;
                M = (F + L)/2;
            }
            else if(search<arr[M]){
                L = M - 1;
                M = (F + L)/2;
            }
            else{
                System.out.println("Element not found.");
                break;
            }
        }
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputArray i_obj = new InputArray();
        Sort sort_obj = new Sort();
        Searching s_obj = new Searching();
        i_obj.size();
        int[] arr = i_obj.getArray();
        sort_obj.SortAsc(arr);
        System.out.println("Sorted array is :- ");
        i_obj.showArray();
        System.out.print("Enter element to be searched: ");
        int search = sc.nextInt();
        s_obj.search(arr, search);
    }
}
