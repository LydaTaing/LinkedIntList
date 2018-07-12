/**
 * @author tainglyda
 *
 */
public class LinkedIntList {
	private ListNode front;
	private int size;

	// Create an empty list;
	public LinkedIntList() {
		front = null;
		size = 0;
	}

	// return size.
	public int size() {
		return size;
	}

	// return true if empty, otherwise return false.
	public boolean isEmpty() {
		return (size == 0);
	}

	public void add(int value) {
		if (this.isEmpty()) {
			front = new ListNode(value);
			size = 1;
		} else {
			ListNode current = front;
			ListNode temp = new ListNode(value);
			while (current.next != null) {
				current = current.next;
			}
			current.next = temp;
			size++;
		}
	}

	// create toString method to check.

	public String toString() {
		if (size == 0) {
			return "[]";
		}
		String result = "[" + front.data;
		ListNode current = front;

		while (current.next != null) {
			result += ", " + current.next.data;
			current = current.next;
		}
		result += "]";
		return result;
	}

	public boolean contain(int value) {
		ListNode current = front;
		while (current.next != null) {
			if (current.data == value) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public int indexOf(int value) {
		ListNode current = front;
		int index = 0;
		while (current != null) {
			if (current.data != value) {
				index++;
				current = current.next;
			} else {
				return index;
			}
		}
		return -1;
	}

	// pre: 0 <= index <= size or throw IndexOutOfBoundsException.
	// post:
	public void add(int index, int value) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		size++;
		if (index == 0) {
			front = new ListNode(value, front);
		} else {
			ListNode current = front;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			current.next = new ListNode(value, current.next);
		}
	}
	
	public void remove (int index) {
		if (index ==0 ) {
			front = front.next;
		}else {
			ListNode current = nodeAt(index-1);
			current.next = current.next.next;
		}
	}

	private ListNode nodeAt(int index) {
		ListNode current= front;
		for (int i = 0; i<index; i++) {
			current = current.next;
		}
		return current;
	}

}
