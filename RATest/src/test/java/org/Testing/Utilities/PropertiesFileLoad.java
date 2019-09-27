package org.Testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad {
public static Properties Property_Load() throws IOException {
	File f=new File("C:\\Users\\asus\\eclipse-workspace\\RATest\\Env.properties");
	Properties pr=new Properties();
	FileInputStream f_input=new FileInputStream(f);
	pr.load(f_input);
	return pr;
}
}
