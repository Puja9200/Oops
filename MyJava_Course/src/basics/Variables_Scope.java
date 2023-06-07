package basics;

public class Variables_Scope 
{
	int a = 10; //INSTANCE VARIABLE
	static double b = 30.5; //STATIC VARIABLE
  public static void main(String args[])
  {
	  boolean c = true; //LOCAL VARIABLE
	  
	  Variables_Scope vs = new Variables_Scope();
	  System.out.println(vs.a);
	  System.out.println(b);
	  System.out.println(c);
  }
}
