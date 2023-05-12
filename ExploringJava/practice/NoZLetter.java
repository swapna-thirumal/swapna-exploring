package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoZLetter {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("zoe","yamun","zeebra","hello");
		
		List<String> result = noZ(strings);
		System.out.println(result);

	}
	public static List<String> noZ(List<String> string) {
		return string.stream().filter(s->!s.contains("z")).collect(Collectors.toList());
		  
	}


}
