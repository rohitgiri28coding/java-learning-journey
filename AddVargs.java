public class AddVargs {
    static void add(int ...arr){
        int res=0;
        for(int elements:arr){
            res+=elements;
        }
        System.out.println("sum = "+res);
    }
    public static void main(String[] args) {
        add(2,5,35,25,-10255,52200);
        add(1,2,3,4,5,6,7,8,9);
    }
}
