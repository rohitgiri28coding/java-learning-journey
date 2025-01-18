import java.io.*;
public class inputthroughbuffer{
    public static void main(String[] args) {
        InputStreamReader IR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IR);
        try{
            int i = Integer.parseInt(BR.readLine());
        }
        catch(Exception e){}
    }
}