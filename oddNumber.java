import java.util.Scanner;

class Number{
    Scanner sc;
    int lowLimit,upLimit,choice;
    
    public Number(){
        sc = new Scanner(System.in);
    }

    public void getLimit(){
        System.out.println("Enter the lower limit: ");
        lowLimit = sc.nextInt();
        System.out.println("Enter the upper limit: ");
        upLimit = sc.nextInt();
    }
    public void choice(){
        
        
    }
    public void evenNumber(){
        for(;lowLimit >= upLimit;lowLimit++){
            if(lowLimit % 2 == 0){
            System.out.print(lowLimit);
            if(lowLimit == upLimit)
                continue;
            else
                System.out.print(",");}
            }
    }
    public void oddNumber(){
        for(;lowLimit >= upLimit;lowLimit++){
            if(lowLimit % 2 != 0){
            System.out.print(lowLimit);
            if(lowLimit == upLimit)
                continue;
            else
                System.out.print(",");}
            }
    }
}

public class oddNumber {
    public static void main(String args[]) 
    {
        int choice;
        Number n = new Number();
        n.getLimit();
        n.choice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to print even number else enter 2 to print odd number ");
        choice = sc.nextInt();
        if(choice == 1)
            n.evenNumber();
        else if(choice == 2)
            n.oddNumber();
        else
            System.out.println("Invalid input");
    }
}
