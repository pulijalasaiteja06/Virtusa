using System;
using System.Collections;

interface A{
    void lang();
}
interface B{
    void region();
}

class a:A{
    public void lang(){
        ArrayList arr=new ArrayList();
        arr.Add("Hindhi");
        arr.Add("indhi");
        arr.Add("Hndhi");
        arr.Add("Hidhi");
        Console.WriteLine("LANGUAGES");
        Console.WriteLine();
        foreach(var e in arr){
            Console.WriteLine(e);
        }
    }
}


class b:B{
    public void region(){
        ArrayList ar=new ArrayList();
        ar.Add("Guru");
        ar.Add("guru");
        ar.Add("sji");
        ar.Add("snbfi");
        Console.WriteLine("REGIONS");
        Console.WriteLine();
        
        foreach(var e in ar){
            Console.WriteLine(e);
        }
    }
}

class AB:A,B{
    a o1=new a();
    b o2=new b();
    public void lang(){
        o1.lang();
    }
    public void region(){
        o2.region();
    }
    
}

class sai:AB{
    public static void Main(string[] args){
        sai obj=new sai();
        obj.lang();
        obj.region();
    } 
}