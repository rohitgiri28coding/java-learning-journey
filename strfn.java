import java.util.Scanner;

class str{
    String str1,str2,str3;
    Scanner sc;
    StringBuffer strbuf1,strbuf2;

    public str(){
        sc = new Scanner(System.in);
    }
    /*
     IMMUTABLE STRING
     */
    public void getImmutStr(){
        System.out.println("Enter a string: ");
        str1 = sc.nextLine();            // immutable string
        System.out.println("Enter another string: ");
        str2 = sc.nextLine();           // immutable string
    }

    public void showImmut(){
        System.out.println("Value in str1: "+str1);
        System.out.println("Value in str2: "+str2);
        
    }

    public void updateImmutStr(){
        str1 = str1.concat("Rohit");
        System.out.println("Updated value of str1: "+str1);
        }
    
        public void concatImmutStr(){
            str1.concat("New"); //display after concat
            System.out.println("Conacatinating \"new\" to str1: "+str1);
            System.out.println("Since str1 is immutable hence concatinating does not happen");
        }
        public void equalcheck(){
            System.out.println("Equal check in immutable string: "+str1.equals(str2));
        }

    /*
     MUTABLE STRING
     */
    public void getMutStr(){
        strbuf1 =new StringBuffer("Rohit ");
        strbuf2= new StringBuffer("Giri");   // mutable string
    }

    public void showMutStr(){
        System.out.println("Value in strbuf1: "+strbuf1);
        System.out.println("Value in strbuf2: "+strbuf2);   
    }

    public void updateMutStr(){
        strbuf1 = new StringBuffer("*Rohit* ");
        strbuf2 = new StringBuffer("*Giri*");
        }
    
        public void appendMutStr(){
            strbuf2.append("allo");
            System.out.println(str2);
        }
        public void equalcheckMutStr(){
            System.out.println("Equal check in immutable string"+str1.equals(str2));
        }
        

    
}

public class strfn {
    public static void main(String[] args) {
        str st = new str();
        int choice;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to create mutable string or enter 2 for immutable string");
        choice = s.nextInt();
        switch(choice){
            case 1: 
                st.getMutStr();
                st.showMutStr();
                st.appendMutStr();
                st.updateMutStr();
                st.showMutStr();
                st.equalcheckMutStr();
                break;
        
            case 2: 
                st.getImmutStr();
                st.showImmut();
                st.concatImmutStr();
                st.updateImmutStr();    
                st.equalcheck();
        }

    }
}
