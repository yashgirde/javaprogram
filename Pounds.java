import java.util.Scanner;
class Pounds
{
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter pound:");
	double pound = sc.nextDouble();
	
	// convert pound into kilogram 
	double kilogram = 0.454;
	
	double kilo = pound*kilogram;
	 
	System.out.println(kilo);
	
	

	}
}