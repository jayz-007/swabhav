package property_file.test;

import java.util.*;
import java.io.*;
import java.util.Properties;

public class PropertyFileTest {
	public static void main(String args[]) throws IOException {
		readFile();

	}


	public static void readFile() throws IOException {
		FileReader reader = new FileReader("file.properties");

		Properties p = new Properties();
		p.load(reader);

		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));

	}

}
