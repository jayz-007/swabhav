package com.techlabs.serialization.model.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techlabs.serialization.model.Account;

public class SerializationTest {
	public static void main (String args[]) throws IOException {
		Account acc1 = new Account(101, "xyz", 5000);
		acc1.deposit(2000);
		
		File file = new File("ser.data");
		doSerialization(acc1, file);
		
	
		 
		
	}
	
	public static void doSerialization(Account acc, File filename) throws IOException {
		
		
		FileOutputStream file = new FileOutputStream(filename); 
        ObjectOutputStream out = new ObjectOutputStream(file); 
          
        out.writeObject(acc);
          
        out.close(); 
        file.close(); 
        
        System.out.println("done");
		
	}

}
