package helloworld_nandha;


import java.util.*;

import org.junit.*;

public class calcTest {

	private Scanner sc;
	private  calcMain calcMainObj;
	
	@Before
	public void setup() 
	{
		calcMainObj= new calcMain();
	}


	@Test
	public void twoNumbersWithComma()
	{
		String st="2,2";
		Object numbers= (Object)st;
		String numberReturned= calcMainObj.play(numbers);
		System.out.println("Result is \n"+ numberReturned);
		
	}
	
	@Test
	public void singlenumber()
	{
		String st="2";
		Object numbers= (Object)st;
		String numberReturned= calcMainObj.play(numbers);
		System.out.println("Result is \n"+ numberReturned);
		
	}
	
	@Test
	public void noValue()
	{
		String st="";
		Object numbers= (Object)st;
		String numberReturned= calcMainObj.play(numbers);
		System.out.println("Result is \n"+ numberReturned);
		
	}
	
	@Test
	public void unknownAmountOfNumbers()
	{
		String st="2,3,5";
		Object numbers= (Object)st;
		String numberReturned= calcMainObj.play(numbers);
		System.out.println("Result is \n"+ numberReturned);
		
	}
	
	@Test
	public void withSlashN()
	{
		String st="1\n2,3";
		Object numbers= (Object)st;
		String numberReturned= calcMainObj.play(numbers);
		System.out.println("Result is \n"+ numberReturned);
		
	}
	
	@Test
	public void withDifferentDelimiters()
	{
		String st="//;\\n1;2";
		Object numbers= (Object)st;
		String numberReturned= calcMainObj.play(numbers);
		System.out.println("Result is \n"+ numberReturned);
		
	}
	
	@Test
	public void withNegativeNumbers()
	{
		String st="6,8-9";
		Object numbers= (Object)st;
		String numberReturned= calcMainObj.play(numbers);
		System.out.println("Result is \n"+ numberReturned);
		
	}
	
	@Test
	public void numberBiggerThan1000()
	{
		String st="2+1001";
		Object numbers= (Object)st;
		String numberReturned= calcMainObj.play(numbers);
		System.out.println("Result is \n"+ numberReturned);
		
	}
	
	@Test
	public void delimitersOfAnyLength()
	{
		String st="//[***]\\n1***2***3";
		Object numbers= (Object)st;
		String numberReturned= calcMainObj.play(numbers);
		System.out.println("Result is \n"+ numberReturned);
		
	}
	
	@Test
	public void multipledelimiters()
	{
		String st="//[*][%]\\n1*2%3";
		Object numbers= (Object)st;
		String numberReturned= calcMainObj.play(numbers);
		System.out.println("Result is \n"+ numberReturned);
		
	}

	
	@Test
	public void forUserInput()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter the input \n");
		Object numbers= sc.nextLine();
		String numberReturned= calcMainObj.play(numbers);
		System.out.println("Result is \n"+ numberReturned);
		
	}
	
	
	
}
