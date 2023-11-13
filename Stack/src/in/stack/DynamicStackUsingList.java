package in.stack;

public class DynamicStackUsingList {
	private Node head;
	private Node tail;
	private int top;
	private int size;
	public DynamicStackUsingList()
	{
		head=tail=null;
		top=-1;
		size=0;
	}
	
	private void addFirst(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			tail=n;
		}else {
			Node temp=head;
			n.next=temp;
			head=n;
		}
		top++;
		size++;
	}
	private int removeFirst()throws Exception
	{
		if(head==null)
		{
			throw new Exception("Stack is Empty..");
		}else
		{
			Node temp=head;
			head=temp.next;
			top--;
			size--;
			return temp.data;
		}
	}
	public void push(int value)
	{
		addFirst(value);
	}
	public int getTop()
	{
		return top;
	}
	public int getSize()
	{
		return size;
	}
	public int peek()
	{
		return head.data;
	}
	public int pop()throws Exception
	{
		return removeFirst();
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	

}
