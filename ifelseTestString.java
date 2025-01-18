import java.util.*;

class Operation{

    Scanner sc = new Scanner (System.in);
    int a,i,result;
    int num [];

    void input(){
        System.out.println("Enter no. of Operation to be performed : ");
        i = sc.nextInt();  
    }
    
    void get(){
       
        num = new int [i];
        for(a=0;a<i;a++){
            System.out.print("Enter a number : ");
            num[a] = sc.nextInt();
           
        }
    }
   
    void Addition(){
        for(a=0;a<i;a++){
        result =  result + num[a];
         }
         System.out.print("The sum is "+result);
}

    void subtraction (){
        result = num[0];
    for(a=1;a<i;a++){
        result = result - num[a]; 
    }
    System.out.println("The difference is : "+result);
}

    void product (){
        result = num[0];
        for(a=1;a<i;a++){
            result*=num[a];
        }
        System.out.println("Product is : "+result);
    }


    void division (){
        result = num[0];
        for(a=1;a<i;a++){
            result =result/num[a];
        }
        System.out.println("Division is : "+result);
    }
}
public class ifelseTestString {
    public static void main(String args []){
      
        Operation operation_obj = new Operation();
        operation_obj.input();
        if (operation_obj.i>0){
            System.out.print("Enter operation to be performed : ");
            String s=operation_obj.sc.next();
            s= s.toLowerCase();
            System.out.println(s.equals("add"));
            operation_obj.get();
            switch (s) {
                case "add","addition":              
                    operation_obj.Addition();
                    break;

                case "subtraction","subtract":
                    operation_obj.subtraction();
                    break;

                case "multiply","multiplication":
                    operation_obj.product();
                    break;
                
                case "divide","division":
                    operation_obj.division();
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
           }
            
        }
        else{
            System.out.println("Wrong Input");
        }       
    }
}