import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;


public class WritingThroughScanner{
    public static void main(String[] args) {
        try{
            FileWriter fw = new  FileWriter("G:\\My Drive\\Code Java\\xyz.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter sth");
            while(true){
                String str = sc.nextLine();
                if(str.equals("*"))
                    break;
                fw.write(str);
            }
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}