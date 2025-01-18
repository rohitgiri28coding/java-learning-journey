
public class P1 extends F1{
    javax.swing.JPanel p;
    javax.swing.JPasswordField passwordF;
    public P1(){
        passwordF = new javax.swing.JPasswordField();
        passwordF.setBounds(50,100,50,10);
        
        p = new javax.swing.JPanel();
        p.setSize(500, 500);
        p.setLayout(null);
        p.add(passwordF);
       
        
    }
}
