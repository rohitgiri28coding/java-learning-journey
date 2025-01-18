public class forEachLoopTest {
    public static void main(String[] args) {
        int [] arr = {12,5,341,34,345};
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        int [][] ae ={{1,2,3,4},{2,3,4,5}};
        for(int[] a:ae){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
