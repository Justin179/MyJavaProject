package codility.on181126;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * A binary gap(11之間的0000) within a positive integer N is any maximal sequence of consecutive zeros 
 * that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. 
The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. 

The number 20 has binary representation 10100 and contains one binary gap of length 1. 
The number 15 has binary representation 1111 and has no binary gaps. 
The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. 找出最長的binary gap
The function should return 0 if N doesn't contain a binary gap. 沒有gap則回零

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. 
Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].
 */

public class Solution {

    public static int solution(int N) {
		// 首先，數字傳成二進位的方法
		String binaryNum =  Integer.toBinaryString(N); // 1000010001
		
		char[] charArray = binaryNum.toCharArray();

		// get all ones index
		List<Integer> allOnesIndex = new ArrayList<Integer>();
		for(int i = 0; i<charArray.length; i++){
			char cha = charArray[i];
			if("1".equals(String.valueOf(cha)))
				allOnesIndex.add(i);
		}
		
		// System.out.println(allOnesIndex); // 0 5 9
		// 收集所有gap的長度
		int[] intArray = new int[allOnesIndex.size()-1];
		for(int i = 0; i<(allOnesIndex.size()-1); i++){
			int j = i+1;
			intArray[i] = (allOnesIndex.get(j) - allOnesIndex.get(i)) - 1;
		}

		// 沒gap就直接回去
		if(intArray.length==0)
			return 0;
		
		// 有gap就排序後抓最大的回去
		Arrays.sort(intArray);
		int max = intArray[intArray.length-1];
		
    	return max;
    }
    
	public static void main(String[] args) {
		// 1041 -> 10000010001 -> 5
//		The number 529 has binary representation 1000010001 -> 4
//		The number 20 has binary representation 10100 and contains one binary gap of length 1. 
//		The number 15 has binary representation 1111 and has no binary gaps. 
//		The number 32 has binary representation 100000 and has no binary gaps.
		int maxGap = solution(1041);
		System.out.println("maxGap1: "+maxGap);
		maxGap = solution(529);
		System.out.println("maxGap2: "+maxGap);
		maxGap = solution(20);
		System.out.println("maxGap3: "+maxGap);
		maxGap = solution(15);
		System.out.println("maxGap4: "+maxGap);
		maxGap = solution(32);
		System.out.println("maxGap5: "+maxGap);
	}

}












