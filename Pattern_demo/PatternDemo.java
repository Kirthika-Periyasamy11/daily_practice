import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
public class PatternDemo{
public static void main(String args[]){
	String name=getName();
	String emailId=getEmailID();
	System.out.println(name);
	System.out.println(emailId);
}

public static String getName(){
	Scanner sc=new Scanner(System.in);
	while(true){
	System.out.println("Enter name");
	String name=sc.nextLine();
	Pattern p1=Pattern.compile("([A-Z][a-z]*)+\s([A-Z][a-z]*)*");
	Matcher m1=p1.matcher(name);
	try{
 	if(m1.matches()){
		return name;
	}
	else{
		throw new InvalidEntryException("Enter valid Name");
	}
	}
	catch(InvalidEntryException e){
		System.out.println(e.getMessage());
	}	
	}
}

public static String getEmailID(){
	Scanner sc=new Scanner(System.in);
	while(true){
	System.out.println("Enter Emailid: ");
	String emailid=sc.nextLine();
	Pattern p1=Pattern.compile("[A-za-z0-9]+@[A-Za-z]+\\.com");
	Matcher m1=p1.matcher(emailid);
	try{
	if(m1.matches()){
		return emailid;
	}
	else{
		throw new InvalidEntryException("Enter valid EmailID");
	}
	}
	catch(InvalidEntryException e){
		System.out.println(e.getMessage());
		
	}
	}
}
}

class InvalidEntryException extends Exception{
public InvalidEntryException(){
super();
}
public InvalidEntryException(String msg){
super(msg);
}
}