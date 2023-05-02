package com.secondSetofProgram;
//difference between while and do_while
//in while loop condition will be applied first.The loop will  execute the body/task as long as the the condition is true.
//if the condition is false then loop wont  execute the task/body.(entry-controlled)

//in do while loop the task will be applied first then the condition.the body/task will be executed at least once
//irrespective of the condition. then the body will be executed more times as long as the while condition applies.
//(exit-controlled)

//we should go for while and do_while loop when we don't know how many times the body/loop will be executed(iteration).





public class SumAverageRunningInt_DoWhileLoop 
{

	public static void main(String[] args)
	{
		int lowerBound = 1;
		int upperBound = 100;
		int sum =0;
		int i=lowerBound;//initialization
		
		do
		{
			sum+=i;//task
			i++;//incrementing until condition satisfied
		}
		while(i<=upperBound);//condition 
		
		double average = (double)sum/upperBound;//average calculation
		
		System.out.println("The sum of "+ lowerBound+ " to "+ upperBound+" is " +sum);
		System.out.println("The average is " + average);		
		
	}

}
