package jsonData;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonExample {
    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("Name", "Shivam");
        jsonObject.put("Age", 21);

        JSONArray subjects = new JSONArray();
        subjects.put("Math");
        subjects.put("Science");
        subjects.put("English");
        subjects.put("Hindi");

        jsonObject.put("Subjects", subjects);

        System.out.println(jsonObject.toString()); 
}
}
