import java.util.Stack;

public class RecursionProbsRunner {
	
	public static void main(String [] args)
	{
		RecursionProbs tester = new RecursionProbs();
		System.out.println(tester.sumReciprocals(10));
		System.out.println(tester.productOfEven(4));
		Stack<Integer> test = new Stack<>();
		test.push(3);
		test.push(7);
		test.push(12);
		test.push(9);
		tester.doubleUp(test);
		System.out.println(test);
		tester.countToBy(34,5);
		System.out.println(tester.matchingDigits(1000, 0));
		tester.printThis(8);
		tester.printNums2(8);
	}

}
