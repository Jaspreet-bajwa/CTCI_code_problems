package Chapter1;

public class ZeroMatrix {
	public static void main(String args[]){
		int [][] arr = { {1,2,3,0,5},{4,5,6,7,8},{7,8,9,10,11}};
		for(int i=0; i<arr.length;i++){
			System.out.println("");
			for(int j =0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println("");
		int [][] nums = zeroMatrix(arr);
		for(int i=0; i<nums.length;i++){
			System.out.println("");
			for(int j =0;j<nums[0].length;j++){
				System.out.print(nums[i][j]+" ");
			}
		}
	}
	
	static int[][] zeroMatrix(int [][]nums){
		boolean [] rows = new boolean[nums.length];
		boolean [] columns = new boolean[nums[0].length];
		
		for(int i=0;i<nums.length;i++){
			for(int j=0; j<nums[0].length;j++){
				if(nums[i][j]==0){
					rows[i] = true;
					columns[j] = true;
				}
			}
		}
		
		for(int i=0;i<nums.length;i++){
			if(rows[i]){
				nums = nullifyRow(nums,i);
			}
		}
		
		for(int i=0;i<nums[0].length;i++){
			if(columns[i]){
				nums = nullifyColumn(nums,i);
			}
		}
		
		return nums;
	}
	
	static int[][] nullifyRow(int [][]arr, int n){
		for(int i=0; i<arr[0].length;i++){
			arr[n][i]=0;
		}
		return arr;
	}
	
	static int[][] nullifyColumn(int [][]arr, int n){
		for(int i=0; i<arr.length;i++){
			arr[i][n]=0;
		}
		return arr;
	}
}
