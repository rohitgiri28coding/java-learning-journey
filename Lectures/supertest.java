class A{
    int a;
    A(){
        System.out.println("Constructor of A invoked");
        a=10;
    }
    void show(){
        System.out.println(a);
    }
}
class B extends A{
    B(){
        super();// constructor of A()
        System.out.println("Constructor of B invoked");
        
    }
    void show(){
        super.show();
        super.a=20;
        super.show();
    }
}
public class supertest{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}