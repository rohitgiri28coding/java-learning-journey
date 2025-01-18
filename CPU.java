public class CPU {
    
    double price;
    
    static class Processor {
        double Core;
        String company;
        static double cache (){
        return 10;
        }
    }
    public static void main(String[] args) {
    System.out.println("CACHE VALUE "+CPU.Processor.cache());
    CPU cpu = new CPU();
    cpu.price = 10;
    System.out.println(cpu.price);
    //cpu.Processor p = cpu.new Processor();
    Processor p = new Processor();
    p.Core = 12.5;
    p.company = "TCS";
    System.out.println(p.Core);  
    System.out.println(p.company);
    }
}

