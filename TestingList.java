public class TestingList {

	public static void main(String[] args) {
		ListNode list= new ListNode();
		list.data = 3;
		//System.out.println(list.data);
		
		list.next = new ListNode();
		list.next.data = 9;
		
		//System.out.println(list.next.data);

		list.next.next = new ListNode();
		list.next.next.data = -4;
		//System.out.println(list.next.next.data);
		
		ListNode temp = new ListNode();
		temp.data = 5;
		temp.next = list.next;
		list.next = temp;
		
		//System.out.println(list.next.data);
		//System.out.println(list.next.next.data);
		
		temp = new ListNode();
		temp.data = 1;
		temp.next = list;
		list = temp;
		
		
		ListNode current = new ListNode();
		current = list;
		
		temp = new ListNode(48);
		
		while (current.next!=  null) {
			current = current.next;
			
		}
		current.next = temp;
		current = list;
		
		while (current!=  null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}

}
