import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
    	// Extra comment
    	//
    	String x;
    	Scanner sc = new Scanner(System.in);
	    System.out.println("Please type your name: ");
	    x = sc.nextLine();
	    System.out.println("Hello, " + x);
        System.out.println("Thanks for running, "+x);
	
		      
    }
}
