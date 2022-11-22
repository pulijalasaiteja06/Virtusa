import java.io.*;
import java.util.*;


class Employee{
int id;
String name;
int salary,no_of_years_experience;
long mobile_number;
String email,gender,address,DOB,DOJ;

public Employee(int id, String name, int salary, long mobile_number, String email, String gender, String address, String DOB, String DOJ, int no_of_years_experience)
{
this.id=id;
this.name=name;
this.salary=salary;
this.mobile_number=mobile_number;
this.email=email;
this.gender=gender;
this.address=address;
this.DOB=DOB;
this.DOJ=DOJ;
this.no_of_years_experience=no_of_years_experience;
}
}


public class saiteja{
Scanner sc=new Scanner(System.in);
ArrayList<Employee> arr=new ArrayList<Employee>();
//------------------------------------------------------------------------
public void add(){
System.out.println("Enter ID:");
int id=sc.nextInt();
sc.nextLine();
System.out.println("Enter Name:");
String name=sc.nextLine();
System.out.println("Enter Salary:");
int salary=sc.nextInt();
System.out.println("Enter Mobile Number:");
long mobile=sc.nextLong();
sc.nextLine();
System.out.println("Email id:");
String email=sc.nextLine();
System.out.println("Enter Gender:");
String gender=sc.nextLine();
System.out.println("Enter Address:");
String address=sc.nextLine();
System.out.println("Enter DOB:");
String DOB=sc.nextLine();
System.out.println("Enter DOJ(Date Of Joining):");
String DOJ=sc.nextLine();
System.out.println("Enter No.of.years.experience:");
int NoyExp=sc.nextInt();

Employee e=new Employee(id, name, salary, mobile, email, gender, address, DOB, DOJ, NoyExp);
arr.add(e);
System.out.println("Employee datails added successfully");
System.out.println();
}

//-----------------------------------------------------------------------------------

public void view_Single(){
if(arr.isEmpty()){
System.out.println("Employee list is empty");
}
else{
System.out.println("Eneter empolee id:");
int id=sc.nextInt();
System.out.println("| Id\t| Name\t| Salary\t| Mobilenumber\t| Emailid\t| Gender\t| Address\t| DOB\t| DOJ\t| Experienece");
System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
for(Employee e:arr){
if(e.id==id){
System.out.println(e.id+"\t"+e.name+"\t"+e.salary+"\t"+e.mobile_number+"\t"+e.email+"\t"+e.gender+"\t"+e.address+"\t"+e.DOB+"\t"+e.DOJ+"\t"+e.no_of_years_experience);
System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
}
}
}
}

//----------------------------------------------------------------------------------
public void view_All(){
if(arr.isEmpty()){
System.out.println("Employee list is empty");
}
else
{
System.out.println("| Id\t| Name\t| Salary\t| Mobilenumber\t| Emailid\t| Gender\t| Address\t| DOB\t| DOJ\t| Experienece");
System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
for(Employee e:arr){
System.out.println(e.id+"\t"+e.name+"\t"+e.salary+"\t"+e.mobile_number+"\t\t"+e.email+"\t"+e.gender+"\t"+e.address+"\t"+e.DOB+"\t"+e.DOJ+"\t"+e.no_of_years_experience);
System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

}
}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------

public void update(){
System.out.println("Enter whose id You want to clear:");
int id=sc.nextInt();
int k=0;
for(Employee e:arr){
if(e.id==id){

System.out.println("1.id\n2.name\n3.salary\n4.mobilenumber\n5.emailid\n6.gender\n7.address\n8.DOB\n9.DOJ\n10.Experience");
System.out.println("Enter a choice 1-10");
int ch=sc.nextInt();

switch(ch){
case 1:e.id=sc.nextInt();
break;
case 2:
sc.nextLine();
e.name=sc.nextLine();
break;
case 3:e.salary=sc.nextInt();
break;
case 4:e.mobile_number=sc.nextLong();
break;
case 5:
sc.nextLine();
e.email=sc.nextLine();
break;
case 6:
sc.nextLine();
e.gender=sc.nextLine();
break;
case 7:
sc.nextLine();
e.address=sc.nextLine();
break;
case 8:
sc.nextLine();
e.DOB=sc.nextLine();
break;
case 9:
sc.nextLine();
e.DOJ=sc.nextLine();
break;
case 10:e.no_of_years_experience=sc.nextInt();
break;
default:
System.out.println("Enter valid one");

}

}
k+=1;
}

}
//--------------------------------------------------------------------------------------------------
public void delete(){
System.out.println("Enter an employee to be deleted:");
int id=sc.nextInt();

for(Employee e:arr){
if(e.id==id){
arr.remove(e);
System.out.println("Deleted successfully");
break;
}

}
}
//-----------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------


public static void main(String[] args) {
saiteja f=new saiteja();
Scanner sc=new Scanner(System.in);

while(true){
System.out.println("Employee Management System");
System.out.println("-----------------------------------------------------------");
System.out.println("a. Add Employee Details");
System.out.println("b. View Single Employee Details");
System.out.println("c. View All Employee Details");
System.out.println("d. Update Employee Details");
System.out.println("e. Delete Employee Details");
System.out.println("f. Exit");

System.out.println("Enter a choice");
String choice=sc.next();

switch(choice){

case "a": f.add();
break;
case "b": f.view_Single();
break;
case "c": f.view_All();
break;
case "d": f.update();
break;
case "e": f.delete();
break;
default:
System.out.println("Choose valid function");
System.exit(0);
}
}

}
}
