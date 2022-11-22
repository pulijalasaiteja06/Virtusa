import java.io.*;

interface sai{
public void aa();
}

interface teja{
public void bb();
}
class saiteja implements sai,teja{
public void aa(){
System.out.println("1st Interface");
}
public void bb(){
System.out.println("2nd Interface");
}
}

public class InT{
public static void main(String[] args){
saiteja o=new saiteja();
o.aa();
o.bb();
}
}