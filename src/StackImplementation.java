 

class StackImplementation{
	public static void main(String[] args) {
		DynamicStack dst = new DynamicStack();
		
		Stack st = new  Stack();
		st.push(10);
		st.push(9);
		st.push(8);
		st.push(6);
		st.push(5);
		st.push(4);
		st.show();
		System.out.println(st.peek());
		System.out.println(st.pop());
		
		st.push(10);
		st.push(9);
		st.push(8);
		st.push(6);
		st.push(5);
		st.push(4);
		st.show();
		System.out.println(st.peek());
		System.out.println(st.pop());
	}
}