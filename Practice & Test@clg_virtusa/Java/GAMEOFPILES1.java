/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GAMEOFPILES1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		    int temp=a[0];
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            if(a[i]<a[j]){
		                temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;
		            }
		        }
		    }
		    int sum=0;
		    for(int i=0;i<n;i++){
		    sum+=a[i];
		        
		    }
		    if(a[0]==1)
		    System.out.println("CHEF");
		    else if(sum%2==1)
		    System.out.println("CHEF");
		    else
		    System.out.println("CHEFINA");
		}
	}
}
