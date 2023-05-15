package practice;

import java.util.*;

public class mapParactice {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("ice cream", "mango");
		
		map.put("pancake" ," syrup");
		Map<String,String> result = topping1(map);
		System.out.println(result);
	
	}
	public static  Map<String, String> topping1(Map<String, String> map) {
		 map.put("bread","butter");
		 for (Map.Entry<String, String> entry : map.entrySet()) {
			  String key = entry.getKey();
			  
			  if (key.equals("ice cream")) {
			    
			    entry.setValue("cherry");
			  }
			}
		
		 return map;

}
}
