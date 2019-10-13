public class ReverseWordString {
	
	public static void main(String[] args) {
		
		String str = "hello java world";
		
		
		String reverseWord="";
		String word ="";
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=' ') {
				word += str.charAt(i)+"";
				if(i== str.length()-1) 
					reverseWord += reverseWord(word);
			}
			
			else {
				reverseWord += reverseWord(word);
				reverseWord += " ";
				word="";
			}	
		}
		
		System.out.println(reverseWord);
	}

	static String reverseWord(String word) {
		String reverse="";
		for(int k=word.length()-1;k>=0;k--) {
			reverse +=word.charAt(k);
		}
		return reverse;
	}
}
