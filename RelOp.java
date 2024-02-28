class RelOp{
	public static void main(String args[]){
		int a = 10, b = 15, c =5;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println(a==c);
		c = (a>b)?a:b;
		System.out.println(c);

	}}