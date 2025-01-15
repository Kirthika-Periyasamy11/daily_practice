sealed class A permits B,C,D{
	int x;
	public void abc(){
		System.out.println("Inside A class");
	}
}
final class B extends A{
	public void abc(){
		System.out.println("Inside B class");
	}
}


non-sealed class C extends A{
	public void abc(){
		System.out.println("Inside C class");
	}
}

sealed class D extends A permits E{
	public void abc(){
		System.out.println("Inside D class");
	}
}

final class E extends D{
		public void abc(){
		System.out.println("Inside E class");
	}
}
public class SealedDemo{
public static void main(String args[]){
	A a1=new B();
	a1.abc();
	A c1=new C();
	c1.abc();
	A d1=new D();
	d1.abc();
	A e1=new E();
	e1.abc();

}
}