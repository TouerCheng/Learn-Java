class xinxi
{
	private static int nextID=1;
	private int id;
	private String name,post;
	private long salary;
	
	//���þ�̬�������ù���
	public void setID()
	{
		id=nextID;
		nextID++;
	}

	public void setName(String myname)
	{
		name=myname;
	}
	public void setPost(String mypost)
	{
		post=mypost;
	}
	public void setSalary(long mysalary)
	{
		salary=mysalary;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getPost()
	{
		return post;
	}
	public long getSalary()
	{
		return salary;
	}

	void print()
	{
		System.out.println("����:" +id +"\t����:" +name +"\tְ��" +post +"\t��н:" +salary);
	}

	//���췽��
	public xinxi(String myName,String myPost,long mySalary)
	{
		setID();
		setName(myName);
		setPost(myPost);
		setSalary(mySalary);
	}
}

class test
{
	public static void main(String[] args)
	{
		xinxi a,b,c;
		a=new xinxi("��һ","ְԱ",5656);
		b=new xinxi("����","����",9000);
		c=new xinxi("����","�ϰ�",200000);
	
		a.print();
		b.print();
		c.print();
	
	}
}