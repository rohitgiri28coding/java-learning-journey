public class SubTest {
    public static void main(String[] args) {
        double n1 = 10.10101,n2;
        int temp = (int)n1;
        System.out.println("Temp = "+temp);
        n2 = n1-(double)temp;
        System.out.println("n2 = "+n2);
        n2 = n2*100000;
        System.out.println(n2);
        temp = (int)n2;
        System.out.println(temp);
        int r = temp /10;
        System.out.println(r);
        temp %= 10;
        System.out.println(temp);
    }
}
