class calculate{
int add(int a,int b){
    return a+b;
}
}
class cal extends calculate{
    int sub (int a,int b){
        return a-b;
    }
}

public class A1 {
    public static void main(String[] args) {
        cal c= new cal();
       System.out.println(c.add(10, 20));

    }
}
