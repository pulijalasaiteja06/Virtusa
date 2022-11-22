using System;
class sai{
    //Consloe.WriteLine("gggg");
    private int a=6;
    private string y="sfkn";
    public string Y{
        get{return y;}
        set{y=value;}
    }
    public int A{
        get{return a;}
        set{a=value;}
    }
    private void ff(){
        Console.WriteLine("sndbvj");
    }
}

class sai1:sai{
    public static void Main(string[] args){
        sai1 o=new sai1();
        o.A=990;
        o.Y="saiteja";
        Console.WriteLine(o.A);
        Console.WriteLine(o.Y);
        
    } 
}