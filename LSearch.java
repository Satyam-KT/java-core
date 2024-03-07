import java.util.*;
public class LSearch {
    public static void main(String[] args) {
        int a[] = { 1, 5, 23 , 12, 15};
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter key");
        int key = sc.nextInt();

        for(int i = 0; i<5; i++){
            if(a[i] == key){
                index = i+1;
            }
        }
        System.out.println("element found at "+ index + "position");
    }
}
