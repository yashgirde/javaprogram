import java.util.Scanner;
class Curr
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("    Currrency Converter");
		System.out.println();
		System.out.println("Enter the amount(INR); ");
		float inr = sc.nextFloat();
		System.out.println();

		System.out.println("List Of Currrency");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("5. YEN");
		System.out.println();
		System.out.println("Enter your Currrency");
		
		String Curr = sc.next().toUpperCase();

		float concurr = 0;
		if(curr.equals("USD")){
			concurr = inr/86.56f;
			System.out.println(inr + " INR = "+concurr+" USD");
	    }
	    else if(concurr.equals("EUR")){
	    	concurr = inr/90.65f;
	    	System.out.println(inr + " INR = "+concurr+" EUR");
	    }
	   
            

  		}
	}
