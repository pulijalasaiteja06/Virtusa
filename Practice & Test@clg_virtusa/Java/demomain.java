class demo
{
int x;
int y;
float z;
demo(int x,int y,int z)
{
this.x=x;
this.y=y;
this.z=z;
}
void display()
{
System.out.println("values of x, y and z are:"+x+"  "+y+"  "+z);
}
}
class demomain
{
public static void main(String args[])
{
demo d1=new demo(1,2,3); // this is a call for the above parameterized constructor
d1.display();
}
}