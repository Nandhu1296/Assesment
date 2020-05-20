package helloworld_nandha;

import org.junit.*;

public class calcTest {

	//private calcMain calcMainObj;
	
	
//	@Before
//	public void startup() {
//		calcMain calcMainObj= new calcMain();
//
//	}
	
	
	@Test
	public void testNumber1()
	{
		calcMain calcMainObj= new calcMain();
		int number = 1;
		String numberReturned= calcMainObj.play(number);
		Assert.assertEquals("2901", numberReturned);
	}
		
	@Test
	public void testNumber2()
	{
		calcMain calcMainObj= new calcMain();
		int number = 4;
		String numberReturned= calcMainObj.play(number);
		Assert.assertEquals("3222", numberReturned);
	}
	
}
