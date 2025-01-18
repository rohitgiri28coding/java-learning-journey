class Calculate{
    java.util.Scanner sc;
    String str;
    int i,j,k,f;
    float [] num;
    char[] op;
    public Calculate(){
        sc = new java.util.Scanner(System.in);
    }
    void get(){
        System.out.print("Enter the expression: ");
        str = sc.nextLine();
        num = new float[(str.length()/2)+1];
        op = new char[(str.length()/2)];
    }
    void seperate(){
        for( i=0,j=0,k=0;i<str.length();i++,j++){
            char ch = str.charAt(i);
            float temp=0;
            int l=-1;
loop:       for(;i<str.length();i++){
                ch=str.charAt(i);
                if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                    op[k]=ch;
                    f=0;
                    k++;
                    break loop;
                }   
                else{
                    if(ch=='.'){
                      f=1;
                      i++;
                      ch=str.charAt(i);
                    }
                    if(f==1){                       
                        temp += (Character.getNumericValue(ch)*Math.pow(10, l));
                        l--;
                    }
                    else{
                        temp = temp*10 + Character.getNumericValue(ch);
                    }
            }
        }
            num[j]= temp;
        }  
    }
    void show(float res){
        System.out.println(str+" = "+res);
    }
}
class Bodmas{
    float[] num;
    int j;
    int[] index;
    private char[] op;
    float freq, result;
    char sign;
    public Bodmas(char[] op,float[] num){
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
    float cal(){
        if(sign == '/'){
            for(int i=0;i<freq;i++){
                result =  (num[index[i]]/num[index[i]+1]);
                num[index[i]]=result;
                num[index[i]+1]= result; 
                try{
                    int n = index[i] - 1;
                    while(true){
                        if(op[n] == '/'){
                            num[n]= result;
                            n--;
                        }
                        else{
                            break;
                        }
                    }
                }catch (ArrayIndexOutOfBoundsException exp){}
            }
        }
        else if(sign == '*'){
            for(int i=0;i<freq;i++){
                result = num[index[i]]*num[index[i]+1];
                num[index[i]]=result;
                num[index[i]+1]= result;
                try{
                    int n = index[i] - 1;
                    while(true){
                        if(op[n] == '/' || op[n] == '*'){
                            num[n]= result;
                            n--;
                        }
                        else{
                            break;
                        }
                    }
                }catch (ArrayIndexOutOfBoundsException exp){}
            try{
                int n = index[i] + 1;
                while(true){
                    if(op[n] == '/'){
                        num[n+1]= result;
                        n++;
                    }
                    else{
                        break;
                    }
                }
            }catch (ArrayIndexOutOfBoundsException exp){}
            }
    
        }
        else if(sign == '-'){
            for(int i=0;i<freq;i++){
                result = num[index[i]]-num[index[i]+1];
                num[index[i]]=result;
                num[index[i]+1]= result;
                try{
                    int n = index[i] - 1;
                    while(true){
                        if(op[n] == '/' || op[n] == '*' || op[n] == '-'){
                            num[n]= result;
                            n--;
                        }
                        else{
                            break;
                        }
                    }
                }catch (ArrayIndexOutOfBoundsException exp){}
            try{
                int n = index[i] + 1;
                while(true){
                    if(op[n] == '/' || op[n] == '*'){
                        num[n+1]= result;
                        n++;
                    }
                    else{
                        break;
                    }
                }
            }catch (ArrayIndexOutOfBoundsException exp){}
            }
        }
        else if(sign == '+'){
            for(int i=0;i<freq;i++){
                result = num[index[i]]+num[index[i]+1];
                num[index[i]]=result;
                num[index[i]+1]= result;
                try{
                    int n = index[i] - 1;
                    while(true){
                        if(op[n] == '/' || op[n] == '*' || op[n] == '-' || op[n] == '+'){
                            num[n]= result;
                            n--;
                        }
                        else{
                            break;
                        }
                    }
                }catch (ArrayIndexOutOfBoundsException exp){}
            try{
                int n = index[i] + 1;
                while(true){
                    if(op[n] == '/' || op[n] == '*' || op[n] == '-'){
                        num[n+1]= result;
                        n++;
                    }
                    else{
                        break;
                    }
                }
            }catch (ArrayIndexOutOfBoundsException exp){}
            }
        }
        return result;
    }
}

public class FloatBodmasCalcuator {
    void solveBracket(String exp){
        StringBuffer s = new StringBuffer(exp);
        while (true){
            String bo ="(", bc = ")";
            String subStr;
            if (s.toString().contains(bo)){
                int first = s.indexOf(bo)+1;
                int last = s.indexOf(bc);
                subStr = s.substring(first, last);
            int first1 = 0;
            while (true){ 
                    if (subStr.contains(bo)){
                    first1 = subStr.indexOf(bo) + 1;
                    subStr = subStr.substring(first1);
                    }
                    else{
                        seperate(s.toString());
                        cal('/');                       
                        cal('*');                       
                        cal('+');                   
                        cal('-');
                        s = s.replace(first+first1-1, last+1, String.valueOf(result));
                        System.out.println(s);
                        break;
                    }
                }
            }
            else{
                exp = s.toString();
                break;
            }
        }
    }
    public static void main(String[] args) {
        FloatBodmasCalcuator f_obj = FloatBodmasCalcuator();
        Calculate c_obj = new Calculate();
        c_obj.get();

        c_obj.seperate();
        Bodmas b_obj = new Bodmas(c_obj.op, c_obj.num);
        b_obj.check('/');
        b_obj.cal();
        b_obj.check('*');
        b_obj.cal();
        b_obj.check('-');
        b_obj.cal();
        b_obj.check('+');
        float res = b_obj.cal();
        c_obj.show(res);
    }
}

