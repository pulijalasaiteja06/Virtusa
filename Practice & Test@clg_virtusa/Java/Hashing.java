import java.io.*;
import java.util.*;

class Hashing{
public static void main(String[] args){
HashSet<String> h=new HashSet<String>();
h.add("saiteja");
h.add("sateteja");
h.add("saturday");
h.add("satun");
h.add("satun");
h.add("");

System.out.println(h);

TreeSet<String> t=new TreeSet<String>();
t.add("gg");
t.add("ff");
t.add("ddd");
t.add("ss");
t.add("aa");
System.out.println(t);
Iterator<String> it=t.descendingIterator();
while(it.hasNext()){
System.out.println(it.next());
}
System.out.println(t.pollFirst());
System.out.println(t.pollLast());



}
}