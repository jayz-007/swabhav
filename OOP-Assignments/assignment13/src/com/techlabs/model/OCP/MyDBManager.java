package com.techlabs.model.OCP;

public class MyDBManager implements IDBManager {

	@Override
	public void createLoader(ILoader loader) {
		loader.showLoader();
		
	}

}
