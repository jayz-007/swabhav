package com.techlabs.model.OCP.test;

import com.techlabs.model.OCP.FileLoader;
import com.techlabs.model.OCP.IDBManager;
import com.techlabs.model.OCP.ILoader;
import com.techlabs.model.OCP.MyDBManager;
import com.techlabs.model.OCP.URLLoader;

public class Test {
	public static void main (String args[]) {
		ILoader urlLoader = new URLLoader();
		ILoader fileLoader = new FileLoader();
		IDBManager db = new MyDBManager();
		db.createLoader(urlLoader);
		db.createLoader(fileLoader);
	}

}
