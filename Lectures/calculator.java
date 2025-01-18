import java.util.Scanner;

class calculate{
    Scanner sc;
    int num1,num2,res;
    
    public calculate(){
        sc = new Scanner(System.in);
    }
    public void getNumber(){
        System.out.println("Enter a number: ");
        num1= sc.nextInt();
        System.out.println("Enter other number: ");
        num2= sc.nextInt();
    }
    public void add(){
        res = num1 + num2;
    }
    public void diff(){
        res = num1 - num2;
    }
    public void mul(){
        res = num1 * num2;
    }
    public void div(){
       if(num2 != 0)
            res = num1 / num2;
    }
    public void showAdd(){
        System.out.println(num1+" + "+num2+" = "+res);
    }
    public void showDiff(){
        System.out.println(num1+" - "+num2+" = "+res);
    }
    public void showMul(){
        System.out.println(num1+" * "+num2+" = "+res);
    }
    public void showDiv(){
        if(num2 != 0)
        System.out.println(num1+" / "+num2+" = "+res);
    else 
        System.out.println("Check the value entered!"); 
    }
}



public class calculator {
    public static void main(String args[]) {
        calculate c = new calculate();
        c.getNumber();
        System.out.println("Enter 1 for addn\n2 for difference\n3 for multiplication\n4 for division: ");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        switch(choice){
            case 1: 
                c.add();
                c.showAdd();
                break;
            case 2:
                c.diff();
                c.showDiff();
                break;
            case 3:
                c.mul();
                c.showMul();
                break;
            case 4:
                c.div();
                c.showDiv();
                break;
        }
    }
}