package in.stack;

public class DynamicStackLinkDemo {
	public static void main(String[] args)throws Exception {
		DynamicStackUsingList d=new DynamicStackUsingList();
		d.push(3);
		System.out.println("=========");
		d.push(8);
		d.display();
		System.out.println();
		System.out.println("Top of satack is-->"+d.peek());
		System.out.println(d.pop());
		d.display();
		d.push(100);
		System.out.println(d.peek());
	}

}

