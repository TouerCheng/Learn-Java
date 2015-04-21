class test
{
	private int a;//private本类可以访问

	intest b=new intest();//让在外类中可以访问内部类

	public class intest
	{
		public void show()
		{
			a++;
			System.out.println("a="+a);
		}
	}
}
class inclass
{
	public static void main(String[] args)
	{
		test cl=new test();//创建外部类cl
		test.intest incl=cl.new intest();//创建cl的内部类incl
		test.intest o=new test().new intest();//等于incl
		incl.show();
		o.show();
		cl.b.show();
	}	
}
//如果不希望外部访问内部类，可以设为private。