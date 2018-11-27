package codility.on181126;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		int input = 1041;
		int result = Solution.solution(input); // return max gap
		assertEquals(5,result);
	}
	@Test
	public void testSolution2() {
		int input = 529;
		int result = Solution.solution(input); // return max gap
		assertEquals(4,result);
	}
	@Test
	public void testSolution3() {
		int input = 20;
		int result = Solution.solution(input); // return max gap
		assertEquals(1,result);
	}
	@Test
	public void testSolution4() {
		int input = 15;
		int result = Solution.solution(input); // return max gap
		assertEquals(0,result);
	}
	@Test
	public void testSolution5() {
		int input = 32;
		int result = Solution.solution(input); // return max gap
		assertEquals(0,result);
	}

}
