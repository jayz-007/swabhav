package com.techlabs.serialization.model.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlabs.serialization.model.Account;

public class DeSerializationArrayOfObjectsTest {
	public static void main(String args[]) throws Exception {
		
		doDeSerialiazation();

	}
	
	public static void doDeSerialiazation() throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("ser.data");
		 ObjectInputStream in = new ObjectInputStream(file); 
         
         Account[] acc = (Account[])in.readObject(); 
           
         in.close(); 
         file.close(); 
         
         for(Account accounts : acc) {
        	 printInfo(accounts);
        	 
         }
	}

	

	public static void printInfo(Account acc) {
		System.out.println("account id: " + acc.getAccno() + " account name: " + acc.getName() + " account balance: "
				+ acc.getBalance());
	}

}
