package DelEnd;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedLIst ll=new LinkedLIst();
		ll.create();
		ll.display();
		System.out.println("After deleting Last Node:");
		System.out.println();
		ll.DelEnd();
		ll.display();
		
	}

}
