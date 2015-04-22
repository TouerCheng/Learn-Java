class test
{
	int out=0;//实例变量
	static int stout=10;//静态变量

	static class in//静态内部类
	{
		int in1=stout;//静态内部类中可以直接访问外部类静态变量
		int in2=new test().out;//静态变量不能直接访问外部类实力变量
		static int stin=200;
	

	//方法
		void show()
		{
			System.out.println("in1="+in1);
			System.out.println("stin="+stin);
			System.out.println("in2="+in2);
			System.out.println("stout="+stout);
		}
	}	
}

class stincl
{
	public static void main(String[] args)
	{
		test.in a=new test.in();//创建静态内部类
		a.show();
	
		System.out.println("in1="+a.in1);
		System.out.println("in2="+a.in2);
		
		System.out.println("out="+new test().out);
		System.out.println("stout="+test().stout);

	}
}