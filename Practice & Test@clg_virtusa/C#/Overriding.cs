//Polymorphism
using System;
//over loading
//virtual and override helps to get the output without warnings
class A{
    public virtual void sai(){     //virtual keyword for base class
        Console.WriteLine("not overrided A");
    }
}
class B:A{
    public override void sai(){     //override keyword for derived classes
        Console.WriteLine("1 time overloaded B");
    }
}

class C:B{
    public override void sai(){     //override keyword for derived classes
        Console.WriteLine("2 time overloaded c");
    }
}

class sai{
    public static void Main(string[] args){
        A a=new A();
        A b=new B();
        A c=new C();
        a.sai();
        b.sai();
        c.sai();
    }
}