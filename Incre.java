class Incre
{
	public static void main(String[] args) {
		
		int p = -1,q = 5,r = 17,s;

		    s = p++ - q-- *r;
		    s = s++;
		    q = -p++ + r--;

		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
		System.out.println(p);
	}
}
