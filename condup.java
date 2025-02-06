import java.util.Scanner;
class condup
{
	 public static void main(String[] args) {

	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("Enter a char: ");
	 	char ch = sc.next().charAt(0);
	 	String op = ((ch>='a'&&ch<='z')?(ch+" is an Lower case Alphabet"):(ch+"it is not"));
	 	String AB = ((ch>='A'&&ch<='Z')?(ch+" ia an Upper case Alphabet"):(ch+"it is not"));



	 	System.out.println(op);
	 	System.out.println(AB);


	 }
}
