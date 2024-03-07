import java.util.*;
class BubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("enter the elements");

        for(int i = 0; i<10; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<10; i++){
            System.out.print(a[i] + " ");
        }

        for(int i = 0; i<10; i++){
            for(int j = 0; j<9; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("the sorted array is :");
        for(int i = 0; i<10; i++){
            System.err.print(a[i] + " ");
        }
        sc.close();


    }
}