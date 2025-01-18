import java.io.*;

    /*The following six classes of java.io package have been used 
    in this file write/read program
    InputStreamReader, BufferedReader, FileReader, FileWriter,
    IOException and FileNotFoundException*/

public class FileWriteRead{
    public static void main(String[] args) throws IOException{
    String str, estr="*";
    FileWriter fw;
    FileReader fr; 
    InputStreamReader ir;
    BufferedReader br;
    int i, ch;
    ir = new InputStreamReader(System.in);
    br = new BufferedReader(ir);
    str = null;
    fw = new FileWriter("JavaTextFile.txt");
    System.out.println("File created. Enter your text now, press '*' to stop");
    System.out.println("----------------------------------------------------");
    try{
        while(true){
        str = br.readLine();
        if(str.equals(estr)) break;
        for (i = 0; i < str.length(); i++)
        fw.write(str.charAt(i));
        fw.write('\n');}
    }
    catch(IOException ioe){}

    System.out.println("----------------------------------------------------");
    System.out.println("Writing into the file completed");
    fw.close();
    fr = null;
    try{
    fr = new FileReader("JavaTextFile.txt");
    }
    catch(FileNotFoundException fe){
    System.out.println("File not found");
    }
    System.out.println("");
    System.out.println("Reading from the file .....");
    System.out.println("----------------------------------------------------");
    System.out.println("");
    while ((ch=fr.read())!=-1)
    System.out.print((char)ch);
    System.out.println("\n");
    System.out.println("----------------------------------------------------");
    System.out.println("Reading from File completed");
    fr.close();
    }
    }
