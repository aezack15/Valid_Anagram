//Grind 75 problem #7
//tells user if 2 strings are anagrams

import java.util.*;

class Valid_Anagram_7{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		boolean valid = true;
		System.out.print("s = ");
		String s = in.next();
		System.out.print("t = ");
		String t = in.next();
		s = s.toLowerCase();
		t = t.toLowerCase();
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		LinkedList<Character> ll = new LinkedList<Character>();
		for(int i=0; i<tArray.length; i++){
			ll.push(tArray[i]);
		}
		
		for(int i=0; i<sArray.length; i++){
			if(ll.contains(sArray[i])){
				ll.remove(ll.indexOf(sArray[i]));
			}
		}
		
		if(ll.size() > 0){
			valid = false;
		}
		
		System.out.print(valid);
		System.out.println();
	}
}
