import java.util.Scanner;
class Season
{
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("enter the month;");
		 String month = sc.next().toUpperCase();

		 String op = (month.equals("OCT"))||(month.equals("NOV"))||
		             (month.equals("DEC"))||(month.equals("JAN"))? month+ "Winter":
		             (month.equals("FEB"))||(month.equals("MAR"))||
		             (month.equals("APR"))||(month.equals("MAY"))? month+ "Summmer":
		             (month.equals("JUN"))||(month.equals("JULY"))||
		             (month.equals("AUG"))||(month.equals("SEP"))? month+ "Mansoon":"Invalid monnth";

         System.out.println(op);

	}
}
