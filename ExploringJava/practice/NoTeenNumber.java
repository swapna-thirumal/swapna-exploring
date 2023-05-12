package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeenNumber 
{

	public static void main(String[] args) 
	{
		List<Integer> nums = Arrays.asList(9,10,22,13,35,19,17,92,29);
		List<Integer> result = noTeen(nums);
		System.out.println(result);
	}
	public  static List<Integer> noTeen(List<Integer> nums) 
	{
		  return nums.stream().filter(n->!(n>=13 && n<=19)).collect(Collectors.toList());
	}
}


