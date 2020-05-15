package com.techlabs.model.test;

import java.io.File;
import java.net.URL;

public class Test2 {
	public static void main(String args[]) {
		System.out.println(urlValidator("C:\\Users\\Admin\\Desktop\\New folder (4)"));
		System.out.println(fileValidator("C:\\Users\\Admin\\Desktop\\New folder (4)\\tic-tac-toe.jar"));

	}
	
	public static boolean fileValidator(String file) {
		File newFile = new File(file);
		return(newFile.exists());
		
	}

	public static boolean urlValidator(String url) {

		try {
			new URL(url).toURI();
			return true;
		}

		catch (Exception e) {
			return false;
		}
	}

}
