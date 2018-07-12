
public class LinkedIntListClient {

	public static void main(String[] args) {
		LinkedIntList list = new LinkedIntList();
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(10);
		
		System.out.println("List: "+ list);
		list.add(0, 3);
		list.add(2, 12);
		System.out.println("List: "+ list);
		

	}

}
