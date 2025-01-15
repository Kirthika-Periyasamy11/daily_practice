/*class Principal{
static private final Principal p1=new Principal();
private Principal(){}
public static Principal getPrincipal(){
	return p1;
}
static{
System.out.println("Inside static block"+p1);
}
}*/

class Principal{
static private Principal p1=null;
private Principal(){}
public static Principal getPrincipal(){
	if(p1==null){
		p1=new Principal();
	}
	return p1;
}
static{
System.out.println("Inside static block"+p1);
}
}
public class SingletonDemo{
public static void main(String args[]){
Principal p1=Principal.getPrincipal();
Principal p2=Principal.getPrincipal();
Principal p3=Principal.getPrincipal();
System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
}

}