import java.util.Scanner;
class cond3
{i
	 public static void main(String[] args) {

	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("Enter a char: ");
	 	char ch = sc.next().charAt(0);
	 	String op = ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?

	 	((ch>='a'&&ch<='z')?(ch+" is lower case Alphabet"):
	 		(ch+" is an uppper case Alphabet")):


	 	((ch>='0'&&ch<='9')?(ch+" is a Digit"):
	 	(ch+" is special Character"));

	 	System.out.println(op);

	 }
}
