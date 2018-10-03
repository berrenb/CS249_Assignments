/*
 Created by Bryan Berrent
 
 The InvalidExpressionException Class contains a constructor
 Inside the constructor, a super call is made to obtain the message and exception
 from the Exception class
 */
public class InvalidExpressionException extends Exception{
	public InvalidExpressionException(String message, Exception e){
		super(message,e);
	}
}
