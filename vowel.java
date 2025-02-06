import java.util.Scanner;

class vowel
{
	 public static void main(String[] args) {

	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("Enter a vow:");
	 	char ch  = sc.next().charAt(0);

	 	String op = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?("it is vowel"):("it is constant");

	 	System.out.println(op);

	 }

}

