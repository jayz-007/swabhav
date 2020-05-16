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
import java.util.Collections;
import java.util.List;

public class CSVLoader implements ILoader {
	List lines = new ArrayList<String>();

	public CSVLoader(String pathname) {
		try {
			File myFile = new File(pathname);
			BufferedReader br = new BufferedReader(new FileReader(myFile));
			String line;
			while (((line = br.readLine()) != null)) {
				lines.add(line);
			}
			br.close();

		} catch (Exception e) {
			System.out.println("Invalid file:");
		}

	}

	@Override
	public List getData() {
		// TODO Auto-generated method stub
		return lines;
	}
}