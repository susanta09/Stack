package in.linkedList.single;

public class LinkedList   {
	private Node head;
	private Node tail;
	private int size;
	
	
	public LinkedList() {
		head=tail=null;
		size=0;
	}

	
//	public Node getHead() {
//		return head;
//	}
//	public void setHead(Node head) {
//		this.head = head;
//	}
//	public Node getTail() {
//		return tail;
//	}
//	public void setTail(Node tail) {
//		this.tail = tail;
//	}


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
	public int removeFirst()throws Exception
	{
		Node temp=head;
		if(temp==null)
		{
			throw new Exception("List is empty..");
		}else if(temp.next==null)
		{
			head=tail=null;
			size--;
			return temp.data;
		}else
		{
			head=temp.next;
			size--;
			return temp.data;
		}
	}
	public int removeLast()throws Exception
	{
		Node temp=head;
		int data=0;
		if(temp==null)
		{
			return removeFirst();
		}else if(temp.next==null)
		{
			return removeFirst();
		}else {
			while(temp!=null)
			{
				if(temp.next==tail)
				{
					tail=temp;
					size--;
					data=temp.next.data;
					tail.next=null;
				}
				temp=temp.next;
			}
			return data;
		}
	}
	public int removeAt(int index)throws Exception
	{
		Node temp=head;
		if(temp==null)
		{
			throw new Exception("list is empty..");
		}else if (index<0||index>size) {
			throw new Exception("index out of bound..");
		}else {
			for(int i=1;i<index;i++)
			{
				temp=temp.next;
			}
			int data=temp.next.data;
			temp.next=temp.next.next;
			size--;
			return data;
		}
	}
	public void merge(LinkedList l1,LinkedList l2)
	{
		System.out.println(l1.head);
		System.out.println(l2.head);
		if(l1.head==null&&l2.head!=null)
		{
			head=l2.head;
			System.out.println("ram1");
		}else if (l1.head!=null&&l2.head==null) {
			head=l1.head;
			System.out.println("ram2");
		}else if(l1.head==null&&l2.head==null) {
			head=null;
			System.out.println("ram3");
		}else
		{
			Node temp1=l1.head;
			Node temp2=l2.head;
			head=Merge.merge(new LinkedList(),temp1, temp2).head;
		}
		
	}
	public LinkedList merge(LinkedList nl,LinkedList l1,LinkedList l2)
	{
		System.out.println(l1.head);
		System.out.println(l2.head);
		if(l1.head==null&&l2.head!=null)
		{
			nl.head=l2.head;
			System.out.println("ram1");
		}else if (l1.head!=null&&l2.head==null) {
			nl.head=l1.head;
			System.out.println("ram2");
		}else if(l1.head==null&&l2.head==null) {
			nl.head=null;
			System.out.println("ram3");
		}else
		{
			Node temp1=l1.head;
			Node temp2=l2.head;
			nl=Merge.merge(new LinkedList(),temp1, temp2);
		}
		return nl;
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
