class MyThread1 extends Thread {
    @Override
    public void run(){
        while(true){
            System.out.println("Mythread 1 is running");
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run(){
        while(true){
            System.out.println("Mythread 2 is running");
        }
    }
}
public class ThreadTest{
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread2 th2  = new MyThread2();
        th1.start();
        th2.start();
    }
}