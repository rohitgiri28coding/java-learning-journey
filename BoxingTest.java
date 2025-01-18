public class BoxingTest {
    public static void main(String[] args) {
        int  n1 = 10, n2 = 20;
        Integer i1,i2;
        i1 = n1;                       // Auto or Implicit Boxing
        System.out.println(i1);
        i2 = Integer.valueOf(n2);      // Explicit Boxing
        System.out.println(i2);
        String str = "15";
        int num = Integer.valueOf(Integer.parseInt(str));
        System.out.println(num);
        char ch ='1';
        System.out.println("IS A Letter "+Character.isLetter(ch));
        System.out.println("IS DIGIT "+Character.isDigit(ch));
        System.out.println("Space "+Character.isSpaceChar(ch));
        System.out.println("isUpperCase "+Character.isUpperCase(ch));
        System.out.println("isLowerCase "+Character.toLowerCase(ch));
        // char ch12[]= new char[15];
        // ch12 = "ROhit";

    }
}
