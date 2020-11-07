import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflection {
	public static void main(String args[]) {
		Class reflectionclass = String.class;

		String classname = reflectionclass.getName();

		Method[] classmethods = reflectionclass.getMethods();

		showGetterMethods(classmethods);
		showSetterMethods(classmethods);
		showFields(reflectionclass);

	}

	public static void showSetterMethods(Method[] classmethods) {
		System.out.println("Getter methods");
		for (Method getterMethod : classmethods) {

			if (getterMethod.getName().startsWith("get")) {
				System.out.println(getterMethod.getName());
			}

		}
		System.out.println();
	}

	public static void showGetterMethods(Method[] clasMethods) {
		System.out.println("Stter  methods");
		for (Method setterMethod : clasMethods) {

			if (setterMethod.getName().startsWith("set")) {
				System.out.println(setterMethod.getName());
			}

		}
		System.out.println();

	}

	public static void showFields(Class reflectionclass) {
		System.out.println("Fields");
		Field fields[] = reflectionclass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		System.out.println();
	}

}
