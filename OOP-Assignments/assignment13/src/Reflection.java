import java.lang.reflect.Method;

public class Reflection {
	public static void main(String args[]) {
		Class reflectionclass = String.class;

		String classname = reflectionclass.getName();

		Method[] classmethods = reflectionclass.getMethods();
		System.out.println("Getter methods");
		for (Method a : classmethods) {

			if (a.getName().startsWith("get")) {
				System.out.println(a.getName());
			}

		}
		System.out.println("Stter  methods");
		for (Method a : classmethods) {

			if (a.getName().startsWith("set")) {
				System.out.println(a.getName());
			}

		}

	}

}
