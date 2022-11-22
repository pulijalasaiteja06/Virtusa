import java.io.*;
import java.util.*;

class ArrayList1{
public static void main(String[] args){
ArrayList<Integer> al=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
al.add(sc.nextInt()	);
al.add(sc.nextInt());
al.add(sc.nextInt());
al.add(sc.nextInt());
Iterator itr=al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
for(var i:al){
System.out.println(i);
}
System.out.println(al);

//get set methods
int b=al.get(1);
System.out.println(b);
al.set(1,2);
System.out.println(al.get(1)+" "+al);

//sorting
Collections.sort(al);
System.out.println(al);
System.out.println(al.size());
//traversing in reverse
ArrayList<String> al1=new ArrayList<String>();
al1.add("vwe");
al1.add("sc");
al1.add("s");
al1.add("add");
//ListIterator<String> l=al1.listIterator(al1.size());  
ListIterator<String> l=al1.listIterator(al1.size());
while(l.hasPrevious()){
String str=l.previous();
System.out.println(str);
}
//for
for(int i=0;i<al1.size();i++){
System.out.println(al1.get(i));
}
}
}