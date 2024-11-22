package ProgramToWriteHowManyTimesANumberAndStringIsRepeated;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
//		Integer[]a= {1,2,3,4,5,6,7,8,9,1,2,3,4,5};
//		
//		Map<Integer, Long> collect = Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//	
//	collect.forEach((k,v)->System.out.println(k+" "+v));
		
		//now the program to find how many times does the string is repeated
		
		String[]s2= {"krishna","krishna","jyoti","anoosha","suraj","satish","satish"};
		
		List<String> asList = Arrays.asList(s2);
	Map<String, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	collect.forEach((k,v)->System.out.println(k+" "+v));
	
	}
}
