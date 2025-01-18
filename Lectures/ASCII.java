import java.util.Scanner;

public class ASCII {
    public static void main(String [] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        ch =  input.next().charAt(0);
        System.out.println((int)ch+" is the ASCII value of "+ch);
    }
}
