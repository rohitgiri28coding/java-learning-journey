class Mythread extends Thread{
    public Mythread(String name){
        super(name);
    }
    public void run(){
        // int i=0;
        // while(i<10){
            System.out.println(this.getName());
            System.out.println(this.getName());
            System.out.println(this.getName());
            System.out.println(this.getName());
           // i++;}
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        Mythread t1 = new Mythread("Rohit1");
        // Mythread t2 = new Mythread("Rohit2");
        // Mythread t3 = new Mythread("Rohit3");
        // Mythread t4 = new Mythread("Rohit4");
        Mythread t5 = new Mythread("Rohit5");
        t5.setPriority(10);
        t1.start();
        // t2.start();
        // t3.start();
        // t4.start();
        t5.start();
    }
}
