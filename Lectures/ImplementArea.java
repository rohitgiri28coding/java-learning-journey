import java.util.Scanner;

interface  Shape{
    Scanner sc = new Scanner(System.in);
    abstract double area();
    abstract double perimeter();
    abstract void get();
}

class Rectangle implements Shape{
    double l,b;
    int ch;
    public void choice(int a){
        ch = a;
    }
    public void get(){
        System.out.print("Enter length: ");
        l = sc.nextDouble();
        if(ch == 1){
        System.out.print("Enter breadth: ");
        b= sc.nextDouble();
        }else{
            b = l;}
    }
    public double area(){return l * b;}
    public double perimeter(){return 2*(l+b);}
}

class Triangle implements Shape{
    double s1,s2,l,b;
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

class Circle implements Shape{
    double pi = 3.14,l;
    public void get(){
        System.out.print("Enter length of radius: ");
        l = sc.nextDouble();
    }
    public double area(){return pi*l*l;}
    public double perimeter(){return 2*pi*l;}
}

class Trapezium implements Shape{
    double s1,s2,s3,l,b;
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


public class ImplementArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Available shapes: Triangle, Rectangle, Square, ||gm, rhombus, trapezium & Circle.");
        System.out.print("Enter the name of 2D shape: ");
        String str = input.next();
        str = str.toLowerCase();
            switch (str){
            case  "circle":
                Circle c = new Circle();
                c.get();
                System.out.println("Area = "+c.area());
                System.out.println("Circumference = "+c.perimeter());
                break;
            case "rectangle","parallelogram","||gm":
                Rectangle r = new Rectangle();
                r.choice(1);
                r.get();
                System.out.println("Area = "+r.area());
                System.out.println("Perimeter = "+r.perimeter());
                break;
            case "square","rhombus":
                Rectangle sq = new Rectangle();
                sq.choice(0);
                sq.get();
                System.out.println("Area = "+sq.area());
                System.out.println("Perimeter = "+sq.perimeter());
                break;
            case "triangle":
                Triangle t = new Triangle();
                t.get();
                System.out.println("Area = "+t.area());
                System.out.println("Perimeter = "+t.perimeter());
                break;
            case "trapezium":
                Trapezium tra = new Trapezium();
                tra.get();
                System.out.println("Area = "+tra.area());
                System.out.println("Perimeter = "+tra.perimeter());
                break;
            default:
                System.out.println("Entered shape is not available. Thank You!");
                break;
        }
    }
}
