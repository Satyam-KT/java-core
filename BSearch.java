import java.util.Scanner;

public class BSearch {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 5, 6};

        for(int i = 0; i<5; i++){
            for(int j = i+1; j<5; j++){
                if(a[i] > a[j]){
                    int temp = a[j];
                    for(int k  = j; k>i; k--){
                        a[k] = a[k-1];
                    }
                    a[i] = temp;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key ");
        int key = sc.nextInt();

        binarySearch(0, 4, key, a);
        // System.out.println("element fournd at " + i + " position");
    }

    static void binarySearch(int s, int e , int key, int a[]){
        int mid = (s+e)/2;
        if(s>e){
            System.out.println("not found");
            return;
        }
        if(key == a[mid]){
            System.out.println(mid+1);
            return;
        }
        else if(key > a[mid]){
            binarySearch(mid+1, e, key, a);
        }
        else{
            binarySearch(s, mid, key, a);
        }
        
    }

}
