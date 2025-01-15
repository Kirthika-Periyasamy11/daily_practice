class A{
A(){
System.out.println("Allocating resources");
}

public void process(){
System.out.println("A object processing");
}
public void release(){
System.out.println("A object releasing");
}
}

public class TryWithResourcesDemo1{
public static void main(String args[]){
A a1=null;
try{
a1=new A();
a1.process();
if(true){throw new NullPointerException();}
a1.release();
}
catch(Exception e){
System.out.println(e);
}

System.out.println(a1);//prints a1
}
}