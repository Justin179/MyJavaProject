package codility.on181126;

import java.util.ArrayList;
import java.util.List;

public class AndyTest {

	
	public static void main(String[] args) {
		
	    ArrayList<String> strings = new ArrayList<String>();
	    // 用遞迴，消除隔壁相同的字元, 如下所示
	    strings.add("ABCBA");  // -> ABCBA
	    strings.add("ABCCA");  // -> ABA
	    strings.add("ABBACC"); // ->  
	    strings.add("ABBA");   // -> 
	    strings.add("");	   // -> 
	    
		for(int i=0; i<strings.size(); i++) {
			String processResult = processOneString(strings.get(i));
			strings.set(i, processResult);
		}
		
	    System.out.println("strings: "+strings);
	    // strings: [[A, B, C, B, A], [A, B, A], [], [], []]
	    // strings: [[A, B, C, B, A], [A, B, A], [], [], []] (優化後)
		
	}
	
	private static String processOneString(String str) {
		char[] array= str.toCharArray();
		
		List<Character> charlist = new ArrayList<Character>();
		for(char c : array){
			charlist.add(c);
		}
		
		// 改寫成遞迴版
		while(removeDuplicate(charlist)) {
			removeDuplicate(charlist);
		}
		
		str = charlist.toString();
		return str;
	}
	
	private static boolean removeDuplicate(List<Character> charlist){
		
		for (int i = 0; i < (charlist.size() - 1); i++) {
			
			System.out.println(charlist.toString());
			int j = i + 1;
			System.out.print("i: " + i);
			System.out.println("   charlist.get(i): "+charlist.get(i));
			
			System.out.print("j: " + j);
			System.out.println("   charlist.get(j): "+charlist.get(j));
			System.out.println();
			
			boolean charEquals = charlist.get(i).equals(charlist.get(j));
			if (charEquals) {
				charlist.remove(j); // 2
				charlist.remove(i); // 1
				// 比對基準點拉回
				if(i==0)
					i = i-1;
				else 
					i = i-2;
			}
		}
		
		boolean stillhasDuplicate = false;
		for (int i = 0; i < (charlist.size() - 1); i++) {
			boolean charEquals = charlist.get(i).equals(charlist.get(i + 1));
			if(charEquals) 
				stillhasDuplicate = charEquals;
		}
		
		return stillhasDuplicate;
	}

}
