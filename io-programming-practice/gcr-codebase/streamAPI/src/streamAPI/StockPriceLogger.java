package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {
public static void main(String[] args) {
	List<Double>list=Arrays.asList(120.5, 121.0, 119.8, 122.3);
	
	list.stream().forEach(System.out::println);
	
}
}
