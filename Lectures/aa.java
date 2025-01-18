import java.util.*;
class Teacher{
Scanner sc = new Scanner(System.in);
String collegeName, designation;
String name, mainSubject, qualification;
float salary;
void getData(){
System.out.print("Enter College Name : ");
collegeName= sc.nextLine();
System.out.print("Enter Designation : ");
designation = sc.nextLine();
}
void showData(){
System.out.printf("\nCollege: %s",collegeName);
System.out.printf("\nDesignation: %s",designation);
}
}
class ComputerTeacher extends Teacher{
void getData(){
super.getData();
System.out.print("Enter Your Name : ");
name = sc.nextLine();
System.out.print("Enter Main Subject : ");
mainSubject= sc.nextLine();
System.out.print("Enter Qualification : ");
qualification = sc.nextLine();
System.out.print("Enter Salary : ");
salary = sc.nextFloat();
}}

