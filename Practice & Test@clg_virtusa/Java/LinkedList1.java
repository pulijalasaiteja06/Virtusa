import java.io.*;
import java.util.*;

class LinkedList1{
static public void main(String[] args){
LinkedList<String> l=new LinkedList<String>();
l.add("gr");
l.add("dfd");
l.add("gd");
l.add("dgd");
l.add("dfd");
l.add("dfd");
l.add("dfd");

System.out.println(l);
l.remove("dfd");
l.addFirst("aaaa");
l.addLast("bbbb");
System.out.println(l);
l.removeFirstOccurrence("dfd");
l.removeLastOccurrence("dfd");
System.out.println(l);

}
}