package com.techlabs.annotations.model.test;

import com.techlabs.annotations.model.MyNeedForRefactor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.techlabs.annotations.model.Foo;

public class FooTest {
	public static void main(String args[]) {

		doReflection(Foo.class);

		
		
		
			}
	public static void doReflection(Class reflection) {
		Method[] m = reflection.getDeclaredMethods();
		for (Method methods : m) {
			if (methods.isAnnotationPresent(MyNeedForRefactor.class)) {
				MyNeedForRefactor anno = methods.getAnnotation(MyNeedForRefactor.class);
				System.out.println(methods.getName() + " " + anno.value);  

			}

		}

	}
}
