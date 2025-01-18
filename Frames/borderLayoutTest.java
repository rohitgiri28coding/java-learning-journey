//package Frames;

//import java.applet.*;

import java.awt.*;
    


public class borderLayoutTest extends Frame {

    Frame f;
    Panel p;
    Button b1,b2,b3,b4,b5,b6,b7;
    BorderLayout b;

    public void init(){
        f=new Frame ("Borderlayout Demo");
        f.setSize(600,400);
        f.setVisible(true);
        p=new Panel();
        f.add(p);
        b = new BorderLayout();
        p.setLayout(b);
        b6=new Button("This is button 6");
        b1=new Button("This is the Button1");
        b2=new Button("This is the Button2");
        b3=new Button("This is the Button3");
        b4=new Button("This is the Button4");
        b5=new Button("This is the Button5");
        b7=new Button("This is button 7");
        f.add(b5,"North");
        f.add(b4,"South");
        f.add(b3,"East");
        f.add(b2,"West");
        p.add(b1,"East");
        p.add(b6,"West");
        p.add(b7,"Center");
    }

    public static void main(String []a){
        borderLayoutTest appex = new borderLayoutTest();
        appex.init();
    
    } 
}


