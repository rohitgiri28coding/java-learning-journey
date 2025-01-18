import java.awt.*;
//import java.Applet.*;
import java.awt.event.*;
public class f implements ActionListener, KeyListener{
Frame f; 
Panel p; 
TextField t1,t2,t3;
Label l1,l2,l3;
Button b1, b2, b3, b4, b5;
double x, y, res; 
public void init(){
f=new Frame("Calculator");
f.setSize(200,200);
f.setVisible(true); 
p=new Panel();
f.add(p);
t1=new TextField("0",10);
 t2=new TextField("0",10);
t3=new TextField("0",10);
l1=new Label("Enter No. 1");
 l2=new Label("Enter No. 2");
l3=new Label("Result is :");
b1=new Button("+");
b2=new Button("-");
b3=new Button("x");
b4=new Button("/");
b5=new Button("Exit");
p.add(l1); p.add(t1);
p.add(l2); p.add(t2);
p.add(l3); p.add(t3);
p.add(b1); p.add(b2);
p.add(b3); p.add(b4);
p.add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
t1.addKeyListener(this);
t2.addKeyListener(this);
t3.addKeyListener(this);
}
public void actionPerformed(ActionEvent ae){
if(ae.getSource() == b5){
p.removeAll(); //removes all components
f.remove(p); //removes the panel
f.dispose(); //destroys the frame
}
x=Double.parseDouble(t1.getText());
y=Double.parseDouble(t2.getText());
if(ae.getSource() == b1) res = x + y;
if(ae.getSource() == b2) res = x - y;
if(ae.getSource() == b3) res = x * y;
if(ae.getSource() == b4) res = x / y;
t3.setText(String.valueOf(res));
}
public void keyPressed(KeyEvent ke){
/*No entry allowed in TextField t3*/
if(ke.getSource() == t3) 
ke.setKeyCode(8);
/*numeric validation code, only numbers and . allowed.
Text entry not allowed in TextField t1 and t2*/
else if ( !(ke.getKeyCode()>=48 && ke.getKeyCode()<=57) && !(ke.getKeyCode()==46))
ke.setKeyCode(8);
}
public void keyReleased(KeyEvent ke){} //as it is received from interface, must be overloaded
public void keyTyped(KeyEvent ke){} //as it is received from interface, must be overloaded
public static void main(String args[]){
f fc = new f();
fc.init();
}
}