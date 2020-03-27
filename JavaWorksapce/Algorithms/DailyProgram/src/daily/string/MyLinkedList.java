package daily.string;

class Node {
	int data;
	Node next;

	Node(int value) {
		this.data = value;
		this.next = null;
	}
}

class MyLinkedList {

	Node head = null;

	/** Initialize your data structure here. */
	public MyLinkedList() {

	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		Node current = null;
		current = head;
		int i = 0;
		while (current != null) {
			if (i == index) {
				return current.data;
			}
			current = current.next;

			i++;

		}
		return -1;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		if (head == null) {
			head = new Node(val);
		} else {
			Node current = new Node(val);
			current.next = head;
			head = current;
		}
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		Node current = null;
		Node prev = null;
		current = head;
		while (current != null) {
			prev = current;
			current = current.next;

		}
		Node newNode = new Node(val);
		prev.next = newNode;

	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		Node current = null;
		int i = 0;
		current=head;
		if (head == null && index == 0) {
			addAtHead(val);
			return;
		} else if (head != null && index == 0) {
			addAtHead(val);
			return;
		}
		while (current != null) {
			if (i == index - 1) {
				Node newNode = new Node(val);
				newNode.next = current.next;
				current.next = newNode;
				break;
			}
		}
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int position) {

		if (position == 0) {
			head = head.next;
			return;

		}

		Node n = head;
		for (int i = 0; i < position - 1; i++) {
			n = n.next;
		}
		n.next = n.next.next;
	}

	public static void main(String arg[]) {

		MyLinkedList obj = new MyLinkedList();
		/*
		 * obj.addAtHead(7); obj.addAtHead(2); obj.addAtHead(1); obj.addAtIndex(3,0);
		 * obj.deleteAtIndex(2); obj.addAtHead(6); obj.addAtTail(4); System.out.println(
		 * obj.get(4)); obj.addAtHead(4); obj.addAtIndex(5,0); obj.addAtHead(6);
		 * obj.addAtHead(1); obj.addAtTail(3); obj.addAtIndex(1,2); System.out.println(
		 * obj.get(1)); obj.deleteAtIndex(0); System.out.println( obj.get(0));
		 */
		/*obj.addAtIndex(0, 10);
		obj.addAtIndex(0, 20);
		obj.addAtIndex(1, 30); */ 
		
		
		obj.addAtHead(1);
		obj.addAtTail(3);
		obj.addAtIndex(1, 2);		
		System.out.println(obj.get(1));
		obj.deleteAtIndex(1);
		System.out.println(obj.get(1));
		
	}
}
