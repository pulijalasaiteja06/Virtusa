/******************************************************************************

                            Online C# Compiler.
                Code, Compile, Run and Debug C# program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

using System;
class HelloWorld {
  static void Main() {
    string s="Saiteja(GOD)";
    Console.WriteLine(s.Length);
    Console.WriteLine(s.ToUpper());
    Console.WriteLine(s.ToLower());
    Console.WriteLine(s.IndexOf('O'));
    for(int i=0;i<s.Length;i++)
    Console.Write(s[i]+" ");
    Console.WriteLine();
    //interpolation place holder
    string s1=$"He is known as {s}";
    Console.WriteLine(s1);
    string s2=s1.Substring(6);
    Console.WriteLine(s2);
    string s3=string.Concat(s,s2);
    Console.WriteLine(s3);
    string s4=$"He is Known as \"{s}\"";
    Console.WriteLine(s4);
    
  }
}
