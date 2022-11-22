import java.io.*;
import java.util.*;


class Student{
int id;
String name;
String address;
int age;
public Student(int id,String name,String address,int age){
this.age=age;
this.name=name;
this.address=address;
this.id=id;
}
}

class ArrayList3{
public static void main(String[] args){
Student s1=new Student(1,"sai","dsaa",20);
Student s2=new Student(2,"teja","sff",6);
Student s3=new Student(3,"Saiteja","grt",18);
Student s4=new Student(4,"SAITEJ","FFF",1000000);
ArrayList<Student> a=new ArrayList<Student>();
a.add(s1);
a.add(s2);
a.add(s3);
a.add(s4);
Iterator l=a.iterator();
while(l.hasNext()){
Student s=(Student)l.next();
System.out.println(s.id+"\t"+s.name+"\t"+s.address+"\t"+s.age);
}
for(Student s:a){
System.out.println(s.id+"\t"+s.name+"\t"+s.address+"\t"+s.age);
}

}
}