import java.util.Scanner;

class average {
    float num1,num2,num3,avg;
    Scanner sc;

public average(){
    sc = new Scanner (System.in);}

public void getNumber(){
    System.out.println("Enter three number: ");
    num1 =sc.nextFloat();
    num2 = sc.nextFloat();
    num3 = sc.nextFloat();}

public void calculate(){
    avg = (num1+num2+num3)/3;}

public void showResult(){
    System.out.println("Average of ("+num1+" , "+num2+" & "+num3+") = "+avg);} 

}

public class avg {
    public static void main(String args[]) {
        average av = new average();
        av.getNumber();
        av.calculate();
        av.showResult();
        
    }
    
}