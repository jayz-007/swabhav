package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IDiscItem {
	private String name;
	private List<IDiscItem> childrens = new ArrayList<IDiscItem>();

	public Folder(String name) {
		this.name = name;
	}

	public void addChildren(IDiscItem item) {
		childrens.add(item);
	}

	@Override
	public String show(int level) {
		level++;
		String folderItems = "folder name " + this.name + "\n";
		for (IDiscItem children : childrens) {
			if(children instanceof File)
			folderItems = folderItems + addLevelSpaces(level)+children.show(level)+'\n';
			else
				folderItems = folderItems + addLevelSpaces(level)+children.show(level);
				
		}
		return folderItems;

	}

	public String addLevelSpaces(int level) {
		String spaces = "\t";
		for (int i = 0; i < level; i++) {
			spaces = spaces + "\t";

		}
		return spaces;
	}

}
