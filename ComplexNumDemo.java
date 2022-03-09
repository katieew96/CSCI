/**
 * @author katieWarren
 * This is the class I will test all of the methods with from ComplexNum
 * ******do not ask user to enter anything from keyboard *******
 * 
 */

/*
 * For the ComplexNumDemo class, you need to include a main method to test all the 
 * methods in the ComplexNum class. You need to create multiple ComplexNum objects to 
 * be able to test the methods. Make sure you test each of the constructors and test all 
 * other methods. For each method, you will need to test all possible cases, if applicable.
 * Do not ask user to enter anything from the keyboard. For output, you should print adequate 
 * messages to show what you are testing and what the result means.
 */
package assg2_warrenk14;

import java.util.*;

public class ComplexNumDemo {

	public static void main(String[] args) {
		
		//System.out.println("No ")
		//These are the new objects you are creating
		//To test the constructors
		ComplexNum a1 = new ComplexNum();	
		ComplexNum b1 = new ComplexNum(-5.5); 	
		ComplexNum c1 = new ComplexNum(-55.5, -75.5); 
		ComplexNum d1 = new ComplexNum(-2, 0); 
		ComplexNum e1 = new ComplexNum(0, 7); 
		ComplexNum f1 = new ComplexNum(25.5, 20); 
		ComplexNum g1 = new ComplexNum(25.5, 20); 
		ComplexNum h1 = new ComplexNum(-5, -10); 
		
		System.out.println("Testing toString method");
		System.out.println("toString negative a");
		System.out.println(b1.toString());
		System.out.println( );
	
		System.out.println("toString test for positive a and b");
		System.out.println(f1.toString());
		System.out.println(g1.toString());
		System.out.println( );
		
		System.out.println("toString test negative b");
		System.out.println(c1.toString());
		System.out.println(h1.toString());
		System.out.println( );
		
		System.out.println("toString test zeros");
		System.out.println(a1.toString());
		System.out.println( );
		
		System.out.println("toString test zero a");
		System.out.println(e1.toString());
		System.out.println( );
		
		System.out.println("toString test zero b");
		System.out.println(d1.toString());
		System.out.println( );
		
		System.out.println("Testing get Real and Imaginary methods");
		System.out.println("Test the set method for real and imaginary");
		System.out.println("a1's real value: " + a1.getReal());
		System.out.println("a1's imaginary value: " + a1.getImaginary());
		System.out.println( );
		
		System.out.println("b1's real value: " + b1.getReal());
		System.out.println("b1's imaginary value: " + b1.getImaginary());
		System.out.println( );
		
		System.out.println("c1's real value: " + c1.getReal());
		System.out.println("c1's imaginary value: " + c1.getImaginary());
		System.out.println( );
		
		System.out.println("d1's real value: " + d1.getReal());
		System.out.println("d1's imaginary value: " + d1.getImaginary());
		System.out.println( );
		
		System.out.println("e1's real value: " + e1.getReal());
		System.out.println("e1's imaginary value: " + e1.getImaginary());
		System.out.println( );
		
		System.out.println("f1's real value: " + f1.getReal());
		System.out.println("f1's imaginary value: " + f1.getImaginary());
		System.out.println( );
		
		System.out.println("g1's real value: " + g1.getReal());
		System.out.println("g1's imaginary value: " + g1.getImaginary());
		System.out.println( );
		
		System.out.println("h1's real value: " + h1.getReal());
		System.out.println("h1's imaginary value: " + h1.getImaginary());
		System.out.println( );
		System.out.println( );
		
		System.out.println("Test setImaginary and setReal methods");
		a1.setReal(5);
		a1.setImaginaryNum(10);
		System.out.println("a1's real value is:" + a1.getReal());
		System.out.println("a1's imaginary value is:" + a1.getImaginary());
		System.out.println( );
		System.out.println( );

		
		System.out.println("Test setImaginary and setReal methods - second try");
		c1.setReal(250.25);
		c1.setImaginaryNum(100.5); 
		System.out.println("c1's real value is:" + c1.getReal());
		System.out.println("c1's imaginary value is:" + c1.getImaginary());
		System.out.println( );
		System.out.println( );
		
		System.out.println("Testing add method");
		ComplexNum addition = a1.add(b1);
		System.out.println("using a and b in the add method test: " +  addition.toString());
		System.out.println("using b and c in the add method test2: " + b1.add(c1));
		System.out.println( );
		
		System.out.println("Testing Multiply method");
		ComplexNum multiplication = d1.mul(e1);
		System.out.println("using d and e in the add method test: " +  multiplication.toString());
		System.out.println("using f and g in the add method test2: " + f1.mul(g1));
		System.out.println( );
	
		System.out.println("Testing negation method");
		ComplexNum negation = a1.neg(b1);
		System.out.println("using a and b in the add method test: " +  negation.toString());
		System.out.println("using c and d in the add method test2: " + c1.neg(d1));
		System.out.println( );
		
		
		System.out.println("Testing equals method");
		System.out.println("Testing g1 and f1: " + g1.equals(f1));
		System.out.println("Testing a1 and b1: " + a1.equals(b1));
		
	}

}
