package com.techlabs.annotations.model;
import java.lang.annotation.*; 
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyNeedForRefactor {
	public static String VALUE = "Need for refactor";

}
