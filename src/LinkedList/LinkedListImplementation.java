package LinkedList;

class LinkedListImplementation {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(3);
		list.insert(6);
		list.insert(9);
		list.insertAtStart(1);
		list.insertAtAny(3, 2);
		list.deleteAt(4);
		list.show();
	}

}
