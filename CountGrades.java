/*
 * author @ KatieWarren
 * this Java program gets a list of grades and then from that list
 * counts the number above an average grade
 */

package assg1_warrenk14;

import java.util.*;

public class CountGrades {

	public static void main(String[] args) {
		
		double average = 0;
		double sum = 0;
		int counter = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of grades: ");

		int numOfGrades = keyboard.nextInt();
		
		if (numOfGrades <= 0) {
			System.out.println("Invalid, goodbye");
			System.exit(-1);
		}
		
		int[] studentGrades = new int[numOfGrades];
		System.out.println(" ");
		
		System.out.println("You will be entering " + numOfGrades + " grades.");
		
		
		for (int i = 0; i < numOfGrades; i++) {
				System.out.print("Enter grade: ");
				int givenGrades = keyboard.nextInt();
				studentGrades[i] = givenGrades;
				sum = givenGrades + sum;
		}
		
		average = sum / numOfGrades;
		System.out.println(" ");
		System.out.println("The average grade is: " + average);
		
		System.out.println(" ");

		System.out.println("The grades above average are: ");
		for (int i = 0; i < numOfGrades; i++) {
			if (studentGrades[i] > average) {
				System.out.println(studentGrades[i]);
				counter = counter + 1;
			}
		}

		System.out.println("for a total of " + counter + " grades");
		
		keyboard.close();
	}

}
