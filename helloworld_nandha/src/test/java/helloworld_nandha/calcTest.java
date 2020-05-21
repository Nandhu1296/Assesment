package helloworld_nandha;


import java.util.*;

import org.junit.*;

public class calcTest {

	private Scanner sc;

	@Test
	public void testNumber1()
	{
		calcMain calcMainObj= new calcMain();
		sc = new Scanner(System.in);
		System.out.println("Enter the two numbers seperated by comma's \n");
		Object numbers= sc.nextLine();
		
		String numberReturned= calcMainObj.play(numbers);
		System.out.println("Result is \n"+ numberReturned);
		
	}
	
}
