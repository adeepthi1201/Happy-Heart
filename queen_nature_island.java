import java.util.Scanner;

public class HappyHeart {
	
	public static void main(String[] args) {
		
		// Prints out initial statement 
		System.out.println("Welcome to Happy Heart!\n");
		
		// Creates a new Scanner object for user input
		Scanner userInput = new Scanner(System.in);
		
		// Creates a variable for heart rate
		int heartRate;
		
		// Prompts user for heart rate and stores it in heartRate variable
		System.out.println("Please enter your heart rate: ");
		heartRate = userInput.nextInt();
		
		// Compares user's heart rate and prints out an appropriate happy message
		if (heartRate < 60) {
			System.out.println("\nYour heart is beating slower than normal. You should rest up!");
		} else if (heartRate > 100) {
			System.out.println("\nYour heart is beating a bit too fast. You should take a break!");
		} else {
			System.out.println("\nYour heart seems to be in the ideal range. Keep doing what you're doing!");
		}
		
		// Creates variable for user's age
		int age;
		
		// Prompts user for age and stores it in age variable
		System.out.println("\nPlease enter your age in years: ");
		age = userInput.nextInt();
		
		// Compares user's age and prints out an appropriate message
		if (age > 60) {
			System.out.println("\nYou should talk to your doctor about a diet plan and physical activity routine that's right for you!");
		} else if (age < 20) {
			System.out.println("\nRemember to make healthy eating choices and get at least 60 minutes of physical activity every day!");
		} else {
			System.out.println("\nYou're in a great place to be healthy! Eat a balanced diet and exercise regularly!");
		}
		
		// Creates variable for user's hours of sleep
		int sleep;
		
		// Prompts user for hours of sleep and stores it in sleep variable
		System.out.println("\nPlease enter the number of hours you slept last night: ");
		sleep = userInput.nextInt();
		
		// Compares user's hours of sleep and prints out an appropriate message
		if (sleep > 8) {
			System.out.println("\nNice work! You're getting plenty of sleep.");
		} else if (sleep < 4) {
			System.out.println("\nGetting too little sleep can affect your health. Make sure to get at least 7-8 hours of sleep a night!");
		} else {
			System.out.println("\nGetting 7-8 hours of sleep a night is important for maintaining a healthy lifestyle. Try to increase your sleep if you can!");
		}
		
		//Asks user if they want to receive recommended tips
		System.out.println("\nWould you like to receive tips on how to improve your heart health?");
		String answer = userInput.next();
		
		// If user answers yes, print out tips
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("\nGreat! Here are some tips to help keep your heart healthy: \n\n1. Eat a healthy diet that's low in saturated fat and cholesterol. \n2. Exercise regularly - aim for at least 30 minutes of moderate exercise 5 days a week. \n3. Maintain a healthy weight. \n4. Don't smoke. \n5. Limit alcohol consumption. \n6. Get enough sleep - try to get 7-8 hours of sleep per night. \n7. Check your blood pressure regularly. \n");
		}
		
		// If user does not answer yes, print out goodbye message
		else {
			System.out.println("\nNo problem – take care of your heart! Have a great day!");
		}
		
		// Close Scanner object
		userInput.close();
	}

}