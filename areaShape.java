/*wap to declare and use a shape class for calculating area and
perimeter for diff types of shape- rect , sq,etc
follow the hierarchy as shown below for declaring the classes */

import java.util.Scanner;

abstract class Shape {
    Scanner sc;
    public Shape(){
    sc =new Scanner(System.in);
    }
    protected double l, b;
    protected abstract double area();
    protected abstract double peri();
    protected abstract void get();
}

class Square extends Shape {

public void get() {
l= sc.nextDouble();
}

public double area() { return l*l; }
public double peri() { return 4*l;} 
}

class Rectangle extends Shape {

    public void get() {
    System.out.println("Enter length: ");
    l= sc.nextDouble();
    System.out.println("Enter breadth: ");
    b= sc.nextDouble();
    }
    
    public double area() { return l*b; }
    public double peri() { return 2*(l+b); }
    }


public class areaShape{
public static void main(String args[]){
Square sq = new Square();
Rectangle r = new Rectangle();
r.get();
sq.get();
System.out.println("Area : " + (sq.area()+r.area()));
System.out.println("Perimeter : " + sq.peri());
}
}