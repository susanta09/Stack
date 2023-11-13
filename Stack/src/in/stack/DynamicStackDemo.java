package in.stack;

public class DynamicStackDemo {
	public static void main(String[] args)throws Exception {
		DynamicStack d=new DynamicStack(3);
		d.push(2);
		d.push(4);
		d.push(6);
		d.display();
		System.out.println(d.getSize());
		d.push(8);
		d.push(10);
		d.display();
		System.out.println(d.getSize());
		
		System.out.println("=========difference dynamic stack==========");
		StackUsingArray s=new StackUsingArray(3);
		s.push(2);
		s.push(4);
		s.push(6);
		s.display();
		System.out.println(s.getSize());
		s.push(8);
		s.push(10);
		s.display();
		System.out.println(s.getSize());
		
	}

}
