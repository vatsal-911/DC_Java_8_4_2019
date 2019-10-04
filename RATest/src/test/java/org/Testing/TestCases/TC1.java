package org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.Testing.TestSteps.HTTPMethods;
import org.Testing.Utilities.PropertiesFileLoad;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TC1 {
	
	
	@Test
	public void testCase1() throws IOException {
		
		Random r=new Random();
		JSONObject json_ob=new JSONObject();
		json_ob.put("f_name", "rahul");
		json_ob.put("l_name", "gandhi");
		json_ob.put("designation", "MP");
		json_ob.put("age", "50");
		json_ob.put("marital_status", "bachelor");
		json_ob.put("Id", r.nextInt(99));				
		Properties pr=PropertiesFileLoad.Property_Load();
		HTTPMethods http=new HTTPMethods(pr);
		http.PostRequest(json_ob.toString());
		
	}
	
}
