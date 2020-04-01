package com.techlabs.serialization.model.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.techlabs.serialization.model.Account;

public class SerializationArrayOfObjectsTest {
	public static void main(String args[]) throws IOException {

		Account[] accounts = new Account[3];
		accounts[0] = new Account(111, "xyz", 400);
		accounts[1] = new Account(112, "xyz", 300);
		accounts[2] = new Account(113, "xyz", 600);

		File file = new File("ser.data");

		doSerialization(accounts, file);
	}

	public static void doSerialization(Account[] acc, File f) throws IOException {

		FileOutputStream file = new FileOutputStream(f);
		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(acc);

		out.close();
		file.close();

		System.out.println("done");

	}

}
