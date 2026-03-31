package lambdaExpression;

import java.util.*;
import java.util.Arrays;


public class NameUppercasing {
	public static void main(String[] args) {
		List<String> ls=Arrays.asList("shivam","ram","shyam","mohan");
		
		if(ls.isEmpty()) {
			System.out.println("List is empty");
		}else {
			ls.stream().map(x->x.toUpperCase()).forEach(System.out::println);
		}
		
		
	}

}
