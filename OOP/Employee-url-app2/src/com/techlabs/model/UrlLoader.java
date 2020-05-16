package com.techlabs.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UrlLoader implements ILoader {
	private List lines = new ArrayList<String>();

	public UrlLoader(String pathname) {
		try {

			URL url = new URL(pathname);
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

	@Override
	public List getData() {
		// TODO Auto-generated method stub
		return lines;
	}

}
