import java.util.Scanner;

class AlphabetPattern
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.print ("Enter number of rows: ");
    int rows = sc.nextInt ();
    char ch = 'A';
    for (int i = 1; i <= rows; i++)
      {
	for (int j = rows - i; j > 0; j--)
	  {
	    System.out.print (" ");
	  }
	for (int j = 1; j <= (i * 2) - 1; j++, ch++)
	  {
	    System.out.print (ch);
	  }
	ch = 'A';
	System.out.println ();
      }
      
    for (int i = rows-1,k=1; i >=1; i--,k++)
      {
	for (int j = k; j >=1; j--)
	  {
	    System.out.print (" ");
	  }
	for (int j = (i * 2) - 1; j >= 1; j--, ch++)
	  {
	    System.out.print (ch);
	  }
	ch = 'A';
	System.out.println ();
      }
  }
}
