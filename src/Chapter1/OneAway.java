package Chapter1;

public class OneAway {
	
//	public static void main(String args[]){
//		String s = "bake";
//		String t = "bale";
//		System.out.println(checkEdits(s,t));
//	}
		
	public boolean checkEdits(String s, String t){
		int str[] = new int[128];
		int count = 0; 
		if(Math.abs(s.length()-t.length())>1){
			return false;
		} else{ 
			for(int i=0; i<s.length();i++){
				str[s.charAt(i)-'a']++;
			}
			for(int i=0; i<t.length();i++){
				str[t.charAt(i)-'a']--;
			}
			for(int i: str){
				if((i==1 || i==-1) && (count<2)){
					count++;
				} else if((i==1 || i==-1) && (count>1)){
					return false;
				} else if(i!=0){
					return false;
				}
			}
			return true;
		} 
	}
}
