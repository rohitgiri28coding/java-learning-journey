public class GreatestCLA {
    public static void main(String[] args) {
        int max = 0,i;
        for(i=0; i<args.length; i++){
            for(int j=i+1;j<args.length;j++ ){
            if((Integer.parseInt(args[i]))>(Integer.parseInt(args[(j)])))
                max = Integer.parseInt(args[i]);
            else
                max = Integer.parseInt(args[i+1]);
        }}
        if(i == 0)
            System.out.println("Input number through CLA");
        else
            System.out.println(max);
    }
}
