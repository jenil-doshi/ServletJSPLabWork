import java.util.Scanner;

public class FerhaniteToCelcius {

	public static void main(String[] args) {
		System.out.println("Enter the Degree in Ferhanite:");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		double f = Double.valueOf(line);
		double c = 5 * ( f-32 ) / 9;
		System.out.println("Temparatue in Degree Celcius is: " + c);		
	}
}
