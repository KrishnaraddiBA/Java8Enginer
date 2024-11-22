package HowToResuseSreams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an string array");
		int size=scan.nextInt();
		String[]s1=new String[size];
		
		System.out.println("enter the values in the string array");
		for (int i = 0; i < s1.length; i++) {
			s1[i]=scan.next();
		}
		
		
//		 Stream<String> stream = Arrays.asList(s1).stream();
//		long count = stream.filter(s->s.equals("krishna")).count();
//
//	System.out.println(count);
		
		
		//by using the same streams we cannot reuse the streams
//		so we have touse a supplier interface
		
		

		Supplier<Stream<String>> of =()-> Stream.of(s1);
		of.get().forEach(System.out::println);
		
		
	}
}
