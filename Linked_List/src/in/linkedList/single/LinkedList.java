package in.linkedList.single;

public class    {
	private Node head;
	private Node tail;
	private int size;
	
	
	public LinkedList() {
		head=tail=null;
		size=0;
	}

	public Integer getSize()
	{
		return size;
	}

	public void addFirst(Integer data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			tail=n;			
		}else
		{
			n.next=head;
			head=n;
		}
		size=size+1;
		
	}
	public void addLast(Integer data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			addFirst(data);
		}else
		{
			tail.next=n;
			tail=tail.next;
		}
		size=size+1;
	}
	public void addAt(Integer data,int index)throws Exception
	{
		Node n=new Node(data);
		Node temp=head;
		if(index<0||index>size)
		{
			throw new Exception();
		}
		if(index==0)
		{
			addFirst(data);
		}else if(index==size){
			addLast(data);
		}else {
			for(int i=1;i<index;i++)
			{
				temp=temp.next;
			}
			n.next=temp.next;
			temp.next=n;
			size++;
		}
		
	}
	public boolean isPresent(Integer data)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				return true;
			}
			temp=temp.next;
			
		}
		System.out.println(tail);
		return false;
	}
	public int getFirst()throws Exception
	{
		Node temp=head;
		if(head==null)
		{
			throw new Exception("List is empty");
		}else {
			return temp.data;
		}
		
	}
	public int getLast()throws Exception
	{
		Node temp=tail;
		if(head==null)
		{
			throw new Exception("List is empty");
		}else {
			return temp.data;
		}
	}
	public int getAt(int index)throws Exception
	{
		if(index<0||index>size)
		{
			throw new Exception("Index out of bound");
		}else if(head==null)
		{
			throw new Exception("list is empty");
		}
		else {
			Node temp=head;
			for(int i=1;i<index;i++)
			{
				temp=temp.next;
			}
			return temp.data;
		}
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}

}
