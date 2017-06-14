package Chapter1;

import java.util.Scanner;

public class StringCompression {
	
	public static void main(String args[]){
		System.out.println("Enter a string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(checkString(str.toLowerCase()));
	}
	
	static String checkString(String str){
		int count = 1 ;
		StringBuilder res = new StringBuilder();
		res.append(str.charAt(0));
		for(int i=1;i<str.length();i++){
			
			if(str.charAt(i)==str.charAt(i-1)){
				count++;
			} else {
				res.append(count);
				res.append(str.charAt(i));
				count = 1;
			}
		}
		res.append(count);
		
		if(res.toString().length()==str.length()){
			return str;
		} else {
			return res.toString();
		}
	}
}
