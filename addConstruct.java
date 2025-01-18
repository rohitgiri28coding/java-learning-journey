import java.util.Scanner;

class Add{
    int num1,num2,sum;
    Scanner input;

    public Add(){
        input = new Scanner(System.in);
    }
    public void getNumber(){
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.print("Enter another number: ");
        num2 = input.nextInt();
    }
    public void calculate(){
        sum = num1 + num2;
    }
    public void showResult(){
        System.out.println(num1+" + "+num2+" = "+sum);
    }
}

public class addConstruct{
    public static void main(String[] args) {
        Add a = new Add();
        a.getNumber();
        a.calculate();
        a.showResult();
    }
}