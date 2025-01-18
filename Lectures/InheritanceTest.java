class A{
    int x=100;
    int[] arr= {1};
}
class B extends A{
    void printing(){
        System.out.println(x);
        System.out.println(arr[0]);
    }
}


public class InheritanceTest {
    public static void main(String[] args) {
        
    
    
    B bob = new B();
    bob.printing();}
}
