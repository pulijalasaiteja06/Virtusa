using System;

abstract class A{
    public abstract void mm();
    public void nn(){
        Console.WriteLine("sai");
    } 
}
class sai:A{
    public override void mm(){
        Console.WriteLine("Something");
    }
}
class sai1
{
    public static void Main(string[] args){
        A a=new sai();
        a.mm();
        a.nn();
    }
}