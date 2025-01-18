import javax.swing.JButton;

public class Test  {
    javax.swing.JFrame f;
    public Test(){
        f = new javax.swing.JFrame();
        f.setTitle("Test");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        new Panel();
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Panel();
    }
}
class Panel extends Test{
    javax.swing.JPanel p;
    javax.swing.JButton b1;
    public Panel(){
        b1 = new javax.swing.JButton( "Button");
        b1.setBounds(50,50,100,30);

        p = new javax.swing.JPanel();
        p.setLayout(null);
        p.add(b1);
        f.add(p);
    }
}
