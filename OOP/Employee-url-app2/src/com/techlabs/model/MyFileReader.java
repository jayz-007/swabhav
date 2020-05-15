package com.techlabs.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MyFileReader {
	ArrayList<String> lines = new ArrayList<String>();
	private String file;

	public MyFileReader(String file) {
		this.file = file;
		if (urlValidator()) {
			urlReader();
		}else if(fileValidator()) {
			readTextFile();
			
		}
		else {
			System.err.println("Please enter a valid url or a file address");
		}

	}

	public void urlReader() {
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
	
	public void readTextFile() {
		try {
			File myFile = new File(file);
			BufferedReader br = new BufferedReader(new FileReader(myFile));
			String line;
			while(((line = br.readLine())!=null)) {
				lines.add(line);
			}
			br.close();
			
		} catch (Exception e) {
			System.out.println("Invalid file:");
		}
		
	}

	public boolean urlValidator() {

		try {
			new URL(file).toURI();
			return true;
		}

		catch (Exception e) {
			return false;
		}
	}

	public boolean fileValidator() {
		File newFile = new File(file);
		return (newFile.exists());

	}

	public ArrayList<String> read() {
		return lines;
	}
}