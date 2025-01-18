public class ArraySizeTest {
    public static void main(String[] args) {
        int[] arr ={2,5,42};
        arr = new int[13];
       
        for(int i=0;i<10;i++){
            arr[i]=i;
        }
      //Array constants can only be used in initializers
        System.out.println(arr[8]);
        int [][] arr5;
        int[] a;
a = new int[]{1, 2, 3, 4};
        //arr5={{1,1,1},{1,1,1},{1,1,1}};
        //System.out.println(arr5.length);
        //System.out.println(arr5[1].length);
    }
}
