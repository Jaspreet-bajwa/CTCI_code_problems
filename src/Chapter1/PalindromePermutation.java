package Chapter1;

import java.util.Scanner;

public class PalindromePermutation {
	public static void main(String args[]){
		System.out.println("Enter a string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(checkPalindrome(str.toLowerCase()));
	}
	
	static boolean checkPalindrome(String str){
		String str1 = skipWhiteSpaces(str);
		int length = str1.length();
		int [] temp = new int[26];
		if(str.equals("") || str.isEmpty()){
			return true;
		} else {
			for(int i=0; i<length;i++){
				temp[str1.charAt(i)-'a']++;
			}
			
			if(length%2==0){	
				for(int i : temp){
					if(i!=2 && i!=0){
						return false;
					} 
				}
				return true;
			} else {
				boolean res = false;
				for(int i: temp){
					if(i==1 && !res){
						res = true;
					} else if(i==1 && res){
						return false;
					} else if(0<i && i>2) {
						return false;
					}
				}
				return true;
				
			}
		}
		
	}
	
	static String skipWhiteSpaces(String str){
		String res = "";
		for(int i=0;i<str.length();i++){
			if(!(str.charAt(i)==' ')){
				res += str.charAt(i);
			}
		}
		return res;
	}

}
