import javax.swing.*;
public class FirstPanel extends MainClass{

    JPanel FirstPanelp;
    public FirstPanel() {
        FirstPanelp = new JPanel();
        initComponents();
        super.mainFrame.add(FirstPanelp);
    }

    private void initComponents() {

        loginLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        javax.swing.JButton submitButtonp1 = new javax.swing.JButton();
        forgotButton = new javax.swing.JButton();

        loginLabel.setFont(new java.awt.Font("Bell MT", 1, 36)); 
        loginLabel.setText("Login:");

        usernameLabel.setFont(new java.awt.Font("Serif", 0, 18)); 
        usernameLabel.setText("UserName:");

        usernameTextField.setFont(new java.awt.Font("Serif", 0, 18)); 
        

        passwordLabel.setFont(new java.awt.Font("Serif", 0, 18)); 
        passwordLabel.setText("Password:");

        passwordField.setFont(new java.awt.Font("Serif", 0, 18)); 

        submitButtonp1.setFont(new java.awt.Font("Serif", 0, 18)); 
        submitButtonp1.setText("Submit");
        submitButtonp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonp1ActionPerformed(evt);
            }
        });

        forgotButton.setFont(new java.awt.Font("Serif", 0, 18)); 
        forgotButton.setText("Forgot Password?");
        forgotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout();
        FirstPanelp.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameTextField)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(forgotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButtonp1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forgotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButtonp1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
    }

   

    private void submitButtonp1ActionPerformed(java.awt.event.ActionEvent evt) {
          username = usernameTextField.getText();
         // enteredPassword = (passwordField.getPassword());   
    }

    private void forgotButtonActionPerformed(java.awt.event.ActionEvent evt) {
         String [] responses = {
                "Admin","Student","Cancel"
            };
        int   choice = JOptionPane.showOptionDialog(FirstPanelp,"Forgot Password", "Password", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE, null, responses, evt);
        if(choice == 1){
            FirstPanelp.setVisible(false);
           // new ForgotStudentPanel();
        }
        else if(choice == 0){
             FirstPanelp.setVisible(false);
           // new ForgotAdminPanel();
        }
    }
    private javax.swing.JButton forgotButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameTextField;
    String username,enteredPassword;
}
