package in.stack;

public class StackDemo {
	public static void main(String[] args)throws Exception {
		StackUsingArray s=new StackUsingArray();
		s.push(4);
		s.push(7);
		s.push(9);
		s.display();
		s.pop();
		s.display();
		s.pop();
		s.display();
		//s.pop();
		s.peek();
		System.out.println("==========");
		s.display();
	}

}
