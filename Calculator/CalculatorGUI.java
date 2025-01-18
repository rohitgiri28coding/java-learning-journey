
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends Frame{
    Button[] b;
    Frame f;
    Button m;
    public CalculatorGUI(){
        b=new Button[24];
        m=new Button("jj");
        b[0]=new Button("R");
        f=new Frame("Calculator");
        f.add(b[0]);
        f.add(m);
        f.setVisible(true);
        f.setSize(300,300);
    }
    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
