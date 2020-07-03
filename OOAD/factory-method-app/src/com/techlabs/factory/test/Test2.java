package com.techlabs.factory.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

import com.techlabs.factory.AudiFactory;
import com.techlabs.factory.BMWFactory;
import com.techlabs.factory.IAutoFactory;
import com.techlabs.factory.IAutomobile;
import com.techlabs.factory.TeslaFactory;

public class Test2 {
	public static void main(String args[]) throws IOException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		IAutoFactory factory = injectDependency();
		IAutomobile auto = factory.make();
		auto.start();
		auto.stop();

	}

	private static IAutoFactory injectDependency() throws IOException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Properties p = new Properties();
		InputStream is = new FileInputStream("\\dependecy\\factory.properties");
		p.load(is);
		System.out.println(p.getProperty("factory"));
		Class className = Class.forName(p.getProperty("factory"));
		Method method = className.getDeclaredMethod("getInstance", null);
		return (IAutoFactory) method.invoke(null, null);

	}
}
