class Parent{
    int x;
    /*final*/ void f1(){
        x=10;
    }
    void f2(){
        System.out.println(x);
    }
}

class Child extends Parent{
    int y;
    void f1(){super.f1();y=20;}
    void f2(){super.f2();System.out.println(y);}
}

public class FinalTest1 {
    public static void main(String[] args) {
        Child C = new Child();
        C.f1();
        C.f2();
    }
}
