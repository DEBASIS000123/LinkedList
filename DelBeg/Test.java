package DelBeg;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.create();
		ll.display();
		System.out.println("After Deleting the first node :");
		System.out.println();
		ll.DelBeg();
		ll.display();
	}

}
