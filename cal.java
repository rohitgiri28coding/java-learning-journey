import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i,j,k,res;
            int [] num;
            char[] op;
            System.out.print("Enter the expression: ");
            String str = sc.nextLine();
            num = new int[str.length()];
            op = new char[str.length()];
                for( i=0,j=0,k=0;i<str.length();i++,j++){
                    char ch = str.charAt(i);
                    int temp=0;
   loop:       for(;i<str.length();i++){
                        ch=str.charAt(i);
                        if(ch=='+'||ch==' '||/*ch=='('||ch==')'||*/ch=='-'||ch=='*'||ch=='/'){
                            op[k]=ch;
                            k++;
                            break loop;
                        }
                        else
                        temp = temp*10 + Character.getNumericValue(ch);
                    }
                    num[j]= temp;
                    }  
            res = num[0];
            for(i=0;i<num.length;i++){
                if(op[i]== '+'){
                    res += num [i+1];
                }
                else if(op[i] == '-'){
                    res -= num[i+1];
                }
                else if(op[i] == '*'){
                    res *= num[i+1];
                }
                else if(op[i] == '/'){
                    try{
                    res /= num[i+1];}
                    catch(Exception e){
                        System.out.println(e+"\nSo undefined solution.");
                        i=0;
                        break;
                    }
                }
            }
            if(i!=0)
                System.out.println(str+" = "+res);
        }
    }
}