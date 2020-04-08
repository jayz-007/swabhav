package unit.testcase.model.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
		
		Method[] methods = reflection.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(UnitTestCase.class)) {
				if ((boolean) method.invoke(obj)) {
					System.out.println(method.getName() + " is passing case");
				} else
					System.out.println(method.getName() + " is failing case");
			} else {
				System.out.println(method.getName() + " is not a testcase");
			}
		}
	}

}
