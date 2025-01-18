class Mythread extends Thread{
    public Mythread(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<20;i++)
            System.out.println("Thread is running");
    }
}

public class ThreadConstructors {
    public static void main(String[] args) {
        Mythread th = new Mythread("Rohit");
        th.start();
        System.out.println(th.getName());
        
    }
}
