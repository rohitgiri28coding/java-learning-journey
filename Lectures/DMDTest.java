/*   // CONCLUSION
 * Only overridden method can be called with superclass object
   (if superclass object is instatiated with it's sub class
    constructor)
 */


class A{
    int x;
    void f(){
        System.out.println("f  x = "+x);
    }
}
class B extends A{
    void f1(){
        System.out.println("f1: x = "+x);
    }
    void f(){
        x=20;
        System.out.println("Overridding in B: x = "+x);
    }
}
class C extends A{
    void f2(){
        System.out.println("f2: x = "+x);
    }
}
public class DMDTest {
 public static void main(String[] args) {
    A a_obj ;
    a_obj = new B();
    //a_obj.f1(); //The method f1() is undefined for the type A
    a_obj.f();
 }   
}
