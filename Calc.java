import java.util.Scanner;

class Calc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b;
		char operat;
		System.out.println("enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("choose an operation");
		
		operat = sc.next().charAt(0);
		
		switch(operat){
			case '+':
			System.out.println("addition" + (a+b));
			break;	
			case '-':
			System.out.println( a-b);
			break;

			case '*':
			System.out.println( a*b);
			break;
			case '/':
			System.out.println( a/b);
			break;

			default:
			System.out.println("invalid entry");
			}}}