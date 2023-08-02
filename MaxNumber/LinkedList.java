package MaxNumber;
import java.util.Scanner;
public class LinkedList {
	Node start;
	int max;
	Scanner sc=new Scanner(System.in);
	void create() {
		Node n=new Node();
		System.out.println("Enter the number :");
		n.data=sc.nextInt();
		n.next=null;
		start=n;
		System.out.println("Do you want to add more number :(1/0)");
		int ch=sc.nextInt();
		while(ch!=0) {
			Node q=n;
			n=new Node();
			System.out.println("Enter the number :");
			n.data=sc.nextInt();
			n.next=null;
			q.next=n;
			System.out.println("Do you want to add more number :(1/0)");
			ch=sc.nextInt();
		}
		
	}
	int maxnumber() {
		Node temp=start;
		max=0;
		while(temp!=null) {
			if(temp.data>max) {
				max=temp.data;
			}
			temp=temp.next;
		}
		return max;
	}

}
