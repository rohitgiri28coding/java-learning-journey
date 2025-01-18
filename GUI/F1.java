import javax.swing.*;
public class F1 extends JFrame {

    // javax.swing.JFrame f;
    public F1(){
       // this = new javax.swing.JFrame("Library");
       setSize(785, 740);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        P1 o = new P1();
        getContentPane().add(o);
    }
    public static void main(String[] args) {
        F1 a = new  F1();
        a.setVisible(true);
    }
}
