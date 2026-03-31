package streamAPI;

import java.util.Arrays;
import java.util.List;

public class SensorReading {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(45, 72, 88, 30, 95);
	int threshold=70;
	
	
	list.stream().filter(x->x>threshold).forEach(System.out::println);
}
}
