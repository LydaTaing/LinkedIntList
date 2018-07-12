/**
 * @author tainglyda
 * CSC 143
 * May 17, 2018
 *
 */
public class ListNode {
	public int data;
	public ListNode next;
	
	public ListNode() {
		this(0, null); // "this" is calling other constructor. It's referring to ListNode.
		
	}
	
	public ListNode(int data) {
		this(data, null);
		
	}
	
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next= next;
		
	}
	
	
}
