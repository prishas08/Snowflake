import java.util.Stack;

public class RecursionProbs {
	
	public double sumReciprocals(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return (double)1/n + sumReciprocals(n-1);
		}
	}
	
	public int productOfEven(int n)
	{
		if(n==1)
		{
			return 2;
		}
		else
		{
			return productOfEven(n-1) * (n*2);
		}
	}
	public void doubleUp(Stack<Integer> nums)
	{
		/*final int length = nums.size();
		if(nums.size()==length*2-2)
		{
			nums.push(nums.peek());
		}
		else
		{
			nums.push(nums.peek());
			doubleUp(nums);
		}*/
	}
	public void countToBy(int n, int m)
	{
		
	}
	
	public int matchingDigits(int a, int b)
	{
		return 0;
	}
	
	public void printThis(int n)
	{
		
	}
	
	public void printNums2(int n)
	{
		
	}
			
}