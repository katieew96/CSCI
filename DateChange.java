/**
 * author @ Katie_Warren
 * the purpose of this program is to take in the users date input and output the european form
 */

package assg1_warrenk14;

import java.util.*;

public class DateChange {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a date in the form *MM/DD/YYYY*:");
		
		String uDate = keyboard.nextLine();
		
		String dateArry[] = uDate.split("/");
		String month = dateArry[0];
		String day = dateArry[1];
		String year = dateArry[2];
		
		System.out.println("Here is that date in European form: " + day + "." +
							month + "." + year);
		
		keyboard.close();
		}
		
	}



