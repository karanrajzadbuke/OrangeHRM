package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample 
{
	
	@Test(dataProvider = "NumberInputs")
	public void sum (int x , int y)
	{
		int sum = x + y;
		System.out.println("Sum of two numbers is: " + sum);		
	}
	
	@DataProvider(name ="NumberInputs")
	public Object[][] dataInput()
	{
		return new Object[][]
				{
			{10,20},{20,30}			
				};
	}

}
