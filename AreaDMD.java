import java.util.Scanner;

abstract class Shape{
    Scanner sc;
    public Shape(){
        sc = new Scanner(System.in);
    }
    double l,b;
    protected abstract double area();
    protected abstract double perimeter();
    protected abstract void get();
}

public class Rectangle extends Shape{
    int ch;
    Rectangle(int c){
        ch=c;
    }
    /*
    public void choice(int x){
        ch= x;
    }     
     */
    public void get(){
        System.out.print("Enter length: ");
        l= sc.nextDouble();
        if(ch == 1){
        System.out.print("Enter breadth: ");
        b= sc.nextDouble();
        }else{
            b = l;}
    }
    public double area(){return l * b;}
    public double perimeter(){return 2*(l+b);}
}
class Triangle extends Shape{
    double s1,s2;
    public void get(){
        System.out.print("Enter length of perpendicular: ");
        l= sc.nextDouble();
        System.out.print("Enter length of base: ");
        b= sc.nextDouble();
        System.out.print("Enter length of side 1 (other than base): ");
        s1 = sc.nextDouble();
        System.out.print("Enter length of side 2 (other than base): ");
        s2 = sc.nextDouble();
    }
    public double area(){return 0.5 * l * b;}
    public double perimeter(){return s1+s2+b;}
    
}

class Circle extends Shape{
    double pi = 3.14;
    public void get(){
        System.out.print("Enter length of radius: ");
        l = sc.nextDouble();
    }
    public double area(){return pi*l*l;}
    public double perimeter(){return 2*pi*l;}
}

class Trapezium extends Shape{
    double s1,s2,s3;
    public void get(){
        System.out.print("Enter the length of one parallel side: ");
        s1 = sc.nextDouble();
        System.out.print("Enter the length of another parallel side: ");
        b = sc.nextDouble();
        System.out.print("Enter the distance between the parallel side: ");
        l = sc.nextDouble();
        System.out.print("Enter the length of non parallel side: ");
        s2 = sc.nextDouble();
        System.out.print("Enter the length of another non parallel side: ");
        s3 = sc.nextDouble(); 
    }
    public double area(){return 0.5*(s1+b)*l;}
    public double perimeter(){return s1+s2+s3+b;}

}

public class AreaDMD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shape s_obj;
        System.out.println("Available shapes: Triangle, Rectangle, Square, ||gm, rhombus, trapezium & Circle.");
        System.out.print("Enter the name of 2D shape: ");
        String str = input.next();
        str = str.toLowerCase();
            switch (str){
            case  "circle":
                s_obj = new Circle();
                s_obj.get();
                System.out.println("Area = "+s_obj.area());
                System.out.println("Circumference = "+s_obj.perimeter());
                break;
            case "rectangle","parallelogram","||gm":
                s_obj = new Rectangle(1);
               // s_obj.choice(1);
                s_obj.get();
                System.out.println("Area = "+s_obj.area());
                System.out.println("Perimeter = "+s_obj.perimeter());
                break;
            case "square","rhombus","sq":
                s_obj = new Rectangle(0);
                //s_obj.choice(0);
                s_obj.get();
                System.out.println("Area = "+s_obj.area());
                System.out.println("Perimeter = "+s_obj.perimeter());
                break;
            case "triangle":
                s_obj = new Triangle();
                s_obj.get();
                System.out.println("Area = "+s_obj.area());
                System.out.println("Perimeter = "+s_obj.perimeter());
                break;
            case "trapezium":
                s_obj = new Trapezium();
                s_obj.get();
                System.out.println("Area = "+s_obj.area());
                System.out.println("Perimeter = "+s_obj.perimeter());
                break;
            default:
                System.out.println("Entered shape is not available. Thank You!");
                break;
        }
    }
}
