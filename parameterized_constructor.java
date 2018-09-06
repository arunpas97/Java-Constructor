class constructor
	{
		constructor(String name,int age)
			{
				System.out.println("The Name is	:"+name);
				System.out.println("The Age is	:"+age);
			}	
	}
class parameterized_constructor
	{
		public static void main(String a[])
			{
				constructor obj=new constructor("Arun",21);
			}
	}