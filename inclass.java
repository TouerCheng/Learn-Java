class test
{
	private int a;//private������Է���

	intest b=new intest();//���������п��Է����ڲ���

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
		test cl=new test();//�����ⲿ��cl
		test.intest incl=cl.new intest();//����cl���ڲ���incl
		test.intest o=new test().new intest();//����incl
		incl.show();
		o.show();
		cl.b.show();
	}	
}
//�����ϣ���ⲿ�����ڲ��࣬������Ϊprivate��