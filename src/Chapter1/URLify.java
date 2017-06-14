package Chapter1;

public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mr John Smith      ";
		int num = 13;
		System.out.println(isUrl(str, num));
	}
	
	static String isUrl(String str, int num){
		int spaceCount = 0;
		
		for(int i=0;i<num;i++){
			if(str.charAt(i)==' '){
				spaceCount++;
			}
		}
		
		int length = num+ 2*spaceCount;		
		char [] st = str.toCharArray();
		int index = length;
		
		for(int i = num-1; i>=0; i--){
			if(st[i]==' '){
				st[index-1]='0';
				st[index-2]='2';
				st[index-3]='%';
				index -= 3;
			} else {
				st[index-1] = st[i];
				index--;
			}
		}
		return String.valueOf(st);
	}
}
