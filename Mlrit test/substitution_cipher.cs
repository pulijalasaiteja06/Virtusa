/******************************************************************************

                            Online C# Compiler.
                Code, Compile, Run and Debug C# program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

using System;
class HelloWorld {
  static void Main() {
    string text="abcdefghijklmnopqrstuvwxyz";
    string enc="zyxwvutsrqponmlkjihgfedcba";
    string inp=Console.ReadLine();
    string res="";
    for(int i=0;i<inp.Length;i++){
        res+=enc[text.IndexOf(inp[i])];
    }
    Console.WriteLine(res);
  }
}
