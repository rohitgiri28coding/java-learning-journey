import java.util.Scanner;
public class GuessTheNumber{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = (int)(Math.random()*100);
        int marks =1000,flag=0;
        System.out.println("   GUESS THE NUMBER   ");
        System.out.println("Rules :-\n1)Number is between 0 and 100.\n2)Game will start with 1000 points.\n3)On every wrong guess 50 points will be deducted.\n4)Enter 1000 to take hint(250 points will be deducted).");
        System.out.println("All The Best!");
loop:   while(true){
            System.out.print("Enter a number: ");
            int guess= sc.nextInt();
            if(guess == number){
                System.out.println("You Won!");
                System.out.println("Score : "+marks);
                break loop;
            }
            else{
                System.out.println("Try Again.");
                marks -= 50;
            }
            if(flag==1){
                if(guess <number){
                    System.out.println("Try entering a greater number.");
                }
                else{
                    System.out.println("Try entering a smaller number.");
                }
                
            }
            if(guess == 1000){
                marks -=200;
                System.out.println("Hint Activated");
                flag =1;
            }

        }
    }
}