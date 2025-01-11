class A{
final int x=10;
final void abc(){ System.out.println("Inside final method");
}
}

class B extends A{
/*public void abc(){
//cannot override final method
System.out.println("Inside class B");
}*/
}

class FinalDemo{
public static void main(String args[]){
A a1 = new A();
System.out.println(a1.x);
//a1.x=50;
System.out.println(a1.x+50);
}
}