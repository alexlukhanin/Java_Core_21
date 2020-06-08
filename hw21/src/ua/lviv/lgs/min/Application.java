/**
 * Homework application  - lesson 21 - Annotations
 */
package ua.lviv.lgs.min;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Field;


/**
 * @author alexl
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("fields.txt");
		try {
			getAnnotatedFiels(Worker.class, file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	public static void getAnnotatedFiels(Class<?> customClass, File file) throws FileNotFoundException {
		Field[] fields = customClass.getDeclaredFields();
		PrintWriter pw = new PrintWriter(file);
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(FieldInfo.class) instanceof FieldInfo) {
				pw.println("field -> [" + field + "] has name -> [" + field.getName() + "]");
				System.out.println("field - > [" + field + "] has name -> [" + field.getName() + "]"); // doubling to
																										// the console -
																										// for testing
																										// purposes
			}
		}
		pw.close();
	}

}
