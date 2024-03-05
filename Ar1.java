import java.util.*;
class Ar1{
	public static void main(String args[]){
		int arr[] = new int[10], odd = 0, even = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int esum = 0, osum = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i]%2 == 0){
				even++;
				esum += arr[i];
			}
			else{
				odd++;
				osum += arr[i];	
			}
		}
		System.out.println("there are " + odd + " odd numbers  and their sum is " + osum );
System.out.println("there are " + even+ " even numbers  and their sum is "+ esum );
		}}
		