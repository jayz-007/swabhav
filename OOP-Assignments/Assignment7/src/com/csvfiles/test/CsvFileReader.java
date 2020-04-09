package com.csvfiles.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
	private static final String String = null;

	public static void main(String args[]) throws IOException {
		int totalrows = 10;
		String[][] products = new String[10][4];

		int totalcolumns = loadCsvFile(products);
		getDiscountedPrice(products, totalrows, totalcolumns);
		printCsv(products, totalrows, totalcolumns);

	}

	public static int loadCsvFile(String[][] products) throws IOException {
		String line = "";
		String splitBy = ",";
		int rows = 0;
		String[] product = null;
		BufferedReader br = new BufferedReader(new FileReader("products.csv"));
		while ((line = br.readLine()) != null) {
			product = line.split(splitBy);
			for (int j = 0; j < product.length; j++) {
				products[rows][j] = String.valueOf(product[j]);
			}
			rows++;

		}

		return product.length;
	}

	public static void getDiscountedPrice(String[][] products, int totalrows, int totalcolumns) {
		String temp = "";
		int price = 0, discount = 0;
		for (int column = 0; column < totalcolumns; column++) {
			if (products[0][column].contains("price")) {
				price = column;
			} else if (products[0][column].contains("discount")) {
				discount = column;
			}
		}

		for (int row = 1; row < totalrows; row++) {
			if (products[row][price] != null)
				products[row][price] = String.valueOf(Float.parseFloat(products[row][price])
						- (Float.parseFloat(products[row][price]) * (Float.parseFloat(products[row][discount]))));
		}
	}

	public static void printCsv(String[][] products, int totalrows, int totalcolumns) {
		for (int row = 0; row < totalrows; row++) {
			if (products[row][1] != null) {
				for (int column = 0; column < totalcolumns; column++) {
					if (products[row][column] != null)
						System.out.print(products[row][column] + " ");

				}
				System.out.println();
			}
		}
	}
}
