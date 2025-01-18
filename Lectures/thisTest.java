class A{
    int a;
    void f1(){
        int a;
        a=10;
        this.a =20;
    }
    void show(){
        System.out.println(a);
    }
}
public class thisTest {
    public static void main(String[] args) {
        A ob = new A();
        ob.f1();
        ob.show();
    }
}
