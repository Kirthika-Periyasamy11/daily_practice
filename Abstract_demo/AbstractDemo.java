abstract class A{

public abstract void abc();
public abstract void xyz();
} 

abstract class B extends A{
//class B is not required to implement class A abstract method logic
public void abc(){
System.out.println("Inside B");
}
public void xyz(){
System.out.println("Inside B");
}
}

class C extends B{
//class C is not requried to implement class A logic if class B implements it
}

class AbstractDemo{
public static void main(String args[]){
	A a1=new C(); //class A's constructor is accessed through non abstract subclass.
	a1.abc();
}
}