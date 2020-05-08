package com.techlabs.model.test;
import java.util.ArrayList;
import java.util.Vector;


public class VectorTest {
		public static void main(String[] arg) {

			Vector<String> vevtorOfFruits = new Vector<String>();
			ArrayList<String> listOfFruits = new ArrayList<String>();

			vevtorOfFruits.add("Guava");
			vevtorOfFruits.add("Mango");
			vevtorOfFruits.add("Banana");
			vevtorOfFruits.add("Grapes");
			vevtorOfFruits.add("Apple");

			listOfFruits.add("Guava");
			listOfFruits.add("Peach");
			listOfFruits.add("Watermelon");
			listOfFruits.add("Pineapple");

			vevtorOfFruits.addAll(listOfFruits);

			System.out.println(vevtorOfFruits.lastElement());

			System.out.println("Vector is " + vevtorOfFruits);
		}
	}


