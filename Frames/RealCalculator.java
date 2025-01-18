import java.awt.*;
import java.awt.event.*;

public class RealCalculator extends Frame implements ActionListener{
    Frame f;
    GridBagLayout g;
    GridBagConstraints gbc;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,addition,sub,mul,div,clear,backspace,point,res;
    TextField t;

    public RealCalculator(){
        f = new Frame("Calculator");
        //f.setSize(580,650);
        f.setVisible(true);
        g = new GridBagLayout();
        f.setLayout(g);
        gbc = new GridBagConstraints();

        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        addition = new Button("+");
        sub = new Button("-");
        mul = new Button("X");
        div = new Button("/");
        clear = new Button("C");
        
        point = new Button(".");
        res = new Button("=");

        t = new TextField("0", 10);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipady = 40;
        gbc.gridwidth = 6;
        gbc.gridx = 0;
        gbc.gridy = 0;
        g.setConstraints(t, gbc);
        f.add(t);

        backspace = new Button("Backspace");
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.gridx = 0;
        gbc.gridy = 5;
        g.setConstraints(t, gbc);
        f.add(backspace);

        //gbc.gridwidth = 1;
        f.add(clear);
        // f.add(div);
        // f.add(b7);
        // f.add(b8);
        // f.add(b9);
        // f.add(mul);
        // f.add(b4);
        // f.add(b5);
        // f.add(b6);
        // f.add(sub);
        // f.add(b1);
        // f.add(b2);
        // f.add(b3);
        // f.add(addition);
        // f.add(point);
        // f.add(b0);
        // f.add(res);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        clear.addActionListener(this);
        backspace.addActionListener(this);
        point.addActionListener(this);
        addition.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        res.addActionListener(this);

       f.pack();
    }
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[] args) {
        new RealCalculator();
    }
}
