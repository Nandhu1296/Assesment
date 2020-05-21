package helloworld_nandha;

import java.awt.font.NumericShaper;
import java.util.Scanner;

import org.junit.*;

public class calcTest {

	private Scanner sc;

	@Test
	public void testNumber1()
	{
		calcMain calcMainObj= new calcMain();
		sc = new Scanner(System.in);
		int counts = 0;
		System.out.println("Enter the two numbers seperated by comma's \n");
		String numbers= sc.nextLine();
		
		if(numbers.contains(" ") || numbers.isEmpty()) {
			int newNum=0;
			System.out.println("The result is \n"+ newNum);
		}
		else {
			String[] numberSplit = numbers.split(",");
			for (int i = 0; i < numberSplit.length; i++) 
			{
				counts=counts+1;
			}
			if(counts == 1) {
				String newNum=numberSplit[0];
				System.out.println("The result is \n"+ newNum);
			}else {
				String c1= numberSplit[0];
				String c2= numberSplit[1];
				String numberReturned= calcMainObj.play(c1,c2);
				System.out.println("The result is \n"+ numberReturned);
			}
			
		}
		
	}
	
}
