
import java.awt.*;
    
import java.awt.event.*;

public class studentInfo extends Frame implements ActionListener {
    Frame f;
    Panel p1,p2,p3;
    Button b1,b2,b3;
    Dialog d;
    TextField t1,t2,t3,t4;
    Label l1,l2,l3,l4;
    CardLayout c;
    
    public studentInfo(){

        f = new Frame("Marksheet");
        f.setSize(500,500);
        f.setVisible(true);

        p1= new Panel();
        p2= new Panel();
        p3= new Panel();

        c = new CardLayout();
        f.setLayout(c);

        d = new Dialog(f,"Ended",true);

        b1=new Button("Next");
        b2=new Button("Previous");
        b3=new Button("End");

        b1.setBounds(450, 450,120 , 40);
        b2.setBounds(50, 450,120 , 40);
        b3.setBounds(450, 450,120 , 40);

        t1 = new TextField("Enter your session", 10);
        t2 = new TextField("Enter your roll number", 10);
        t3 = new TextField("Enter your name",10);
        t4 = new TextField("PASSED",10);
        t4.setEditable(false);

        l1 = new Label("Enter your session");
        l2 = new Label("Enter your roll number");
        l3 = new Label("Enter your name");
        l4 = new Label("Result");

        // p1.setLayout(null);
        // p2.setLayout(null);
        // p3.setLayout(null);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        
        p2.add(l1);
        p2.add(t1);
        p2.add(b2);
        p2.add(b1);

        p3.add(l4);
        p3.add(t4);
        p3.add(b3);
        p3.add(b2);

        f.add(p1,"p1");
        f.add(p2,"p2");
        f.add(p3,"p3");
        
        p1.setVisible(true);
        p2.setVisible(true);
        p3.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b1){
           c.next(f);
        }
        else if (e.getSource() == b2){
            c.previous(f);
         }
         else if (e.getSource() == b3){
            p3.add(d);
         }
    }
    public static void main(String[] args) {
        new studentInfo();
    }
}
