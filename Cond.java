class Cond
{ 
	public static void main(String[]args)
  {
		
		int a = 5;
		int b = 6;
		int c = 7;
		// ()?():();
		int lar =(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
	    int small =(a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		
		System.out.println("largest is :"+lar);
		System.out.println("smallest is :"+small);
		
  }
}
			
