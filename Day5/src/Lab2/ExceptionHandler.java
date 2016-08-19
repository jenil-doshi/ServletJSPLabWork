package Lab2;

import java.util.Scanner;

public class ExceptionHandler {

	public enum MONTHS_OF_YEAR {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMER, DECEMEBER;
	}

	static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public static boolean verify(String month, int day) throws BadMonth, BadDay {
		boolean isValid = false;
		try {
			MONTHS_OF_YEAR mon = MONTHS_OF_YEAR.valueOf(month);
			if (days[mon.ordinal()] != day) {
				throw new BadDay("BadDay Exception. Enter valid number of days.");
			}
		} catch (Exception e) {
			throw new BadMonth(e);
		}
		isValid = true;
		return isValid;
	}
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter the month name: ");
			Scanner sc = new Scanner(System.in);
			String month = sc.nextLine();
			System.out.println("Enter the day of that month: ");
			int day = sc.nextInt();
			try {
				if (verify(month, day)) {
					System.out.println("Success!!!");
					break;

				} else {
					System.out.println("Try again");
				}
			} catch (BadMonth e) {
				System.out.println(e.getCause());
			} catch (BadDay e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("Try again!");
				e.printStackTrace();
			}
		}

	}
}
