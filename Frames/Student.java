//package Frames;

import java.awt.*;

import java.awt.event.*;

public class Student extends Frame implements ActionListener {
    Frame f;
    Panel p1,p2,p3,mainPanel;
    Button b1,b2,b3,b4,b5;
    Dialog d;
    TextField t1,t2,t3,t4;
    Label l1,l2,l3,l4;
    CardLayout c;
    
    public Student(){

        f = new Frame("Marksheet");
        f.setSize(500,500);
        f.setVisible(true);
       
        c = new CardLayout();

        mainPanel = new Panel(c);
        p1= new Panel();
        p2= new Panel();
        p3= new Panel();

        d = new Dialog(f,"Ended",true);

        b1=new Button("Next");
        b2=new Button("Previous");
        b3=new Button("End");
        b4=new Button("Next");
        b5=new Button("Previous");

        b1.setBounds(450, 450,120 , 40);
        b2.setBounds(50, 450,120 , 40);
        b3.setBounds(450, 450,120 , 40);

        t1 = new TextField("", 10);
        t2 = new TextField("", 10);
        t3 = new TextField("",10);
        t4 = new TextField("PASSED",10);
        t4.setEditable(false);

        l1 = new Label("Enter your session");
        l2 = new Label("Enter your roll number");
        l3 = new Label("Enter your name");
        l4 = new Label("Result");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        p1.add(l1);
        p1.add(t1);
        p1.add(b1);

        p2.add(l2);
        p2.add(t2);
        p2.add(l3);
        p2.add(t3);
        p2.add(b2);
        p2.add(b4);

        p3.add(l4);
        p3.add(t4);
        p3.add(b5);
        p3.add(b3);

        mainPanel.add(p1,"pg1");
        mainPanel.add(p2,"pg2");
        mainPanel.add(p3,"pg3");
        
        f.add(mainPanel);
        
        p1.setVisible(true);
        p2.setVisible(true);
        p3.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b1||e.getSource() == b5){//b1=next
            mainPanel.removeAll();
            mainPanel.add(p2);
            c.show(mainPanel,"pg2");
        }
        else if (e.getSource() == b2){//b2=prev
            mainPanel.removeAll();
            mainPanel.add(p1);
            c.show(mainPanel,"pg1");
        }
        else if (e.getSource() == b3){//b3=end
            mainPanel.removeAll();
            f.add(d);
            c.show(f,"");
        }
        else if (e.getSource() == b4){//b4=next
            mainPanel.removeAll();
            mainPanel.add(p3);
            c.show(mainPanel,"pg3");
        }
    }
    public static void main(String[] args) {
        new Student();
    }
}
