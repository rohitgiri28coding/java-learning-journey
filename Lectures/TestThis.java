class Test{
    int num;
    public Test(){
        System.out.println("Constructor invoked");
    }
    void get(int num){
        this.num =num;
    }
    void show(){
        //Test t = this();
        System.out.println("the object at "+this+" contains num"+num);
    }
}  public class TestThis{
    
    public static void main(String[] args) {
            //this();
            Test t = new Test();
            t.get(100);
            t.show();
            
        }
    }
