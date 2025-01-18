import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainClass  {
    JFrame  mainFrame;
    JPanel p1,p2;
    JButton submitButtonp1,submitButtonp2,forgotPasswordButton;
    int choice;
    ImageIcon logo;

    public MainClass(){
        mainFrame = new JFrame();   
        logo = new ImageIcon("logo.png");
        mainFrame.setTitle("Library");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(540,540);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.setIconImage(logo.getImage());

        new Panel1();
        mainFrame.add(p1);
        
    }

    

  /*  public void forgotStudentPasswordPanel()
    {
        JLabel l1,usernameLabel,newPasswordLabel,contactLabel;
        JTextField usernameTextField,newPasswordTextField,contactTextField;
        
        p1.setVisible(false);

        l1 = new JLabel("Request Password Change");
        l1.setBounds(60, 25, 397,50);
        l1.setFont(new Font("SansSerif",Font.BOLD,24));
        l1.setHorizontalAlignment(JLabel.CENTER);

        usernameLabel = new JLabel("UserName: ");
        usernameLabel.setBounds(80, 50, 200, 80);
        usernameLabel.setFont(new Font("SansSerif",Font.PLAIN,18));

        usernameTextField = new JTextField();
        usernameTextField.setBounds(160, 50, 200,25);
        usernameTextField.setFont(new Font("SansSerif",Font.PLAIN,18));
   
        contactLabel = new JLabel("Phone Number: ");
        contactLabel.setBounds(60, 100, 200, 80);
        contactLabel.setFont(new Font("SansSerif",Font.PLAIN,18));

        contactTextField = new JTextField();
        contactTextField.setBounds(160, 150, 200, 25);
        contactTextField.setFont(new Font("SansSerif",Font.PLAIN,18));
        
        newPasswordLabel = new JLabel("New Password: ");
        newPasswordLabel.setBounds(60, 200, 200,80);
        newPasswordLabel.setFont(new Font("SansSerif",Font.PLAIN,18));

        newPasswordTextField = new JTextField();
        newPasswordTextField.setBounds(160, 250, 200, 25);
        newPasswordTextField.setFont(new Font("SansSerif",Font.PLAIN,18));

        submitButtonp2 = new JButton("Submit");
        submitButtonp2.setBounds(480, 500, 80, 40);
        submitButtonp2.addActionListener(mainFrame);

        p2 = new JPanel();
        mainFrame.add(p2);
        p2.setLayout(null);
        p2.add(l1);
        p2.add(usernameLabel);
        p2.add(newPasswordLabel);
        p2.add(contactLabel);
        // p2.add(usernameTextField);
        // p2.add(newPasswordTextField);
        // p2.add(contactTextField);
        p2.add(submitButtonp2);
        
    }
    public void forgotAdminPasswordPanel()
    {
        JLabel passwordLabel;
        JTextField passwordTextField;
        p1.setVisible(false);
       

        passwordLabel = new JLabel("Master Key: ");
        passwordLabel.setBounds(60, 120, 150, 80);

        passwordTextField = new JTextField();
        passwordTextField.setBounds(220, 150, 200, 25);

        submitButtonp2 = new JButton("Submit");
        submitButtonp2.setBounds(480, 500, 80, 40);
        submitButtonp2.addActionListener(this);

        p2 = new JPanel();
        this.add(p2);
        p2.setLayout(null);
        p2.add(passwordLabel);
        p2.add(passwordTextField);
        p2.add(submitButtonp2);
        
    }*/
    public static void main(String[] args) {
        new MainClass();
    }
    
}
