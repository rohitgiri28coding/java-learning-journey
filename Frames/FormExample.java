import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormExample extends JFrame implements ActionListener {
  
  private CardLayout cardLayout;
  private JPanel mainPanel, formPanel, displayPanel;
  private JTextField nameField, ageField, emailField;
  
  public FormExample() {
    // Set up the main panel with card layout
    cardLayout = new CardLayout();
    mainPanel = new JPanel(cardLayout);
    
    // Set up the form panel with text fields and submit button
    formPanel = new JPanel();
    formPanel.add(new JLabel("Name:"));
    nameField = new JTextField(20);
    formPanel.add(nameField);
    formPanel.add(new JLabel("Age:"));
    ageField = new JTextField(3);
    formPanel.add(ageField);
    formPanel.add(new JLabel("Email:"));
    emailField = new JTextField(30);
    formPanel.add(emailField);
    JButton submitButton = new JButton("Submit");
    submitButton.addActionListener(this);
    formPanel.add(submitButton);
    
    // Set up the display panel to show the inputted data
    displayPanel = new JPanel();
    
    // Add the panels to the main panel with names
    mainPanel.add(formPanel, "formPanel");
    mainPanel.add(displayPanel, "displayPanel");
    
    // Set up the frame
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Form Example");
    setSize(400, 300);
    setLocationRelativeTo(null);
    setVisible(true);
    add(mainPanel);
  }
  
  public void actionPerformed(ActionEvent e) {
    // Get the inputted data from the text fields
    String name = nameField.getText();
    String age = ageField.getText();
    String email = emailField.getText();
    
    // Set up the display panel with the inputted data
    JLabel nameLabel = new JLabel("Name: " + name);
    JLabel ageLabel = new JLabel("Age: " + age);
    JLabel emailLabel = new JLabel("Email: " + email);
    displayPanel.removeAll();
    displayPanel.add(nameLabel);
    displayPanel.add(ageLabel);
    displayPanel.add(emailLabel);
    
    // Switch to the display panel
    cardLayout.show(mainPanel, "displayPanel");
  }
  
  public static void main(String[] args) {
    new FormExample();
  }
}