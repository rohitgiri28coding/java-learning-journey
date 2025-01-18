package array;

class Sort{
    public void SortAsc(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    void SortDesc(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
public class SortingArray {
    public static void main(String[] args) {
        InputArray i_obj = new InputArray();
        Sort s_obj = new Sort();
        i_obj.size();
        int[] arr = i_obj.getArray();
        System.out.println("Sorting Options :-\n(1) Ascending\n(2) Descending");
        String choice = i_obj.sc.next();
        choice = choice.toLowerCase();
        switch (choice) {
            case "ascending","1":
                System.out.println("Sorted array :-");
                s_obj.SortAsc(arr);
                i_obj.showArray();
                break;
            case "descending","2":
                System.out.println("Sorted array :-");
                s_obj.SortDesc(arr);
                i_obj.showArray();
                break;
            default:
            System.out.println("The entered sorting method is not available.");
                break;
        }
    }
}
