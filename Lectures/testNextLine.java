import java.util.Scanner;

public class testNextLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter college name: ");
        String collegeName = sc.next();
        System.out.println(name);
        System.out.println(collegeName);
    }
}
