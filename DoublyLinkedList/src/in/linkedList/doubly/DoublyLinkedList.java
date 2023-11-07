package in.linkedList.doubly;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;
	public DoublyLinkedList()
	{
		this.head=null;
		this.tail=null;
		this.size=0;
	}

	public void size()
	{
		System.out.println(size);
	}
	public int getSize()
	{
		return size;
	}
	public void addFirst(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			//n.previous=head;
			head=tail=n;
		}else {
			n.next=head;
			head.previous=n;
			head=n;
		}
		size++;
	}
	public void addLast(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			//n.previous=head;
			head=tail=n;
		}else {
			n.previous=tail;
			tail.next=n;
			tail=n;
		}
		size++;
	}
	public void addAt(int index,int data)throws Exception
	{
		Node n=new Node(data);
		if(index<0||index>size)
		{
			throw new  Exception("Index out of bounds..");
		}
		if(index==0)
		{
			addFirst(data);
		}else if(size==index)
		{
			addLast(data);
		}
		else {
			Node temp=head;
			for(int i=1;i<index;i++)
			{
				System.out.println(temp.data);
				temp=temp.next;
				System.out.println(temp.data);
			}
			n.next=temp.next;
			n.previous=temp.next.previous;
//			temp.next=n; //74 and 75 is given wrong result when we travle backword   
//			temp.next.previous=n;
			
			temp.next.previous=n;
			temp.next=n;
			
			size++;
		}
	}
	public void reverse()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.previous;
		}
		System.out.println();
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
	}
	

}
