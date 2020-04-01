package com.techlabs.annotations.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Foo {

	@MyNeedForRefactor
	void m1() {

	}

	void m2() {

	}

	@MyNeedForRefactor
	void m3() {

	}

	void m4() {

	}

}
