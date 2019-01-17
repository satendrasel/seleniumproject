package datadriventesting;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

public class Readdata {

	public static void main(String[] args) throws Throwable {
		FileInputStream fobj = new FileInputStream("./Commondata.properties");
Properties pobj = new Properties();
pobj.load(fobj);
String USER =pobj.getProperty("Username");
String Psw =pobj.getProperty("Password");
String URL =pobj.getProperty("Url");
System.out.println(USER);
System.out.println(Psw);
System.out.println(URL);
	}

}
