import java.util.*;

class ArmN{
	public static void main(String args[]){
		int rem , sum = 0, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a nuber");
		n = sc.nextInt();
		int a = n;
		for( ; n>0; n=n/10){
			rem = n%10;
			sum = sum + (rem*rem*rem);
			
		}
		if(sum == a){
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("not an armstrong number");
		}}}