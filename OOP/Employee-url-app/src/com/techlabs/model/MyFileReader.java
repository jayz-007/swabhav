package com.techlabs.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MyFileReader {
	ArrayList<String> lines = new ArrayList<String>();

	public MyFileReader() {
		try {

			URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			while ((line = in.readLine()) != null) {
				lines.add(line);
			}
			in.close();
		} catch (MalformedURLException e) {
			System.out.println("URL not found " + e.getMessage());
		} catch (IOException e) {
			System.out.println("I/O Error: " + e.getMessage());
		}
	}

	public ArrayList<String> read() {
		return lines;
	}
}