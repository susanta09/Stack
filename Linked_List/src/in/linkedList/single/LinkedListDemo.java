package in.linkedList.single;

public class LinkedListDemo {
	public static void main(String[] args)throws Exception {
		LinkedList l=new LinkedList();
		l.addFirst(5);
		l.addFirst(2);
		l.addFirst(8);
		l.display();
		l.addLast(30);
		l.display();
		
		l.addAt(60, 2);
		l.display();
		
		l.addAt(100, 0);
		l.display();
		
		l.addAt(200, l.getSize());
		l.display();
		
		l.addAt(60, -1);
		l.display();
		System.out.println(l.getSize());
	}

}
