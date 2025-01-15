import java.util.*;
import java.sql.*;
import java.io.*;
public class ExceptionDemo{
public static void main(String args[]){
	int a=5;
	try{
	for(int i=1;i<=20;i++){
		int res=a/a-i;
		System.out.println(i);
		if(i==150){throw new NullPointerException();}
		if(i==160){throw new UserException("when i==16");}
		if(i==170){throw new IOException();}
		if(i==180){throw new SQLException();}
		//return;
		System.exit(0);
	}
	}
	
	catch(ArithmeticException| NullPointerException e){
		System.out.println("Arithmetic or NullPointerExceptionOccured");
	}
	catch(RuntimeException e){
		System.out.println("Runtime exception occured");//order subclass then parentclass
	}
	
	catch(IOException | SQLException e){
		System.out.println("IOException or SQLException occured");
	}
	catch(UserException e){
		System.out.println(e.getMessage());
	}
	catch(Exception e){
		System.out.println("Exception occured");
	}
	
	finally{
		System.out.println("Exception handled");
	}

}
}

class UserException extends Exception{
public UserException(){
super();
}
public UserException(String msg){
super(msg);
}
}