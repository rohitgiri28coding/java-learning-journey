import java.awt.*; 
import java.awt.event.*; 
public class Cardlayout extends Frame{ 
private int cc = 1; 
private CardLayout cl; 
public Cardlayout() { 
setTitle("Card Layout Example"); 
setSize(500, 150); 
final Panel cp = new Panel(); 
cl = new CardLayout(); 
cp.setLayout(cl); 
Panel p1 = new Panel(); 
Panel p2 = new Panel(); 
Panel p3 = new Panel(); 
Panel p4 = new Panel(); 
Label l1 = new Label("Card1");
Label l11 = new Label("Name : ");
Label l12 = new Label("Address : ");
TextField t11 = new TextField(10);
TextField t12 = new TextField(10);
Label l2 = new Label("Card2"); 
Label l21 = new Label("Roll : ");
Label l22 = new Label("Session : ");
TextField t21 = new TextField(10);
TextField t22 = new TextField(10);
Label l3 = new Label("Card3"); 
Label l31 = new Label("Semester : ");
Label l32 = new Label("Marks : ");
TextField t31 = new TextField(10);
TextField t32 = new TextField(10);
Label l4 = new Label("Card4"); 
Label l41 = new Label("Percent : ");
Label l42 = new Label("CGPA : ");
TextField t41 = new TextField(10);
TextField t42 = new TextField(10);
p1.add(l1); p1.add(l11); p1.add(t11); p1.add(l12); p1.add(t12);
p2.add(l2); p2.add(l21); p2.add(t21); p2.add(l22); p2.add(t22);
p3.add(l3); p3.add(l31); p3.add(t31); p3.add(l32); p3.add(t32);
p4.add(l4); p4.add(l41); p4.add(t41); p4.add(l42); p4.add(t42);
cp.add(p1, "1"); 
cp.add(p2, "2"); 
cp.add(p3, "3"); 
cp.add(p4, "4"); 
Panel bp = new Panel(); 
Button fb = new Button("First"); 
Button nb = new Button("Next"); 
Button pb = new Button("Previous"); 
Button lb = new Button("Last"); 
bp.add(fb); 
bp.add(nb); 
bp.add(pb); 
bp.add(lb); 
fb.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent ae){ 
cl.first(cp); 
cc = 1; 
} 
}
); 
lb.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent ae){ 
cl.last(cp); 
cc = 4; 
} 
}
); 
nb.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent ae){ 
if (cc < 4){ 
cc += 1; 
cl.show(cp, "" + (cc)); 
} 
} 
}
); 
pb.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent ae){ 
if (cc > 1){ 
cc -= 1; 
cl.show(cp, "" + (cc)); 
} 
} 
}
); 
this.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);
}
}
);
add(cp, BorderLayout.NORTH); 
add(bp, BorderLayout.SOUTH); 
} 
public static void main(String[] args) { 
Cardlayout cl = new Cardlayout(); 
cl.setVisible(true); 
} 
}