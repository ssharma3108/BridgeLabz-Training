package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TransformingNames {
public static void main(String[] args) {
	List<String> list=Arrays.asList("ram","shyam","akash","raman");
	
	list.stream().map(x->x.toUpperCase()).sorted(Comparator.comparing(x->x.toString())).forEach(System.out::println);
	
	
}
}
