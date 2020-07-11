package com.techlabs.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class UrlLoader implements ILoader {
	ArrayList<String> lines = new ArrayList<String>();

	public UrlLoader() {
		try {

			URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
			BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream()));
			String line;
			while ((line = in.readLine()) != null) {
				lines.add(line);
			}
			in.close();
		} catch (MalformedURLException e) {
			System.out.println("Malformed URL: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("I/O Error: " + e.getMessage());
		}
	}

	public ArrayList<String> getData() {
		return lines;
	}
}