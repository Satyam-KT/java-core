import java.util.*;

class PrmN{
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		n = sc.nextInt();
		for(int i = 2; i<n; i++){
		
			if(n % i ==0){
				System.out.println("not prime");
			}
		}
		System.out.println("number is prime");
		}}