import java.util.Scanner;
class Loan
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");

        int month = sc.nextInt();

             int years = month/12;
             int mnth = month%12;

             System.out.println(years+" "+mnth/10.0);
	}
}