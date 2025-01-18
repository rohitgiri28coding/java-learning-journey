
public class Assignment8{
    public static void main(String args[]){
    String str1 = new String("BNC"); //immutable string object
    String str2 = new String("BNC");
    StringBuffer strbuf1 = new StringBuffer("PU"); //mutable string object
    StringBuffer strbuf2 = new StringBuffer("PU");
    System.out.println("value in str1 : " + str1 + "\nvalue in str2 : " + str2);
    System.out.println("Use of equals() on above String objects returns : " + str1.equals(str2));
    System.out.println("value in strbuf1 : " + strbuf1 + "\n value in strbuf2 : " + strbuf2);
    System.out.println("Use of equals() on above StringBuffer objects : " + strbuf1.equals(strbuf2));
    str1.concat("Patna");
    System.out.println("Even after Concatenating a new word 'Patna', to the String object,");
    System.out.println("the content does not chage - String objects are immutable");
    System.out.println("value in str1 : " + str1 + "\tvalue in str2 : " + str2);
    str1 = str1.concat(", ").concat("Patna").concat(" University").concat(", Patna");
    System.out.println("Content of str1 : " + str1 + "\tContent of str2 : " + str2);
    System.out.println("Use of equals() on String objects str1 and str2 now returns : " + str1.equals(str2));
    strbuf1.append(strbuf2); 
    System.out.println("\nAppending strbuf2 to strbuf1 : ");
    System.out.println("value in strbuf1 : " + strbuf1);
    strbuf2.insert(1,"alt"); 
    System.out.println("\nInserting the string 'alt' to strbuf2 : ");
    System.out.println("value in strbuf2 : " + strbuf2);
    strbuf2.setCharAt(2,'t'); 
    System.out.println("Using setCharAt(2,'t') on strbuf2 : ");
    System.out.println("value in strbuf2 : " + strbuf2);
    strbuf2.setLength(3); System.out.println("\nUsing setLength(3) on strbuf2 : ");
    System.out.println("value in strbuf2 : " + strbuf2);
    }
    }

