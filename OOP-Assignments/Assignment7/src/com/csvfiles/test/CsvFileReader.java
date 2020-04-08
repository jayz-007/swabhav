package com.csvfiles.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
	private static final String String = null;

	public static void main(String args[]) throws IOException {

		String[][] products = new String[10][4];
		
		int totalrows = loadCsvFile(products);
		swapColumns(products, totalrows);
		printCsv(products, totalrows);

	}

	public static int loadCsvFile(String[][] products) throws IOException {
		String line = "";
		String splitBy = ",";
		int rows = 0;
		BufferedReader br = new BufferedReader(new FileReader("products.csv"));
		while ((line = br.readLine()) != null) // returns a Boolean value
		{
			String[] product = line.split(splitBy);
			for (int j = 0; j < product.length; j++) {
				products[rows][j] = String.valueOf(product[j]);
			}
			rows++;

		}
		return rows;
	}

	public static void swapColumns(String[][] products, int totalrows) {
		String temp = "";
		for (int row = 0; row < totalrows; row++) {

			temp = products[row][2];
			products[row][2] = products[row][3];
			products[row][3] = temp;
		}
	}

	public static void printCsv(String[][] products, int totalrows) {
		for (int row = 0; row < totalrows; row++) {
			if (products[row][1] != null) {
				for (int j = 0; j <= 3; j++) {
					if (products[row][j] != null)
						System.out.print(products[row][j] + " ");

				}
				System.out.println();
			}
		}
	}

}
