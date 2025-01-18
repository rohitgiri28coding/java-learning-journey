// Code extendability
class A{
    int a;
    void get(int x){
        a=x;
    }
    void show(){
        System.out.println("a of A is: "+a);
    }
}
class B extends A{
    int b;
    void get(int x,int y){
        super.get(x);
        b=y;
    }
    void show(){
        super.show();
        System.out.println("b of B is: "+b);
    }
}


public class resuse {
    public static void main(String[] args) {
        B bobj = new B();
        bobj.get(10,20);
        bobj.show();
    }
}
