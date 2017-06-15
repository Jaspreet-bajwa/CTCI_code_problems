package Chapter1;

public class RotateMatrix {
	

	
	
	static int[][] rotateMatrix(int [][]nums){
		int n = nums.length-1;
		for(int i=0;i<nums.length/2;i++){
			for(int j=0;j<nums.length;j++){
				int temp = nums[i][j];
				nums[i][j] = nums[n][j];
				nums[n][j] = temp;				
			}
			n--;			
		}
		
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				int temp = nums[i][j];
				nums[i][j] = nums[j][i];
				nums[j][i] = temp;
			}
		}
		
		return nums;
	}
}
