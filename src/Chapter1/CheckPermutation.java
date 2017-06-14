package Chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String str1 = scan.nextLine();
		System.out.println("Enter second String: ");
		String str2 = scan.nextLine();
		
		if(isPermutation(str1,str2)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	static boolean isPermutation(String str1, String str2){
		
		if(str1.length()!=str2.length()){
			return false;
		}
		
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for(int i=0;i<s1.length;i++){
			if(s1[i]!=s2[i]){
				return false;
			}
		}
		return true;
	}
}
