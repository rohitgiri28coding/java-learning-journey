import java.util.Scanner;

public class AddExp {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int sum =0;
            System.out.print("Enter the expression for addition: ");
            String str = sc.nextLine();
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                int temp=0;
loop:       for(;i<str.length();i++){
                    ch=str.charAt(i);
                    if(ch=='+'||ch==' '||ch=='('||ch==')'){
                        break loop;
                    }
                    else
                    temp = temp*10 + Character.getNumericValue(ch);
                }
                sum += temp;
                }     
            System.out.println(str+" = "+sum);
        }
    }
}
