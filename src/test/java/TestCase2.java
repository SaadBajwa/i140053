

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import core.Calculation;

public class TestCase2 {

	Calculation calculation=null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
		calculation=new Calculation();
	}

	@Test
	public void findMax(){
		System.out.println("test case find max");
		assertEquals(4,calculation.findMax(new int[]{1,3,4,2}));
//		assertEquals(-2,calculation.findMax(new int[]{-12,-3,-4,-2}));
		assertEquals(-1,calculation.findMax(new int[] {}));
	}
	
	@Test
	public void findSum(){
		System.out.println("test case find sum");
		assertEquals(10,calculation.getSum(new int[]{1,2,3,4}));
		assertEquals(-1,calculation.getSum(new int[] {}));
	}

	@Test
	public void findMin(){
		System.out.println("test case find min");
		assertEquals(1,calculation.findMin(new int[]{1,3,4,2}));
		assertEquals(-1,calculation.findMin(new int[] {}));
	}

	@Test
	public void reverseArray(){
		System.out.println("test case reverse array");
		assertEquals(new int[] {2,4,3,1},calculation.reverseArray(new int[]{1,3,4,2}));
		assertEquals(null,calculation.reverseArray(new int[] {}));
	}

	@Test
	public void searchValue(){
		System.out.println("test case search value");
		assertEquals(true,calculation.searchValue(new int[]{1,3,4,2},2));
		assertEquals(false,calculation.searchValue(new int[]{1,3,4,2},8));
		assertEquals(false,calculation.searchValue(new int[]{},8));
	}
	
	@Test
	public void reverseString(){
		System.out.println("test case revserse string");
		assertEquals("sniknej",calculation.reverseString("jenkins"));
		assertEquals("",calculation.reverseString(""));		
	}

	@Test
	public void isTriangle(){
		System.out.println("test case isTriangle");
		assertEquals(true,calculation.isTriangle(3, 4, 5));
		assertEquals(false,calculation.isTriangle(3, 4, 9));

		assertEquals(false,calculation.isTriangle(7, 5, 1));
		assertEquals(false,calculation.isTriangle(3, 5, 1));

	}

	@Test
	public void testCube(){
		System.out.println("test case cube");
		assertEquals(27,calculation.cube(3));
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

}
