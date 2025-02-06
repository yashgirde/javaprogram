import java.util.Scanner ;
class Number
{
	public static void main(String[] args) {
		System.out.print("Enter the number: ");

		int num  = new Scanner(System.in).nextInt(); 
		int dup  = num ;
		int sum  = 0;

		while(num>0) //cond
		{
			// 1%10 -> rem
			int rem = num%10 ;
			sum += rem ; // 5+1 -> 6
			// 1/10 -> 0 num 
			num /= 10; // 
		}
		System.out.println(sum);
		System.out.println(dup);
	}
}