public class CheckArraySize {
    public static void main(String[] args) {
        int[] arr= new int[5];
        arr = new int[10];
        arr[9]=12;
        System.out.println(arr[9]);
    }
}
