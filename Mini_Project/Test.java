package Mini_Project;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		ll.create();
		ll.display();
		while(true) {
			System.out.println("********************");
			System.out.println("0. Exit");
			System.out.println("1. Display Data");
			System.out.println("2. Count Data");
			System.out.println("3. Search By Regd number");
			System.out.println("4. Insert at begin");
			System.out.println("5. Insert at ending");
			System.out.println("6. Inseert at any Node");
			System.out.println("7. Delete the begin");
			System.out.println("8. Delete the End");
			System.out.println("9. Delete any Node");
			System.out.println("*********************");
			int ch=sc.nextInt();
			switch(ch) {
			case 0:System.out.println("Thank You!!!");
				return;
			case 1:ll.display();
			break;
			case 2:ll.countd();
			break;
			case 3:ll.searchregd();
			break;
			case 4:ll.InsBeg();
			break;
			case 5:ll.InsEnd();
			break;
			case 6:ll.InsAny();
			break;
			case 7:ll.DelBeg();
			break;
			case 8:
			break;
			case 9:
			break;
			}
		}
	}

}
