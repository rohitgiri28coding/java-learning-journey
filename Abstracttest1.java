abstract class Test25{
    int x;
    abstract void f1();
}
class Child25 extends Test25{
    void f2(){System.out.println(x);}
    void f1() {x=10;}// if removed it will give error
}

public class Abstracttest1 {
    public static void main(String[] args) {
        Child25 C = new Child25();
        C.f1();
        C.f2();
    }
}
