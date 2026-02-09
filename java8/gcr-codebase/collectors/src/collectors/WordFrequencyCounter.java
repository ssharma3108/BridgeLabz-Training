package collectors;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
public static void main(String[] args) {
	String inputString="java stream api java collections stream";
	
	Map<String, Integer> hsMap=new HashMap<String, Integer>();
	
    for (String word : inputString.split(" ")) {
        hsMap.put(word, hsMap.getOrDefault(word, 0) + 1);
    }

    //print the frequency
    for(Map.Entry<String, Integer> entry: hsMap.entrySet()) {
    	System.out.println(entry.getKey()+"-> "+entry.getValue());
    }
    
	
}
}
