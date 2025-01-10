interface X{
	int x=20;
	public void add();
	public void sub();
}
interface Y{
	int y=10;
	public void mul();
	public void sub();
}

interface Z extends X,Y{

}

class Calculator implements Z{
	public void add(){
		System.out.println(X.x+Y.y);
	}
	public void sub(){
		System.out.println(X.x-Y.y);
	}
	public void div(){
		System.out.println(X.x/Y.y);
	}
	public void mul(){
		System.out.println(X.x*Y.y);
	}

}

public class InterfaceDemo{
public static void main(String args[]){
	Calculator c1=new Calculator();
	X x1=c1;
	Y y1=c1;
	Z z1=c1;
	x1.add();
	//x1.mul();
	y1.mul();
	//y1.add();
        z1.add();
	z1.mul();
}
} 