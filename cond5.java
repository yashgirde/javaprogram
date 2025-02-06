import java.util.Scanner;

class cond5
{
	 public static void main(String[] args) {

	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("Enter a number:");
	 	int num = sc.nextInt();

	    String ans = ((num%2==0)&&(num%5==0))?("Hitwofive"):("");
	    String ans2 =(num%5==0)?("Hifive"):("");
	    String ans3 =(num%2==0)?("Hi two"):("");

   
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3); 

     

 
	
	}
}