import java.util.Scanner;
class BMI
{
	public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	System.out.print("enter weight in pounds:");
	float weight = sc.nextFloat();
	System.out.print("enter height in inches:");
	float height = sc.nextFloat();

	// one pound is 0.45359..

	float kilogram = (weight)*0.45359237f;
	float meter = (height)*0.0254f;


	float bmi = (kilogram/meter*meter);


	System.out.println(bmi);

  }
 }