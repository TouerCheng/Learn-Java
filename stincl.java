class test
{
	int out=0;//ʵ������
	static int stout=10;//��̬����

	static class in//��̬�ڲ���
	{
		int in1=stout;//��̬�ڲ����п���ֱ�ӷ����ⲿ�ྲ̬����
		int in2=new test().out;//��̬��������ֱ�ӷ����ⲿ��ʵ������
		static int stin=200;
	

	//����
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
		test.in a=new test.in();//������̬�ڲ���
		a.show();
	
		System.out.println("in1="+a.in1);
		System.out.println("in2="+a.in2);
		
		System.out.println("out="+new test().out);
		System.out.println("stout="+test().stout);

	}
}