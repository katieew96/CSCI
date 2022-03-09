/**
 * author @ Katie_Warren
 * the purpose of this program is to get non-negative integers from 
 * the keyboard, one at a time. Then print out each digit of the integer 
 * in reverse order, one per line. 
 * Methods: main and digitExtract
 */
 
package assg1_warrenk14;

import java.util.Scanner;

import java.util.stream.*;
import java.lang.*;

public class DigitReverse {
	 static void digitExtract(int positiveNum) {
		 
			do {
			System.out.println(positiveNum % 10); 
			positiveNum = positiveNum / 10;
			} while(positiveNum != 0);
	}
	 
	public static void main(String[] args) {
		
		int positiveNum;
		
		do {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a non-negative number. Enter -1 to exit.");
		positiveNum = kbd.nextInt();
		if(positiveNum ==-1) {
			System.exit(-1);
		}
		else if (positiveNum < -1) {
			System.out.println("must be a positive number.");
			continue;  
		}
		else {
			System.out.println("Here is your number printed in reverse order:");
			digitExtract(positiveNum);
			
		}
		} while(positiveNum != -1);
				
	}
}

