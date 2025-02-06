import java.util.Scanner;
class Prime
{
	public static void main(String[] args) {

		 System.out.println("enter  number :");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt(); //5

		 System.out.println
		 ((num==2||num==3)?(num+"is prime"):
		 	((num%2==0||num%3==0)||num%5==0||num%7==0?
		 		(num+"is not prime"):(num+ "is prime")));

		
	}
		
	}