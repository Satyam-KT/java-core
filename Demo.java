
import java.util.Scanner;
class Demo{
	public static void main(String args[]){
		/*int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		num = sc.nextInt();
		
		switch(num){
			case 1: 
			System.out.println("first");
			break; 
			case 2:
			System.out.println("second");
			break;
			case 3: 
			System.out.println("third");
			break;
			default:
			System.out.println("invalid");
			}}}*/
		char letter;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a letter");
		letter = sc.next().charAt(0);
		
		switch(letter){
			case 'a':
			System.out.println("vowel");
			break;
			case 'e':
			System.out.println("vowel");
			break;
			case 'i':
			System.out.println("vowel");
			break;
			case 'o':
			System.out.println("vowel");
			break;
			case 'u':
			System.out.println("vowel");
			break;
			default :
			System.out.println("consonant");
			}}}
			