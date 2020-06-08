/**
 * 
 */
package ua.lviv.lgs.max;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author alexl
 *
 */
public class Application {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println("Old Date format is:");
		System.out.println(date.toString());

		System.out.println();
		System.out.println("New LocalDate format is:");
		System.out.println(convertToLocalDate(date).toString());

		System.out.println();
		System.out.println("New LocalDateTime format is:");
		System.out.println(convertToLocalDateTime(date).toString());

		System.out.println();
		System.out.println("New LocalTime format is:");
		System.out.println(convertToLocalTime(date).toString());

	}

	public static LocalDate convertToLocalDate(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public static LocalDateTime convertToLocalDateTime(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

	public static LocalTime convertToLocalTime(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
	}

}
