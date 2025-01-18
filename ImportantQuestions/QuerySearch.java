import java.util.Arrays;

import array.*;

public class QuerySearch {
    public static void main(String[] args) {
        InputArray i_obj = new InputArray();
        i_obj.size();
        int[] arr = i_obj.getArray();
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        System.out.print("Enter number of queries: ");
        int q = i_obj.sc.nextInt();
        int[] query = new int[max+1];
        for(int i=0;i<arr.length;i++){
            query[arr[i]] = query[arr[i]] + 1;
        }
        for(int i=0;i<q;i++){
            System.out.print("Enter elemnt to be searched: ");
            int search = i_obj.sc.nextInt();
            if (query[search]>0) {
                System.out.println("Element present.");
            }
            else{
                System.out.println("Element not found.");
            }
        }
    }
}
