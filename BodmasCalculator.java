import java.util.Scanner;

class Calculate{
    Scanner sc;
    String str;
    int i,j,k;
    int [] num;
    char[] op;
    public Calculate(){
        sc = new Scanner(System.in);
    }
    void get(){
        System.out.print("Enter the expression: ");
        str = sc.nextLine();
        num = new int[str.length()];
        op = new char[str.length()];
    }
    void seperate(){
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
    }
    void show(int result){
        System.out.println(str+" = "+result);
    }
}
class Bodmas{
    int[] num,index;
    char[] op;
    int freq,result;
    char sign;
    public Bodmas(char[] op,int[] num){
        this.op=op;
        this.num=num;
        index= new int[num.length];
    }
    void check(char sign){
        int flag =0;
        this.sign=sign;
        for(int i=0;i<op.length;i++){
            if(op[i] == sign){
                index[flag]=i;
                flag++;
            }
        }
        freq = flag;
    }
    int cal(){
        if(sign == '/'){
            for(int i=0;i<freq;i++){
                result = num[index[i]]/num[index[i]+1];
                num[index[i]]=result;
                num[index[i]+1]= result;
            }
        }
        else if(sign == '*'){
            for(int i=0;i<freq;i++){
                result = num[index[i]]*num[index[i]+1];
                num[index[i]]=result;
                num[index[i]+1]= result;
            }
        }
        else if(sign == '+'){
            for(int i=0;i<freq;i++){
                result = num[index[i]]+num[index[i]+1];
                num[index[i]]=result;
                num[index[i]+1]= result;
            }
        }
        else if(sign == '-'){
            for(int i=0;i<freq;i++){
                result = num[index[i]]-num[index[i]+1];
                num[index[i]]=result;
                num[index[i]+1]= result;
            }
        } 
        return result;
    }
}

public class BodmasCalculator {
    public static void main(String[] args) {
            Calculate c_obj = new Calculate();
            System.out.println("Divison '/' returns quotient.");
            c_obj.get();
            c_obj.seperate();
            Bodmas b_obj = new Bodmas(c_obj.op, c_obj.num);
            b_obj.check('/');
            b_obj.cal();
            b_obj.check('*');
            b_obj.cal();
            b_obj.check('+');
            b_obj.cal();
            b_obj.check('-');
            int res = b_obj.cal();
            c_obj.show(res);
    }
}
