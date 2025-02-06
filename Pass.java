import java.util.Scanner;
class Pass
{
	public static void main(String[]args) {
		
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the marks:");
	   float marks = sc.nextFloat();

	   float per = (marks*100)/600;

	   String op = (per>=75)?"Grade is A"+per+"%":
	               (per>=60)?"Grade is B"+per+"%":
	               (per>=35)?"Grade is C"+per+"%":"Fail";

	   System.out.println(op); 


	}
}