package Frames;

//import java.applet.*;

import java.awt.*;
    
import java.awt.event.*;

public class flowLayoutTest extends Frame implements ActionListener{

    Frame f;
    Panel p;
    TextField t1;
    Label l1 ;
    Button b1;
    FlowLayout flow;

    public void init(){
        f=new Frame ("FlowLayout Demo");
        f.setSize(300,300);
        f.setVisible(true);
        p=new Panel();
        f.add(p);
        flow = new FlowLayout(FlowLayout.LEFT,10,10);
        p.setLayout(flow);
        t1=new TextField("0",10);
        l1=new Label("Enter Date");
        b1=new Button("This is the Button");
        p.add(l1);
        p.add(t1);
        p.add(b1);
        b1.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent are){
        t1.setText("Button clicked");
    }

    public static void main(String []a){
        flowLayoutTest appex = new flowLayoutTest();
        appex.init();
    
    } 
}
