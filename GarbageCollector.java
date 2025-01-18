class Student{
    int roll;
    public Student(int r){
        roll = r;
        System.out.println("Object created : "+this);
    }
    public void show(){
        System.out.println("Roll: "+roll+" for "+this);
    }
    public void finalize(){
        System.out.println("Object destroyed");
    }
}
public class GarbageCollector{
    public static void main(String[] args) {
        Student s1 = new Student(10);
        Student s2 = new Student(20);
        s1 = s2;
        System.gc();
        s1.show();
        s2.show();
    }
}