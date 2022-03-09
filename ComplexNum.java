/**
 * @author - KatieWarren
 * @constructors: 
 * @methods: default constructor, constructor, neg, mul, sub, add, setImaginary, setReal, getReal, getImaginary, 
 * 
 */

package assg2_warrenk14;

public class ComplexNum {
	
	private double realNum, imaginaryNum;
	
	/**
	 * default constructor
	 * @param none
	 */
	public ComplexNum() {
		 realNum = 0;
		 imaginaryNum = 0;
	}
	
	/**
	 * Constructor that initializes the real double variable
	 * @param real - initializing the real number
	 */
	public ComplexNum(double real) {
		realNum = real;
		
	}
	
	/**
	 * constructor that receives two double values 
	 * @param givenReal - the given real number
	 * @param givenImaginary - the given imaginary number
	 */
	public ComplexNum(double givenReal, double givenImaginary) {
		realNum = givenReal;
		imaginaryNum = givenImaginary;
	}
	
	/**
	 * method that receives the getReal value and returns it as a realNum
	 * @return realNum
	 */
	public double getReal() {
		return realNum;
	}
	
	/**
	 * method that receives the getImaginary value and returns it as a imaginaryNum
	 * @return imaginaryNum 
	 */
	public double getImaginary() {
		return imaginaryNum;
	}
	
	/**
	 * method that sets/modifies the real part
	 * @param newReal - new real value
	 */
	//modify the real part
	public void setReal(double newReal) {
		realNum = newReal;
	}
	
	/**
	 * method that sets/modifies the imaginary part
	 * @param newImaginary - new imaginary value
	 */
	public void setImaginaryNum(double newImaginary) {
		imaginaryNum = newImaginary;
	}

	/**
	 * This addition method is how to implement formulas into methods
	 * 		Formula:(a+bi)+(c+di) = (a+c)+(b+d)i
	 * @param num - object type
	 * @return new ComplexNum() - the real and imaginary formula results
	 */
	public ComplexNum add(ComplexNum num) {
		return new ComplexNum(this.getReal() + num.getReal(), this.getImaginary() + num.getImaginary());	//new makes this return a different method
	}
	
	/**
	 * This subtraction method subtract the parameter from the current object
	 * @param num - object type
	 * @return new ComplexNum
	 * 		Formula:(a+bi)-(c+di) = (a-c)+(b-d)i
	 */
	public ComplexNum sub(ComplexNum num) {
		return new ComplexNum(this.getReal() - num.getReal(), this.getImaginary() - num.getImaginary());	
		//new makes this return a different method instead of returning back the same method, but changed
	}

	/**
	 * This multiplication method 
	 * @param num - object type
	 * @return ComplexNum - the real and imaginary formula results
	 */
	public ComplexNum mul(ComplexNum num) {
		return new ComplexNum(this.getReal() * num.getReal(), this.getImaginary() * num.getImaginary()); 	
		// Formula:(a+bi)*(c+di) = (ac-bd)+(ad+bc)i
	}
	
	/**
	 * This negation method changes the parameter value
	 * @param num - object type
	 * @return new ComplexNum - formula results for real and imaginary 
	 */
	public ComplexNum neg(ComplexNum num) {
		return new ComplexNum(this.getReal() / num.getReal(),this.getImaginary() / num.getImaginary());
		//Formula: -(a+bi) = -a-bi
	}
	
	/**
	 * This toString method
	 * @param none
	 * @return real and imaginary output
	 */
	@Override
	public String toString() {
		if (this.getReal()  != 0 && this.getImaginary() != 0) {
			if (this.getImaginary() < 0) {
				return this.getReal() + "" + this.getImaginary() + "i";
			}
			return this.getReal()  + "+" + this.getImaginary() + "i";
		}
		if (this.getReal()  == 0 || this.getImaginary() == 0) {
			if (this.getReal()  != 0) {
				return this.getReal() + "";
			}
			else if(this.getImaginary() != 0) {
				return this.getImaginary() + "i";
			}
			return "0";
		}
		return " ";
	}


	/**
	 * Compare real and imaginary
	 * @param obj - object used to compare
	 * @return true or false depending on real and imaginary numbers equal eachother
	 */
	@Override 
	
	 // This equals method 
	 // look at examples, test if object then type case then test values
	
	public boolean equals(Object obj) {
		if (obj == null) 
			return false;
		if (obj instanceof ComplexNum) {
			ComplexNum temp = (ComplexNum)obj;
			return(this.realNum == temp.realNum && imaginaryNum == temp.imaginaryNum);
		}
		else 
			return false;
	}
			
			
			
	}	
	

