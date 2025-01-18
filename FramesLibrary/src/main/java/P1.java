import javax.swing.JFrame;

public class P1 {
    javax.swing.JPanel p;
    javax.swing.JPasswordField passwordF;
    public P1(JFrame f){
        passwordF = new javax.swing.JPasswordField();
        passwordF.setBounds(50,100,50,10);
        
        p = new javax.swing.JPanel();
        p.setLayout(null);
        p.add(passwordF);
       
        f.add(p);
        f.revalidate();
        f.repaint();
    }
}