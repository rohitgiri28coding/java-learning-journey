import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener{
	Frame f;
	Button addition,sub,mul,div;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	FlowLayout fl;	
	
	public Calculator(){
		f= new Frame();
		f.setSize(300,280);
		f.setVisible(true);
		fl = new FlowLayout();
		f.setLayout(fl);
		addition = new Button("+");
		sub = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		t1 = new TextField("",10);
		t2 = new TextField("",10);
		l1 = new Label("Enter number");
		l2 = new Label("Enter another number");
		l3 = new Label("Result");
		t3 = new TextField("",10);
		t3.setEditable(false);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(addition);
		f.add(sub);
		f.add(mul);
		f.add(div);
		addition.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		double num1,num2,result=0;
		num1 = Double.parseDouble(t1.getText());
		num2 = Double.parseDouble(t2.getText());
		if(ae.getSource() == addition){
			result = num1 +num2;
		}
		else if(ae.getSource() == sub){
			result = num1 - num2;
		}
		else if(ae.getSource() == mul){
			result = num1 * num2;
		}
		else if(ae.getSource() == div){
			result = num1/num2;
		}
		t3.setText(Double.toString(result));	
	}
	public static void main(String [] args){
		new Calculator();
	}
}
