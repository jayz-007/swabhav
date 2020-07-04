package com.techlabs.composite;

public class Test {
public static void main(String args[]) {
	Folder root = new Folder("root");
	Folder achild = new Folder("child");
	File lmn = new File("lmn", "avi", 1);
	File abc = new File("abc", "avi", 20);
	File pqr = new File("pqr", "pqr", 23);
	achild.addChildren(lmn);
	root.addChildren(abc);
	root.addChildren(achild);
	root.addChildren(pqr);
	System.out.println(root.show(0));
	
}
}
