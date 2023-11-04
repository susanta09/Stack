package in.linkedList.single;

public class Merge {
	static public LinkedList merge(LinkedList l,Node l1,Node l2)
	{
		
		while(l1!=null)
		{
			l.addLast(l1.data);
			l1=l1.next;
		}
		while(l2!=null)
		{
			l.addLast(l2.data);
			l2=l2.next;
		}
		return l;
	}

}
