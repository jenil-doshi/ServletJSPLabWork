package Lab1;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		File firstFile = null;
		File secondFile = null;
		
		while (true) {
			try {
				System.out.println("Enter the file name from where you want to make copy.");
				firstFile = new File(sc.nextLine());
			
				break;
			} catch (Exception e) {
				System.out.println("File not found");
			}
		}
		while (true) {
			try {
				System.out.println("Please enter the file name to where you want to copy.");
				secondFile = new File(sc.nextLine());
				Files.copy(firstFile.toPath(), secondFile.toPath());
				System.out.println("File has been copied successfully...");
				break;
				
			} catch (IOException e) {
				System.out.println("Error in performing IO operation... ");
				e.printStackTrace();
			}
			catch (SecurityException e) {
				System.out.println("Error in granting permission... ");
				e.printStackTrace();
			}
			catch (Exception e) {
				System.out.println("File not found!");
				e.printStackTrace();
			}
		}
	}

}
