package in.linkedList.single;

public class LinkedListDemo {
	public static void main(String[] args) throws Exception {
		LinkedList l = new LinkedList();
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

		l.addAt(20, l.getSize());
		l.display();

//		l.addAt(60, -1);
//		l.display();
		l.addLast(200);
		l.display();
		System.out.println(l.getSize());
		System.out.println(l.isPresent(200));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println("--------------");
		System.err.println(l.getAt(0));
		System.out.println(l.removeFirst());
		l.display();
		System.out.println(l.removeLast());
		l.display();
		System.out.println(l.removeLast());
		l.display();
		System.out.println(l.removeAt(2));
		l.display();
		System.out.println(l.getSize());
		LinkedList l2=new LinkedList();
		l2.addFirst(1000);
		l2.addFirst(200);
		l2.addLast(3000);
		l2.display();
		LinkedList l3=new LinkedList();
		l3.merge(l, l2);
		l3.display();
		LinkedList l4=new LinkedList();
		l4.merge(l2, l);
		l4.display();
		System.out.println("==============");
		LinkedList l5=new LinkedList();
		l5=l5.merge(new LinkedList(), l, l2);
		l5.display();
		l5=l5.merge(new LinkedList(), l2, l);
		l5.display();
	}

}
