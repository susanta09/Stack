package in.stack;

public class StackUsingArray {
	private int data[];
	private int top;
	public static final int DEFAULT_CAPACITY=10;
	
	public StackUsingArray() {
		data=new int[DEFAULT_CAPACITY];
		top=-1;
	}
	public StackUsingArray(int capacity)throws Exception
	{
		if(capacity<1)
		{
			throw new Exception("Invalid stack capacity...");
		}
		data=new int[capacity];
		top=-1;
	}
	public int getSize()
	{
		return top+1;
	}
	
//	public boolean isEmpty()
//	{
//		return top
//	}
	
	
	public void push(int value)throws Exception
	{
		if(getSize()==data.length)
		{
			throw new Exception("Stack is full");
		}
		top++;
		data[top]=value;
	}
	public int pop()throws Exception
	{
		if(top==-1)
		{
			throw new Exception("Stack is empty..");
		}
		int value=data[top];
		top--;
		return value;
	}
	public int peek()throws Exception
	{
		if(top==-1)
		{
			throw new Exception("Stack is empty..");
		}
		return data[top];
	}
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}

}
