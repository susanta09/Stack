package in.stack;


public class DynamicStack extends StackUsingArray {
	
	public DynamicStack()throws Exception {
		this(DEFAULT_CAPACITY);	
	}
	public DynamicStack(int capacity)throws Exception{
		super(capacity);
	}
	
	public void push(int value)throws Exception
	{
		if(getSize()==data.length)
		{
			int arr[]=new int[2*data.length];
			for(int i=0;i<getSize();i++)
			{
				arr[i]=data[i];
			}
			data=arr;
		}
		super.push(value);
	}

}
