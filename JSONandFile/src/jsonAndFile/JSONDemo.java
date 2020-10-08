package jsonAndFile;

import org.json.simple.JSONObject;

public class JSONDemo {
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("Id", "1776716");
		obj.put("Name", "Gaurav");
		obj.put("Place", "Kolkata");
		obj.put("Office", "TCS");
		
		System.out.print(obj);
		
	}
}
