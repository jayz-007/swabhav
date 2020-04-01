package com.techlabs.annotations.model;
import java.lang.annotation.*; 
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyNeedForRefactor {
	public String value = "Need for refactor";

}
