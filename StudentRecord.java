import java.util.Scanner;
import java.io.*;

public class StudentRecord{
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileWriter fw = new FileWriter("xyz.txt");
            fw.write("Roll Name Session Sem\n19 Rohit Giri 2022-2025 sem-2\n85 xyz 2022-2025 sem2");
            fw.close();
            System.out.println("Successfully updated record");            
        }catch(IOException e){
            System.out.println("Error occurred while updating record");
        }
        int flag=0;
        File obj = new File("C:\\Users\\DOS\\OneDrive\\Code java\\xyz.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number to find any record");
        String roll = sc.next();
        try (Scanner sc1 = new Scanner(obj)) {
            while(sc1.hasNextLine()){
                String data = sc1.nextLine();
                if(data.contains(roll)){
                    flag++;
                    System.out.println(data);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
        if(flag==0){
            System.out.println("Not found");
        }
    }
}