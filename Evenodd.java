import java.util.Scanner;
class Evenodd
{
 
 public static void main(String[]args)
 {
 
 System.out.println("Enter a Num: ");
 int num = new Scanner(System.in).nextInt();
 System.out.println(num%2==0);
 System.out.println((num/2)==(num/2.0));
 System.out.println((num/2)*2==num);
 }
}