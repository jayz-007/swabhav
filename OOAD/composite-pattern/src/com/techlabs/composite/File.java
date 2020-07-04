package com.techlabs.composite;

public class File implements IDiscItem {
	private String name;
	private String extension;
	private int size;

	public File(String name, String extension, int size) {
		this.name = name;
		this.extension = "." + extension;
		this.size = size;
	}

	@Override
	public String show(int level) {
		return ("file name " + this.name + "file extension " + this.extension + "file size " + this.size);
	}

}
