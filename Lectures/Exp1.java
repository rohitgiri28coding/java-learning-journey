public class Exp1{
    String exp = "8+6-5";
    char sign;
    float[] num;
    int[] index;
    char[] op;
    int freq;
    float result;
    int error = 0 ;
    public static void main(String[] args) {
        Exp1 obj = new Exp1();
        obj.equal();
    }
    void equal(){
    exp = exp.replaceAll(" ", "");
        op = new char[exp.length()];
        num = new float[exp.length()];
        index = new int[exp.length()];
        solveBracket();
        if (error == 0){
            seperate(exp);
            cal('/');                       
            cal('*');                       
            cal('+');                   
            cal('-');
            System.out.println(num[0]);;
        }
        else{
            System.out.println("Error!");
        }
    }
    void solveBracket(){
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
    
    void seperate(String expression){ 
        int i,j,k,f=0;   
        expression = expression.replace(" ", "");
outer:  for( i=0,j=0,k=0;i<expression.length();i++,j++){
            char ch = expression.charAt(i);
            float temp=0;
            int l=-1;
loop:       for(;i<expression.length();i++){
                ch=expression.charAt(i);
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
                      ch=expression.charAt(i);
                    }
                    else if(ch == '!'){
                        if(num[j] == (int)num[j]){
                            num[j] = fact((int)num[j]);
                            f=0;
                            break loop;
                        }
                        else{
                            error = 1;
                            break outer;
                         }
                    }
                    else if(ch == '²'){
                        num[j] = temp * temp;
                        f=0;
                        break loop;
                    }
                    else if(ch == '√'){
                        if(num[j]<0){
                            error = 1;
                            break outer;
                        }
                        else
                            num[j] = (float)Math.pow(num[j], 0.5);
                            f=0;
                            break loop;
                    }
                    if(f==1){                       
                        temp += (Character.getNumericValue(ch)*Math.pow(10, l));
                        l--;
                    }
                    else{
                        temp = temp*10 + Character.getNumericValue(ch);
                    }
                }
                num[j]= temp;
            }  
        }  
    }
    long fact(int num){
        return num * fact(num-1);
    }
   
    void cal(char sign){
        int flag =0;
        for(int i=0;i<op.length;i++){
            if(sign == op[i]){
                index[flag]=i;
                flag++;
            }
        }
        freq = flag;
        if(sign == '/'){
            for(int i=0;i<freq;i++){
                result =  (num[index[i]]/num[index[i]+1]);
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
    }
}