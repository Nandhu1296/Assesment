package helloworld_nandha;

public class calcMain {
	
	public String play(String numbers)
	{
		int counts = 0;
		int resNum=0;
		if(numbers.contains(" ") || numbers.isEmpty())
		{
			return String.valueOf(resNum);		
		}
		else {
			String[] numberSplit = numbers.split(",");
			for (int i = 0; i < numberSplit.length; i++) 
			{
				resNum=resNum+Integer.parseInt(numberSplit[i]);
				counts=counts+1;
			}
			return String.valueOf(resNum);
		}
	}
}
