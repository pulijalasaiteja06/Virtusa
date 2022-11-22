import java.util.*;

public class GCD{
public static int gcd(int a, int b){
if(b!=0)
return gcd(b,a%b);
else
return a;
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

int x=gcd(a,b);

System.out.println(x);
}
}