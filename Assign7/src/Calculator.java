/*
 Created Bryan Berrent
 
 Calculator Class which contains one method called eval
 Eval takes a string and parses it
 Eval will determine if it is addition or subtraction
 If it is neither, it will throw InvalidExpressionException
 */
import java.util.*;
public class Calculator {
	public Calculator(){}
	
	public static double eval(String expr) throws InvalidExpressionException{
		try{
			//Variables being used in the method
			char sign = ' ';
			int position = 0;
			double first = 0;
			double second = 0;
			double result = 0.0;
			
			/*Loop to determine the position of the sign 
			  Once the sign is found, the string is parsed
			  The first number is from the beginning of the string to the sign
			  The second number from one position past the sign to the end
			*/
			for(int i = 0; i < expr.length();i++){
				if(expr.charAt(i)=='+'||expr.charAt(i)=='-'){
					sign = expr.charAt(i);
					position = i;
					first = Double.parseDouble(expr.substring(0,i));
					second = Double.parseDouble(expr.substring(i+1,expr.length()));
				}
			}
			
			//Performs the operation passed on the value of sign
			if(sign == '-'){
				result = first - second;
			}
			if(sign=='+'){
				result = first + second;
			}
			return result;
		}
		catch(Exception e){
			throw e;
		}
		
	}
}
