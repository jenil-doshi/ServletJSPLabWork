package Lab2;
public class VariableMethodArguments {

	private static String[] VALUES = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
	"Ten" };
	
	public static int toNumber(String numString) {
		int num = 0;
		switch (numString) {
		case "Zero":
			num = 0;
			break;
		case "One":
			num = 1;
			break;
		case "Two":
			num = 2;
			break;
		case "Three":
			num = 3;
			break;
		case "Four":
			num = 4;
			break;
		case "Five":
			num = 5;
			break;
		case "Six":
			num = 6;
			break;
		case "Seven":
			num = 7;
			break;
		case "Eight":
			num = 8;
			break;
		case "Nine":
			num = 9;
			break;
		case "Ten":
			num = 10;
			break;
		}
		return num;
	}
	
	public static int addUp(int... args){
		System.out.println("Executing Int");
		int sum =0;
		for (int i : args) {
			sum +=i;
		}
		return sum;
	}
	
	public static double addUp(double... args){
		System.out.println("Executing Double");
		double sum =0;
		for (double i : args) {
			sum +=i;
		}
		return sum;
	}
	
	public static int addUp(String... args){
		System.out.println("Executing String");
		int sum =0;
		for (String str : args) {
			sum +=toNumber(str);
		}
		return sum;
	}
	public static int addUp(int a3, String b3){
		System.out.println("Executing Mixed");
		return a3 + toNumber(b3);
	}
	
	public static void main(String[] args) {
		System.out.println(addUp(3.2, 2.2));
		System.out.println(addUp(1, 4));
		System.out.println(addUp("one", "three"));
		System.out.println(addUp(2, 3.5));
		System.out.println(addUp(1, "Three"));
		
	}

}
