import java.util.Scanner;

class cond4
{
	 public static void main(String[] args) {

	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("Enter a number:");
	 	int num = sc.nextInt();

	    String ans = ((num%2==0)&&(num%5==0))?("Hitwofive"):((num%2==0)?("Hitwo"):((num%5==0)?("Hifive"):("")));
   
        System.out.println(ans); 

 
	
	}
}