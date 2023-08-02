package InsAny;
import java.util.Scanner;
public class LinkedList {
	Node start;
	int c;
	Scanner sc=new Scanner(System.in);
	void create() {
		Node n=new Node();
		System.out.println("ENter the regd no :");
		n.regdNo=sc.nextInt();
		System.out.println("Enter the mark:");
		n.mark=sc.nextDouble();
		n.next=null;
		start=n;
		System.out.println("Do Want to add more (0/1)");
		int ch=sc.nextInt();
		while(ch!=0) {
			Node p=n;
			n=new Node();
			System.out.println("ENter the regd no :");
			n.regdNo=sc.nextInt();
			System.out.println("Enter the mark:");
			n.mark=sc.nextDouble();
			n.next=null;
			p.next=n;
			System.out.println("Do Want to add more (0/1)");
			ch=sc.nextInt();
		}
	}
	void show() {
		Node temp=start;
		while(temp!=null) {
			System.out.println("Regd no:"+temp.regdNo+"  "+"Mark:"+temp.mark+"  "+temp.next);
			temp=temp.next;
		}
	}
	int count() {
		c=0;
		Node temp=start;
		while(temp!=null) {
			c++;
			temp=temp.next;
		}
		return c;
	}
	void InsBeg() {
		System.out.println("Enter one more Node to add:");
		Node n=new Node();
		System.out.println("Enter the Regd number :");
		n.regdNo=sc.nextInt();
		System.out.println("Enter the mark:");
		n.mark=sc.nextDouble();
		n.next=null;
		n.next=start;
		start=n;
	}
	void InsEnd() {
		System.out.println("Enter one more Node to add:");
		Node n=new Node();
		System.out.println("Enter the Regd number:");
		n.regdNo=sc.nextInt();
		System.out.println("ENter the mark");
		n.mark=sc.nextDouble();
		n.next=null;
		if(start==null) {
			start=n;
		}
		else {
			Node temp=start;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	void InsAny() {
		System.out.println("Enter the node number to insert:");
		int pos=sc.nextInt();
		int c=count();
		if(pos<1||pos>c+1) {
			System.out.println("Invalid node number.");
		}
		else {
			
		if (pos==1) {
			InsBeg();
		}
		else if(pos==c+1) {
			InsEnd();
		}
		else {
			int i=1;
			Node temp=start;
			while(i<pos-1) {
				i++;
				temp=temp.next;
			}
			Node n=new Node();
			System.out.println("Enter the Regd number:");
			n.regdNo=sc.nextInt();
			System.out.println("Enter the mark:");
			n.mark=sc.nextDouble();
			n.next=null;
			n.next=temp.next;
			temp.next=n;
		}
	}
	}
}
