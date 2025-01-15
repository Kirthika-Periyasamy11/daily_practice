import java.io.*;
class A implements AutoCloseable{
A(){
System.out.println("Allocating resources");
}

public void process(){
System.out.println("A object processing");
}
@Override
public void close(){
System.out.println("A object releasing");
}
}

class B implements AutoCloseable{
B(){
System.out.println("Allocating resources");
}

public void process(){
System.out.println("B object processing");
}
@Override
public void close(){
System.out.println("B object releasing");
}
}

public class TryWithResourcesDemo2{
public static void main(String args[]){
try(A a1=new A(); B b1=new B()){

a1.process();
if(true){
throw new NullPointerException();
}
b1.process();
}
catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
}
}