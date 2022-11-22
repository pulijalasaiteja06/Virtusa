class aaa{
     void sai()throws ArithmeticException{
	        int a=50/0;
	    }
}
class bbb extends aaa
{
	public static void main(String[] args) {
	    aaa b = new aaa();
	    b.sai();
	   
		System.out.println("Hello World");
	}
}