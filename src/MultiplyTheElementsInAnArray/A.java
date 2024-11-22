package MultiplyTheElementsInAnArray;

import java.util.Arrays;
import java.util.Optional;

public class A {

	
	//this is to multiply the elements in an array
	
	public static void main(String[] args) {
		Integer[]a= {10,2,3,4,5,6};
		Optional<Integer> reduce = Arrays.stream(a).reduce((a1,a2)->{return a1*a2;});
		System.out.println(reduce.get());
		
	}
}
