package ApplyingADelimiterForAStringArray;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class A {

	
	//intput = "hello how are u";
	//output= "[hello-ho-are-u]"
	public static void main(String[] args) {
		String s1= "hello how are u";
		String[] split = s1.split(" ");
	
		StringJoiner sj=new StringJoiner("-", "[", "]");
		
		for (String string : split) {
			sj.add(string);
		}
		
		System.out.println(sj.toString());
		
		//now u are givven int o arrays of "hello","how","are","u"
		
		String[]s2= {"hello","how","are","u"};
		List<String> asList = Arrays.asList(s2);
	
		
		String collect = asList.stream().collect(Collectors.joining("-", "[", "]"));
	
		System.out.println(collect);
	}
}
