import java.util.Scanner;
class Forloop
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		System.out.println("Enter the range: ");
		int range = sc.nextInt();

		for (int i=1;i<=10;i++ ) 
		{
		
		 System.out.println(num+"x"+i+"="+(num*1));	
		}
	}
}