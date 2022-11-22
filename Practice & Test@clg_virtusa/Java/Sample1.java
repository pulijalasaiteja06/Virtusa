public class Sample1{
public static void main(String args[]){
//05/05/2022
System.out.print("Chal rey BC");
System.out.println("Hello MF");
int z=5;
float y=4.4442f;
double x=2.3243434324d;
char u='a';
char v=66;
byte w=127;
boolean t=true;
String s="Saiteja ";
String s2="Pulijala";
System.out.println(z+""+y+""+x+""+u+""+v+""+w+""+t);
System.out.println();
char[] s1=s.toCharArray();
for(int i=0;i<s1.length;i++){
System.out.println((int)s1[i]); //char ascii
}
System.out.println(s.concat(s2));
System.out.println(s);

System.out.println(s.length()+" "+s.toUpperCase()+" "+s.toLowerCase()+" "+s.indexOf("t")+" "
+s.endsWith("ja ")+" "+s2.startsWith("Sai")+" "+s.replace("a","i")+" "+s2.replaceFirst("l","K")+"\t"+s2.contains("lijal"));

// Type Casting
int m=20;
double n=m;
System.out.println(m+" "+n); //Widening Automatic

double a=10.345d;
int b=(int) a;
System.out.println(a+" "+b); //Narrowing Manual

System.out.println("I am \"God\""); //Escape character \
System.out.println("---    ---- -- -- --  -- - - -- -  --- - -- ----- -   -- --- --  - -- - --  - - -- - ---   - -- -  ------");
//06/05/2022
System.out.println(Math.max(5,10));
System.out.println(Math.min(5,10));
System.out.println(((int) Math.sqrt(81))+" "+Math.sqrt(90));
System.out.println(Math.max(5,10));
System.out.println(Math.abs(-z));
System.out.println(Math.random()); //1.0-1.1
int r=(int) (Math.random()*101); //1-100
System.out.println(r);
//Ternary Operator
String tw=(z==5) ? "Equals" : "Not Equals";
System.out.println(tw);

//Arrays
int[] ar={2,3,4,5,6,13};
String arr[]={"Seattle","Asgard","akatsuki","kunthala Rajyam"};
System.out.println(ar);
System.out.println(arr);
for(int i=0;i<ar.length;i++)
System.out.print(ar[i]+" ");
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+" ");
//2D
int arm[][]={{4,3,2,6,1,5},{2,3,78,9,853}};
System.out.println(arm);
for(int i=0;i<arm.length;i++)
for(int j=0;j<arm[i].length;j++)
System.out.print(arm[i][j]+" ");
System.out.println();

System.out.println(arm[0][3]);
System.out.println(arm[1]);
arm[0][5]=8;
for(int i=0;i<arm.length;i++)
for(int j=0;j<arm[i].length;j++)
System.out.print(arm[i][j]+" ");
System.out.println();


}
}