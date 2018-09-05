class overloading
	{
		overloading(String name)
			{
				System.out.println("The Name is	:"+name);
			}
		overloading(int age)
			{
				System.out.println("The Age is	:"+age);
			}
		overloading()
			{
				System.out.println("This is empty constructor");
			}
	}
class cons_over
	{
		public static void main(String a[])
			{
				overloading obj=new overloading();
				overloading obj1=new overloading("Arun");
				overloading obj2=new overloading(21);
			}
	}