package ToFindACountOfTheVowelsByUsingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		String s1="hello hello";
		//now first to find a vowels in the string
		
		long count = s1.chars().filter(s->{return (s=='a'||s=='e'||s=='i'||s=='o'||s=='u');}).count();
		System.out.println("hence the number of vowels are "+count);
		
		//now we will give an anather string now we have to find a duplicates in the string
		
		String s2="krishnaraddi";
		Map<String, Long> collect = s2.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
		collect.forEach((k,v)->System.out.println(k+" "+v));
	
	}
	
}
