import java.io.*;

public class Myexception extends Exception{
private int detail;
Myexception(int a){
detail=a;
}
}

public class mini {
static void sai(int a) throws Myexception {
if(a>10){
throw new Myexception(a);
}
else{
System.out.println("lkaflasnf");
}
}
public static void main(String args[]){
try{
sai(2);
sai(5);
}catch(Myexception e){
System.out.println("Caught "+e);
}
}
}