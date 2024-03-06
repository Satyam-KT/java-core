class Ar3{
	public static void main(String args[]){
		int arr[][] = {{1,2,},{4,5}};
		int arr1[][] = {{1,3},{2,5}};
		
		int res[][] = new int[2][2];
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[0].length; j++ ){
				res[i][j] = 0;
				for(int k = 0 ; k<2; k++){
					res[i][j] += arr[i][k] * arr1[k][j];}
				System.out.print(res[i][j] + "/t");
			}
			System.out.println();

		}}}
