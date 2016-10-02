import static org.junit.Assert.*;

import org.junit.Test;

public class HeapSortTest {

	@Test
	public void testEmpty() {
		int[] arrayOne = new int[0];
		HeapSort.sort(arrayOne);
		assertEquals(0, arrayOne.length);
		int[] arrayTwo = {1};
		HeapSort.sort(arrayTwo);
		assertEquals(1, arrayTwo[0]);
	}
	
	@Test
	public void testSmall() {
		int[] arrayOne = new int[] {56,235,879,0,-27346,45,1};
		int[] arrayTwo = new int[] {879, 235, 56, 45, 1, 0, -27346};
		HeapSort.sort(arrayOne);
		for (int i=0; i<7; ++i) {
			assertEquals(arrayTwo[i], arrayOne[i]);
		}
		
	}

}
