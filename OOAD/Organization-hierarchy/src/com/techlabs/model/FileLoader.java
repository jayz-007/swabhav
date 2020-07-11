package com.techlabs.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileLoader implements ILoader {
	ArrayList<String> lines = new ArrayList<String>();

	public FileLoader() throws Exception {
		try {
			File file = new File("Employees.csv");

			BufferedReader br = new BufferedReader(new FileReader(file));

			String line;
			while ((line = br.readLine()) != null)
				lines.add(line);
			br.close();
		} catch (Exception e) {

		}
	}

	public ArrayList<String> getData() {
		lines.remove(0);
		return lines;
	}

}