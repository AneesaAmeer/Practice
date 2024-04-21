package Practices;
public class multiinher2 extends multiinher1{
	public void display3()
	{
		System.out.println("this is child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiinher2 obj=new multiinher2();
		obj.display1();
		obj.display2();
		obj.display3();
}

}
