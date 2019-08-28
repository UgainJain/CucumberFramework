package utils.dataSource;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperty {
	static Properties prop;
	static String var = null;
public static String getvar(String key,String file) {
	try {
		String path = System.getProperty("user.dir");
		if(file == "config") {
		path = path +"/Resources/";
		prop = new Properties();
		prop.load(new FileInputStream(path +"config.properties"));
	}else {
		System.out.println("No Such File");
	}
	if(key!= null){
		var = prop.getProperty(key);
	}
	else {
		System.out.println("Null Key Found");
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return var;
} 
}
