package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Number9 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(9,10,22,29,32,99,17,92,29);
		List<Integer> result = no9(nums);
		System.out.println(result);
		
		
	}
	public  static List<Integer> no9(List<Integer> nums) {
		  return nums.stream().filter(n->n%10!=9).collect(Collectors.toList());
	}
	

}
