package property_file.test;

import java.util.*;
import java.io.*;

public class PropertyFileTest {
	public static void main(String[] args) throws Exception {

		Properties p = new Properties();
		InputStream is = new FileInputStream("file.properties");
		p.load(is);
		Set<String> attributes = p.stringPropertyNames();
		
		readUsingForEachLoop(attributes, p);
		readUsingIterator(p);
	}

	public static void readUsingIterator(Properties p) {
		Iterator keyIterator = p.keySet().iterator();
		while (keyIterator.hasNext()) {
			String attribute = (String) keyIterator.next();
			String value = p.getProperty(attribute);
			System.out.println( value);
		}
	}

	public static void readUsingForEachLoop(Set<String> attributes, Properties p) {
		for (String attribute : attributes) {
			System.out.println( p.getProperty(attribute));
		}
	}
}
