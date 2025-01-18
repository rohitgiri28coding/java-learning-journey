import java.util.*;
public class circumference {
public static float circum(float r) {
        return (float)6.28*r;
    }

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    float r;
    System.out.println("Enter radius: ");
    r = sc.nextFloat();
    System.out.println(circum(r)+" is the circumference for the circle of radius "+r);
}    
}
