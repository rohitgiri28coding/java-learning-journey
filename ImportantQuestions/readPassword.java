import java.io.Console;

public class readPassword {
    public static void main(String[] args) {
        Console cnsl = System.console();
  
        if (cnsl == null) {
            System.out.println(
                "No console available");
            return;
        }
  
        // Read line
        String str = cnsl.readLine(
            "Enter username : ");
  
        // Print username
        System.out.println(
            "Username : " + str);
  
        // Read password
        // into character array
        char[] ch = cnsl.readPassword(
            "Enter password : ");
        String str1 = String.valueOf(ch);
        // Print password
        System.out.println(
            "Password : " + str1);
    }
}
