package Assignment;
import java.io.*;
class Assignment6{
public static void main(String args[]) throws IOException{
int num, i, flag=1;
System.out.print("Enter a number : ");
num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
if(num <= 10){
switch(num){
case 1 : case 4 : case 6 : case 8 : case 10 : flag = 0;}
}

else{
    for(i=2 ; i<num ; i++){
    if(num%i== 0){
    flag=0;
    break;}}
}
if(flag==1)
System.out.println(num + " is a prime number");
else
System.out.println(num + " is a not prime number");
}
}
