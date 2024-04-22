package InstanceMeth;

public class Instance1 {
	public void add(float a,float b)
	{
	float c=a+b;
	System.out.println(c);
	}
	public static void main(String args[])
	{
	Instance1 obj=new Instance1();
	obj.add(1.2f,2.0f);

	

	}

}
