package jsonData;

import javax.security.auth.Subject;

import org.json.JSONArray;
import org.json.JSONObject;




public class MergeTwoJSON {
public static void main(String[] args) {
	JSONObject jsonObject=new JSONObject();
	jsonObject.put("name", "Shivam");
	jsonObject.put("Age", 21);
	jsonObject.put("Gender", "Male");
	
	JSONArray jsonArray=new JSONArray();
	
	jsonArray.put("Math");
	jsonArray.put("Hindi");
	jsonArray.put("English");
	
	jsonObject.put("Subject", jsonArray);
	
	
	System.out.println(jsonObject.toString());
	
	
	
}
}
