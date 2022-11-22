public class Sample3{
int x=5;
final int z=8;
static int y=10;
public static int st(int a){
return a;
}
public int nm(int a){
return a;
}

public static void main(String args[]){
System.out.println("EPAM");
//System.out.println(x); //Error
System.out.println(y);
System.out.println(st(5));

Sample3 o=new Sample3();
System.out.println(o.x);
o.x=9;
System.out.println(o.x);
System.out.println(o.z);
System.out.println();
System.out.println(o.nm(8));
}
}