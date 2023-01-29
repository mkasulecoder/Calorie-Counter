/*
A bag of cookies holds 40 cookies. 
The calorie information on the bag claims that there are 10 servings
 in the bag and that a serving equals 300 calories. Write a program that lets the user enter the number of cookies he or she actually ate and then reports the number of total calories consumed.
*/

/**
 * This program ask user the to enter how many cookies they ate,
 * then lets them know how many calories existed in those cookies
 * @author Mark Kasule
 *
 */
import java.util.Scanner;

public class CookieCalorieCounter {

	public static void main(String[] args) {
		//list variables to use
		final int NUM_OF_COOKIES = 40;
		final int CALORIES_PER_SERVING = 300;
		final int SERVINGS = 10;
		int cookieNum;
		
		//declare scanner object
		Scanner input = new Scanner(System.in);
		
		//Ask user to enter number of cookies
		System.out.print("Enter number of cookies eaten: ");
		cookieNum = input.nextInt();
		
		//Total calories
		int totalCalories = CALORIES_PER_SERVING * SERVINGS;
		
		//Calculate the calorie per cookie
		int caloriePerCookie = totalCalories / NUM_OF_COOKIES;
		
		//calories in cookies consumed
		int caloriesConsumed = cookieNum * caloriePerCookie;
		
		System.out.println("Your calorie intake was: " + caloriesConsumed + " calories.");
				

	}

}
