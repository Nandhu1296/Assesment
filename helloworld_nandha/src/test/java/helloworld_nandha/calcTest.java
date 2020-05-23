package helloworld_nandha;


import org.junit.*;

public class calcTest {

	private  calcMain calcMainObj;
	
	@Before
	public void setup() 
	{
		calcMainObj= new calcMain();
	}


	@Test
	public void twoNumbersWithComma()
	{
		String st="98,8";
		Assert.assertEquals("106", calcMainObj.calculate(st));
	}
	
	@Test
	public void singlenumber()
	{
		String st="74";
		Assert.assertEquals("74", calcMainObj.calculate(st));	
	}
	
	@Test
	public void noValue()
	{
		String st="";
		Assert.assertEquals("0", calcMainObj.calculate(st));	
	}
	
	@Test
	public void unknownAmountOfNumbers()
	{
		String st="322,4,56,";
		Assert.assertEquals("382", calcMainObj.calculate(st));
	}
	
	@Test
	public void withSlashN()
	{
		String st="\n8,4\n9";
		Assert.assertEquals("21", calcMainObj.calculate(st));		
	}
	
	@Test
	public void withDifferentDelimiters()
	{
		String st="#;//(5)6_\\n;*=6";
		Assert.assertEquals("17", calcMainObj.calculate(st));	
	}
	
	@Test
	public void withNegativeNumbers()
	{
		String st="(6#-8\n9";
		Assert.assertEquals("0", calcMainObj.calculate(st));
	}
	
	@Test
	public void numberBiggerThan1000()
	{
		String st="1009,#56";
		Assert.assertEquals("65", calcMainObj.calculate(st));
	}
	
	@Test
	public void delimitersOfAnyLength()
	{
		String st="//[***]\\n34***57***7";
		Assert.assertEquals("98", calcMainObj.calculate(st));
	}
	
	@Test
	public void multipleDelimiters()
	{
		String st="//[*][%]\\n9*9%9";  
		Assert.assertEquals("27", calcMainObj.calculate(st));
	}
	
	@Test
	public void multipleDelimitersWithSpaces()
	{
		String st="//*% 9\n*9%9#";
		Assert.assertEquals("0", calcMainObj.calculate(st));
	}

}
