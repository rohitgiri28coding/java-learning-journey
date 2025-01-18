public class claADD {
    public static void main(String[] args) {
        int sum=0,i;
        for( i=0;i<args.length;i++){
            sum += Integer.parseInt(args[i]);
        }
        if(i==0)
            System.out.println("Input your data through CLA");
        else
            System.out.println(sum);
    }
}
