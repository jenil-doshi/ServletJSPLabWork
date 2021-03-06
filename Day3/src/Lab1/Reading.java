package Lab1;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reading {

	 private static String dayOfWeek;
	 private static int hourOfDay;
	 private static double tempOfDay;
	 private static double windSpeed;
	 
	 public Reading(String type){
		 String[] elements = type.split(", ");
		 dayOfWeek = elements[0];
	     hourOfDay = Integer.valueOf(elements[1]);
	     tempOfDay = Double.valueOf(elements[2]);
	     windSpeed = Double.valueOf(elements[3]);
	 }
	 
	 public static String rateTemperature(){
	        if (tempOfDay < 55){
	            return "cold";
	        }
	        else if(tempOfDay >= 80){
	            return "hot";
	        }   
	        else if (tempOfDay >= 55 & tempOfDay < 65){
	            return "mild";
	        }
	        else if (tempOfDay >= 65 & tempOfDay < 80){
	            return "warm";
	        } else
	            return "";
	 }
	 
	 public static String getTime(){
	    switch(hourOfDay){
            case 9:
                return (dayOfWeek+" morning");
            case 15:
                return (dayOfWeek+" afternoon");
            case 21:
                return (dayOfWeek+ " evening");
            default:
                System.out.println("Wrong input");//Modify message accordingly
                return "";
	    }
	 }
	 
	 public static void main(String[] args) throws Throwable {    
		    BufferedReader br = Files.newBufferedReader(Paths.get("weather.csvx"));
		    Reading[] readings = new Reading[12];
		    String line;
		    for (int i = 0; i < readings.length; i++) {
		        readings[i] = new Reading(br.readLine());
		        System.out.println(getTime() + " was " + rateTemperature());
		    }
		}
}
