package helloworld_nandha;


import java.util.*;


public class calcMain {
	
	public String calculate(String numbers)
	{
		int resNum=0;
		if(numbers.contains(" ") || numbers.isEmpty())
		{
			return String.valueOf(resNum);		
		}else if (numbers.contains("-")) {
			
			char[] chars = numbers.toCharArray();
		      
		      for(char c : chars){
		    	  
		    	  if(String.valueOf(c).matches("-") && (numbers.charAt(numbers.indexOf(c)+1)>0)) 
		    	  {
			        	System.out.println("Negatives not allowed ");
			        	System.out.println("number is"+String.valueOf(c)+numbers.charAt(numbers.indexOf(c)+1));

		    	  }
		      }
			
			return String.valueOf(resNum);		

		}
		else {
			String Delimeters="[//\\\\\\\\n,!.?:;@#$%^&*()_+=?'<>+\n]";
			String[] numberSplit = numbers.split(Delimeters);	
			List<String> numList = new ArrayList<String>();
			
			for (int i = 0; i < numberSplit.length; i++) 
			{
				String str= numberSplit[i];
				if (null != str && !str.equals(""))
				{
					numList.add(str);
				}
			}
			for(String s : numList)
			{
				if(Integer.parseInt(s) >= 1000) {
					int modulo=Integer.parseInt(s);
					modulo=modulo%1000;
					resNum=resNum+modulo;

				}else {
					resNum=resNum+Integer.parseInt(s);
				}
			    
			}
			return String.valueOf(resNum);
		}
	}
}