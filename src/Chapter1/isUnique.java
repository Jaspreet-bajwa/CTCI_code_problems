package Chapter1;

import java.util.*;

public class isUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
	
		if(isUniqueString(str)){
			System.out.println("Unique character string");
		} else {
			System.out.println("Not a unique character string");
		}
		System.out.println("without additional data structure");
		if(isUniqueStr(str)){
			System.out.println("Unique character string");
		} else {
			System.out.println("Not a unique character string");
		}
	}
	
	static boolean isUniqueString(String str){
		ArrayList<Character> val = new ArrayList<Character>();
		for(int i=0;i<str.length();i++){
			if(val.contains(str.charAt(i))){
				return false;
			} else {
				val.add(str.charAt(i));
			}
		}
		return true;		
	}
	
	static boolean isUniqueStr(String str){
		int [] values = new int[26];
		
		for(int i=0;i<str.length();i++){
			values[str.charAt(i)-'a']++;
		}
		
		for(int i : values){
			if(i>1){
				return false;
			}
		}
		return true;
	}
	
	
}
