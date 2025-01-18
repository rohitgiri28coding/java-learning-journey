
import java.awt.*;

import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    Frame f;
    Button b1,b2,b3,b4;
    TextField t1,t2,t3;
    Label l1,l2,l3;
    FlowLayout fl;

    public void init(){
        f= new Frame();
        f.setSize(280,280);
        f.setVisible(true);
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        t3 = new TextField("",10);
        t1 = new TextField("",10);
        t2= new TextField("",10);
        l1 = new Label("Enter number");
        l2 = new Label("Enter another number");
        l3 = new Label("Result");
        fl =new FlowLayout();
        f.setLayout(fl);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(l3);
        f.add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
            System.exit(0);
            }
            }
            );
    }
    public void actionPerformed(ActionEvent ae){
        double num1 = Double.parseDouble(t1.getText()); 
        double num2 = Double.parseDouble(t1.getText()); 
        double res=0;
        if(ae.getSource() == b1 ){
            res = num1+num2;
        }
        else if(ae.getSource() == b2 ){
            res = num1-num2;
        }
        else if(ae.getSource() == b3 ){
            res = num1*num2;           
        }
        else if(ae.getSource() == b4 ){
            res = num1/num2;
        }
        t3.setText(Double.toString(res));
    }
    // public void windowClosing(WindowEvent we){
    //     System.exit(0);
    //     }
    public static void main(String[] args) {
       Calculator c= new Calculator();
       c.init();
       
    }
}
