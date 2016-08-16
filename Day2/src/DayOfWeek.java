import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
        int day, month, year;
        Scanner sc = new Scanner(System.in);
        boolean timeToQuit = false;
        while(!timeToQuit) {
            System.out.println("Enter the Day:");
            String line=sc.nextLine();
            timeToQuit = line.equalsIgnoreCase("quit");
            if (!timeToQuit) {
                day = Integer.parseInt(line);

                System.out.println("Enter the Month:");
                month = Integer.parseInt(sc.nextLine());
                System.out.println("Enter the Year:");
                year = Integer.parseInt(sc.nextLine());

                if (month == 1 || month == 2) {
                    month += 12;
                    year -= 1;
                }

                int a = (26 * (month + 1)) / 10;
                int b = year / 4;
                int c = 6 * (year / 100);
                int d = year / 400;

                int remainder = (a + b + c + d + day + year) % 7;

                String result;

                switch (remainder) {
                    case 0:
                    	result = "Saturday";
                        break;
                    case 1:
                    	result = "Sunday";
                        break;
                    case 2:
                    	result = "Monday";
                        break;
                    case 3:
                    	result = "Tuesday";
                        break;
                    case 4:
                    	result = "Wednesday";
                        break;
                    case 5:
                    	result = "Thursday";
                        break;
                    case 6:
                    	result = "Friday";
                        break;
                    default:
                    	result = "Error";
                        break;
                }
                System.out.println("The day of the date is :" + result);
            }
        }
    }
}
