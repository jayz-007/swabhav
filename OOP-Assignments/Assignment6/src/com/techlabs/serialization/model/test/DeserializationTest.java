package com.techlabs.serialization.model.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlabs.serialization.model.Account;

public class DeserializationTest {
	public static void main(String args[]) throws ClassNotFoundException, IOException {

		doDeSerialiazation();

	}

	public static void doDeSerialiazation() throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("ser.data");
		ObjectInputStream in = new ObjectInputStream(file);

		Account acc1 = (Account) in.readObject();

		in.close();
		file.close();

		System.out.println(acc1.getBalance());
	}

}
