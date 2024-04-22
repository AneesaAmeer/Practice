package InheritancePractice;

public class thiskeyuse {
	String name;
	int rollnumber;
	public void details(String name,int rollnumber)
	{
	this.name=name;
	this.rollnumber=rollnumber;
	}
	public void display()
	{
	System.out.println(name+" "+rollnumber);
	}
	public static void main(String args[])
	{
	thiskeyuse obj=new thiskeyuse();
	obj.details("Amala",15);
	obj.display();


	}

}
