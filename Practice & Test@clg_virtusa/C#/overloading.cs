//Polymorphism
using System;
//over loading
//virtual and override helps to get the output without warnings
class A{
    public void sai(){     //virtual keyword for base class
        Console.WriteLine("not overrided A");
    }

    public void sai(string s,int y){
        Console.WriteLine(s+" "+y);
    }
    
}


class sai{
    public static void Main(string[] args){
        A o=new A();
        o.sai();
        o.sai("sai",6);
        
    }
}