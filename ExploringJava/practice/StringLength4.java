package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength4 {

	public static void main(String[] args) {
List<String> strings = Arrays.asList("zoe","yamun","zeebra","hello","hi");
		
		List<String> result = noLong(strings);
		System.out.println(result);

	}
	public static List<String> noLong(List<String> string) {
		return string.stream().filter(s->s.length()<=4).collect(Collectors.toList());
		  
	}
}


