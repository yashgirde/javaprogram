import java.util.Scanner;
class EVM
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bjp = 0 , cng = 0 , ss = 0 , aap = 0 , mns = 0 , nota = 0 ;
		System.out.print();
		System.out.print("       WELCOME");
		System.out.print();
		System.out.print(" Enter the population ");
		int population = sc.next();

		for(int i = 1; i<=population ; i++)
		{
			System.out.println();
			System.out.println("****Enter the parties****");
			System.out.println("1.BJP");
			System.out.println("2.Congress");
			System.out.println("3.SHIV SENA");
			System.out.println("4.AAP");
			System.out.println("5.MNS");
		    System.out.println("6.NOTA");
		    System.out.println();
		    int opt = sc.nextInt();
		    if(opt>=1 && opt<=6){
		    	if(otp==1)
		    	{
		    		bjp++;
		    		System.out.println("Ache din ayenge");
		    	}
		    	if(opt==2)
		    	{
		    		cng++;
		    		System.out.println("Bharat Todo");
		    	}
		    	if(opt==3)
		        {
		           ss++;
		           System.out.println("HUM Hai Asli Sena");
		        }
		        if(opt==4)
		        {
		        	aap++;
		        	System.out.println("Mujhe Azaz Karo");
		        }
		        if(opt==5)
		        {
		        	mns++;
		        	System.out.println("Jay Maharashtra");
		        }
		        if(opt==6)
		        {
		        	nota++;
		        	System.out.println("You Are An Educated Person");
		        }
		        if(!(opt>=1 && opt<=6)){
		        	i--;
		        	System.out.println("Invalid Option");
		        }
		      }
		      if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota){
		      	 System.out.println("BJP has won the Election BY "+bjp+"votes");
		      }
		      if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota){
		      	 System.out.println("Congress has won the Election By "+cng+"votes");
		      }
		      if(ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota &&cng){ 
		      	 System.out.println("Shiv Sena has won the Election by "+ss+"votes");
			  


		      
		    }
		  }
		 
	   
		      
		   