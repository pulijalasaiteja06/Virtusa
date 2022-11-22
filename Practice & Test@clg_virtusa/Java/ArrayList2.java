import java.io.*;
import java.util.*;
class ArrayList2{
public static void main(String[] args){
ArrayList<String> a=new ArrayList<String>();
a.add("sss"); 
a.add("aaa");
a.add("ccc"); 
a.add("dd");
a.add("fs"); 

a.add("vv");
System.out.println(a);
a.remove("dd");
System.out.println(a);
a.remove(3);
System.out.println(a);
ArrayList<String> b=new ArrayList<String>();
b.add("asxx");
b.add("sdas");
b.add("dad");
b.add("dasd");
b.add("sads");
b.add("ccc");
System.out.println(b);
//a.addAll(b);
//adding at specific pos
//a.addAll(2,b);
System.out.println(a);

//Common in both
a.retainAll(b);
System.out.println(a);
System.out.println(a.isEmpty());
a.clear();
System.out.println(a.isEmpty());
System.out.println(a);

}}