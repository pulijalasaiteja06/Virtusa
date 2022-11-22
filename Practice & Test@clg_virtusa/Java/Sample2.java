/*public class Sample2{
public static void method1(int a, int b){
System.out.println(a+b);
}
public static double method2(double a, double b){
return (a/b);
}
public static char method3(char a){
return a;
}
public static void main(String args[]){
method1(5, 6);
double x=method2(6.0, 3.0);
//System.out.println(x);
System.out.println(x);
System.out.println(method3('A'));

}
}

//Method Overload
public class Sample2{
public static void method1(int a, int b){
System.out.println(a+b);
}
public static double method1(double a, double b){
return (a/b);
}
public static char method1(char a){
return a;
}
public static boolean method1(boolean x){
return x;
}
public static void main(String args[]){
method1(5, 6);
//System.out.println();
System.out.println(method1(9.0,3.3));
System.out.println(method1('A'));
System.out.println(method1(true));
}
}*/

public class Sample2{
public static int method1(int x,int y){
if(x>=y)
return x+method1(x-1,y);
else
return 0; //Halting condition
}
public static void main(String[] args){
System.out.println(method1(9,5));
}
}