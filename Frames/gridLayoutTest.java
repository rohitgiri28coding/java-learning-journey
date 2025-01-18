//package Frames;

//import java.applet.*;

import java.awt.*;
    
import java.awt.event.*;

public class gridLayoutTest extends Frame implements ActionListener{

    Frame f;
    Panel p;
    Button b1,b2,b3,b4,b5;
    GridLayout g;

    public void init(){
        f=new Frame ("Gridlayout Demo");
        f.setSize(600,400);
        f.setVisible(true);
        p=new Panel();
        f.add(p);
        g = new GridLayout(3,2);//if not added then it
                            //will printed columnwise
        p.setLayout(g);
        b1=new Button("This is the Button1");
        b2=new Button("This is the Button2");
        b3=new Button("This is the Button3");
        b4=new Button("This is the Button4");
        b5=new Button("This is the Button5");
        p.add(b5);
        p.add(b4);
        p.add(b3);
        p.add(b2);
        p.add(b1);
        b1.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent are){
        
    }

    public static void main(String []a){
        gridLayoutTest appex = new gridLayoutTest();
        appex.init();
    
    } 
}

