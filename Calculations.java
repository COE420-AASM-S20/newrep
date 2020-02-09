
public class Calculations {

	public static void main(String[] args) {
		int x = 2;
		int y = 1;
		
		//sum of x and y 
		int sum = x+y;
		System.out.println("The sum is= "+ sum);
		
		//member_B add the feature of subtracting x from y and print the result
		System.out.println("The subtracted value of x and y is:" + subtraction(x,y));
		
		//member_C add the feature of dividing x by y and print the result
		System.out.println("The divided value of x and y is:" + division(x,y));
		//member_D add the feature of multiplying x by y and print the result
		System.out.println("The multiplied value of x and y is:" + multiplication(x,y));
		
		
		//Exercise 5: Spot the issues to be reported
		System.out.println(addition(4,5)); // should print the sum of the values provided
		System.out.println(welcome()); // should print the welcome message to the console
	}
	
	public static int addition(int w, int z) {
		int sum = w + z;
		return sum; 
	}
	public static int subtraction(int x, int y) {
		int sum= x+y;
		return sum;
	}
	public static int multiplication(int x, int y) {
		int sum=x*y;
		return sum;
	}
	public static int division(int x, int y) {
		int sum=x/y;
		return sum;
	}
	
	public static String welcome() {
		return "Hello World"; 
	}

}
