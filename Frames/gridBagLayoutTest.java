//package Frames;

//import java.applet.*;

import java.awt.*;
    


public class gridBagLayoutTest extends Frame {

    Frame f;
    Panel p;
    
    Button b1,b2,b3,b4,b5,b6;
    GridBagLayout g1;
    GridBagConstraints gbc;

    public void init(){
        f=new Frame ("Calculator");
        f.setSize(300,300);
        f.setVisible(true);
        p=new Panel();
        f.add(p);
        g1 = new GridBagLayout();
        p.setLayout(g1);
        gbc = new GridBagConstraints();
        b6=new Button("This is button 6");
        b1=new Button("This is the Button1");
        b2=new Button("This is the Button2");
        b3=new Button("This is the Button3");
        b4=new Button("This is the Button4");
        b5=new Button("This is the Button5");
        
        gbc.fill = GridBagConstraints.CENTER;
        gbc.gridwidth=1;
        gbc.weightx = 1;
        g1.setConstraints(b1, gbc);
        p.add(b1);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        g1.setConstraints(b2, gbc);
        add(b2);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        g1.setConstraints(b3, gbc);
        add(b3);
        
        gbc.weightx=0;
        gbc.weighty=1;
        gbc.gridheight =2;
        gbc.gridwidth=1;
        g1.setConstraints(b4, gbc);
        add(b4);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight =1;
        g1.setConstraints(b5, gbc);
        add(b5);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight =1;
        g1.setConstraints(b6, gbc);
        add(b6);

    }
    

    public static void main(String []a){
        gridBagLayoutTest appex = new gridBagLayoutTest();
        appex.init();
    
    } 
}
