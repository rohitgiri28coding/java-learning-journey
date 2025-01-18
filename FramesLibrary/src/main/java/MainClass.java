
import javax.swing.*;

public class MainClass   {
     
    private String adminPassword="PscBcALib@85";
    private final String MasterKey ="Rohit@1928";
    JFrame mainFrame ;
    public MainClass(){
        
        mainFrame = new JFrame("Library");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(560,540);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    
        new FirstPanel(); 
    }
    public void setNewPassword(String newPassword){
        adminPassword = newPassword;
    }
    public static void main(String[] args) {
        new MainClass();
    }
}
