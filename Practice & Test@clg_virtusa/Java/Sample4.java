class one{
private int s=10;
public int get(){
return s;
}
public void set(int a){
this.s=a;
}
public one(){
System.out.println("Contructor "+s);

}
final int x=90;
public one(int a,double b){	//constructor has no return type, and it's name same it as class name

System.out.println(a+" "+b);
}
public one(double b,boolean c){
System.out.println(b+" "+c);

}
public void st(int i){
for(int j=0;j<i;j++)
System.out.println(j+" ");
}
}

public class Sample4{
static int  a=4;
public static void main(String args[]){
int g=0;
System.out.println(g);

one o=new one(a,8.8);
one o1=new one(9,1);
one o2=new one();
//System.out.println(o.s);
o.st(5);
//o.x=9; //final
System.out.println(o.get());
o.set(5);
System.out.println(o.get());

}
}