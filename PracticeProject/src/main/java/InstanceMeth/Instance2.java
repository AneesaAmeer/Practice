package InstanceMeth;

public class Instance2 {
	int a=22;
	int b=5;
	public void multiply()
	{
	int c = a*b;
	System.out.println(c);
	}
	public static void main(String args[])
	{
	Instance2 obj=new Instance2();
	obj.multiply();

	

	}

}
