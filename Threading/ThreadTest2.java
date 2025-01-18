class MyThread1 implements Runnable {
    @Override
    public void run(){
        while(true){
            System.out.println("Mythread 1 is running");
        }
    }
}
class MyThread2 implements Runnable {
    @Override
    public void run(){
        while(true){
            System.out.println("Mythread 2 is running");
        }
    }
}
public class ThreadTest2{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        Thread th1 = new Thread(t1);
        MyThread2 t2  = new MyThread2();
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}