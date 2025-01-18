public class realadd {
    public static void main(String[] args) {
        double sum = 0.0;
        if(args.length == 0)
            System.out.println("Please input your data through command line argument, Thank You!");
        else{ 
        for(int i = 0; i<args.length;i++){
            sum += Double.parseDouble(args[i]);
        }
        System.out.println("Sum = "+sum);}
    }
}
