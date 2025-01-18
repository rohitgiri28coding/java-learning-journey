public class testStat{
    static int n1;
    int n2;
    public static void main(String[] args) {    
        testStat t1 = new testStat();
        testStat t2 = new testStat();
        t1.n1 =30;
        t1.n2 = 50;
        System.out.println(t2.n1);
        System.out.println(t2.n2);
        System.out.println(testStat.n1);
    }
}