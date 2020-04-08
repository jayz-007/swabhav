package com.csvfiles.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
	public static void main(String args[]) throws IOException {
		String line = "";
		String splitBy = ",";
		String[][] products = new String[10][3];
		int i = 0;
		

			File newfile = new File("my.csv");
			System.out.println("new file created" + newfile.getName());
			
		

		{
			// parsing a CSV file into BufferedReader class constructor
			BufferedReader br = new BufferedReader(new FileReader("products.csv"));
			while ((line = br.readLine()) != null) // returns a Boolean value
			{
				String[] product = line.split(splitBy);
				for(int j = 0;j<product.length;j++) {
					products[i][j] = String.valueOf(product);
				}
				i++;
				

			}
			for(i= 0;i<=10;i++) {
				for(int j = 0;j<3;j++) {
					System.out.println(products [i][j]);
				}
			}
			
			
		

		}
		{
		}

	}
}