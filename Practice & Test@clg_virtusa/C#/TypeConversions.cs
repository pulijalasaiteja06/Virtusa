/******************************************************************************

                            Online C# Compiler.
                Code, Compile, Run and Debug C# program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

using System;
class HelloWorld {
  static void Main() {
    //IMPLICIT TYPE CONVERSION
    float a=3.7923e2f;
    Console.WriteLine("Hello World "+a);
    char c='a';
    Console.WriteLine("Hello World "+c);
    int d=c;
    Console.WriteLine("Hello World "+d);
    long e=c;
    Console.WriteLine("Hello World "+e);
    float f=c;
    Console.WriteLine("Hello World "+f);
    double g=c;
    Console.WriteLine("Hello World "+g);
    //EXPLICIT TYPE CONVERSION
    double p=5.87d;
    int q=(int) p;
    string s="34567";
    int r=Convert.ToInt32(s);
    Console.WriteLine("Hello World "+r);
    Console.WriteLine("Hello World "+q);
    Console.WriteLine("Hello World "+Convert.ToString(a));
    Console.WriteLine("Hello World "+Convert.ToDouble(d));
    
    //DATA TYPE
    Console.WriteLine(typeof(int));
    Type tp=p.GetType();
    Console.WriteLine(tp);
    if(tp.Equals(typeof(double))){
        Console.WriteLine("ab gayab");
    }
    
  }
  
}
