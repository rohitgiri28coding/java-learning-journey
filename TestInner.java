class CPU{
    double price;
    class Processor{
        String name;
        double core;
        public int cache(){
            return 10;
        }
    }
}
public class TestInner{
    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor P = cpu.new Processor();
        P.core = 100.12;
        System.out.println("CORE "+P.core);
        P.name = "INTEL";
        System.out.println("NAME "+P.name);
        System.out.println("CACHE "+P.cache());
    }
}