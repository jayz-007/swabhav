package unit.testcase.model.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import unit.testcase.model.BeforeEveryUnitTest;
import unit.testcase.model.Foo;
import unit.testcase.model.UnitTestCase;

public class FooTest {
	public static void main(String args[])
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Foo test = new Foo();

		doReflection(test.getClass(), test);
	}

	public static void doReflection(Class reflection, Object obj)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int totaltestcases = 0;
		Method before = invokeBeforeUnitTestAnnotedMethod(reflection);
		Method[] methods = reflection.getDeclaredMethods();
		for (Method method : methods) {
			before.invoke(obj);
			if (method.isAnnotationPresent(UnitTestCase.class)) {
				totaltestcases++;

				if ((boolean) method.invoke(obj)) {
					System.out.println(method.getName() + " is passing case");
				} else
					System.out.println(method.getName() + " is failing case");
			} else {
				System.out.println(method.getName() + " is not a testcase");
			}
		}
		System.out.println("total test cases are : " + totaltestcases);
	}

	public static Method invokeBeforeUnitTestAnnotedMethod(Class reflection)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] methods = reflection.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(BeforeEveryUnitTest.class)) {
				return method;

			}
		}
		return null;

	}
}