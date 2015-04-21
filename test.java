class xinxi
{
	private static int nextID=1;
	private int id;
	private String name,post;
	private long salary;
	
	//利用静态变量设置工号
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
		System.out.println("工号:" +id +"\t姓名:" +name +"\t职务" +post +"\t月薪:" +salary);
	}

	//构造方法
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
		a=new xinxi("丁一","职员",5656);
		b=new xinxi("王二","经历",9000);
		c=new xinxi("张三","老板",200000);
	
		a.print();
		b.print();
		c.print();
	
	}
}