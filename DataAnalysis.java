import java.util.Arrays;
import java.util.Scanner;

public class DataAnalysis {
	public static void main(String args[]) {

        double mean = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Data Items: ");
        int dataItems = Integer.parseInt(sc.nextLine());
        if (dataItems > 0) {
            double[] items = new double[dataItems];
            for (int i = 0; i < dataItems; i++) {
                System.out.println("Enter the Data Item " + (i + 1) + ": ");
                items[i] = Double.parseDouble(sc.nextLine());
                mean += items[i];  
            }
            Arrays.sort(items);
            System.out.println("Mean value of the Data Items:" + mean / dataItems);
            System.out.println("Smallest of all Data Items:" + items[0]);
            System.out.println("Largest of all Data Items:" + items[dataItems-1]);
        }
    }
}
