import java.util.Scanner;

public class AddExp1digit{
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter exp for addition: ");
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='+'||ch==' '){
                continue;
            }
            else{
                sum +=  Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
    }
}