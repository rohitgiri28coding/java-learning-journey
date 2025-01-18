import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
public class Panel1 extends MainClass implements ActionListener{
    JPanel p1;
    JButton submitButton,forgotPasswordButton;
    public Panel1(){
        JLabel loginLabel,usernameLabel,passwordLabel;
        JTextField usernameTextField;
        JPasswordField passwordTextField;
        

        loginLabel = new JLabel("Login : ");
        loginLabel.setBounds(30, 10, 100, 80);
        loginLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        
        usernameLabel = new JLabel("Enter Username: ");
        usernameLabel.setBounds(60, 60, 150, 80);
        usernameLabel.setFont(new Font("SansSerif",Font.PLAIN,18));

        usernameTextField = new JTextField();
        usernameTextField.setBounds(220, 90, 200, 25);
        usernameTextField.setFont(new Font("SansSerif",Font.PLAIN,18));

        passwordLabel = new JLabel("Enter password: ");
        passwordLabel.setBounds(60, 120, 150, 80);
        passwordLabel.setFont(new Font("SansSerif",Font.PLAIN,18));

        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(220, 150, 200, 25);
        passwordTextField.setFont(new Font("SansSerif",Font.PLAIN,18));
        passwordTextField.setEchoChar('*');

        submitButton = new JButton("Submit");
        submitButton.setBounds(420, 420, 80, 40);
       // submitButton.addActionListener(new ActionListener());

        forgotPasswordButton = new JButton("Forgot Password?");
        forgotPasswordButton.setBounds(50, 440, 150, 40);
        //forgotPasswordButton.addActionListener(new ActionListener());

        p1 = new JPanel();
        p1.setLayout(null);
        p1.add(loginLabel);
        p1.add(usernameLabel);
        p1.add(usernameTextField);
        p1.add(passwordLabel);
        p1.add(passwordTextField);
        p1.add(submitButton);
        p1.add(forgotPasswordButton);
        super.mainFrame.add(p1);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== submitButtonp1){
            super.mainFrame.dispose();
        }
        else if(e.getSource()== forgotPasswordButton){
            String [] responses = {
                "Admin","Student","Cancel"
            };
            choice = JOptionPane.showOptionDialog(p1,"Forgot Password", "Password", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE, null, responses, e);
            if(choice == 1){
                //forgotStudentPasswordPanel();
            }
            else if(choice == 0){
                //forgotAdminPasswordPanel();
            }
        }
    }

}
