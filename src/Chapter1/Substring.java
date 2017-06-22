package Chapter1;

import java.util.*;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string:");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		System.out.println("Enter second string:");
		String s2 = scan.nextLine();
		if(isSubstring(s1,s2)){
			System.out.println("String rotation true");
		} else {
			System.out.println("String rotation false");
		}

	}
	
	static boolean isSubstring(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		} else {
			StringBuilder sr = new StringBuilder();
			sr.append(s2);
			sr.append(s2);
			if(sr.toString().contains(s1)){
				return true;
			} else {
				return false;
			}
		}
	}

}
