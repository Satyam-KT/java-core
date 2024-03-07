

public class Insert {
    public static void main(String[] args) {
        int a[] = {10,5,44,24,21};

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

        System.out.println("Sorted  array is :");
        for(int i = 0; i<5; i++){
            System.out.print(a[i] + " ");
        }
        
        
    }
}
