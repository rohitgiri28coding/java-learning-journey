
//import java.applet.*;

import java.awt.*;
    
import java.awt.event.*;

public class cardLayoutTest extends Frame implements ActionListener{

    Frame f;
    Panel p;
    Button b1,b2,b3;
    CardLayout c;

    public void init(){
        f=new Frame ("CardLayout Demo");
        f.setSize(300,300);
        f.setVisible(true);
        p=new Panel();
        f.add(p);
        c = new CardLayout();
        p.setLayout(c);
        b1=new Button("This is the Button1");
        b2=new Button("This is the Button2");
        b3=new Button("This is the Button3");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent are){
        c.next(p);
    }

    public static void main(String []a){
        cardLayoutTest appex = new cardLayoutTest();
        appex.init();
    
    } 
}
