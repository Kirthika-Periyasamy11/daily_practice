class A{
public static int x;//variable belongs to class. Single copy. Accessed by all variables
public static void abc(){
System.out.println("Inside static method");//can access directly
}
public void xyz(){
System.out.println("Inside non static method");//can be accessed by creating object
}
}
class StaticDemo{
public static void main(String args[]){
A a1=new A();
A a2=new A();
a1.x=10;
a2.x=20;
System.out.println(a1.x);
System.out.println(a2.x);
A.x=30;
System.out.println(A.x);
A.abc();
//A.xyz();
A a3=new A();
a3.xyz();
}

static{
//get executed after loading before main class
//all static blocks will be clubed and then executed
System.out.println("Inside static block");
}
} 
