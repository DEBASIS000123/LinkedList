package DelAny;
import java.util.Scanner;
public class LinkedList {
	Node start;
	Scanner sc=new Scanner(System.in);
	int c=0;
	void create() {
		Node n=new Node();
		System.out.println("Enter the name :");
		n.name=sc.next();
		System.out.println("Enter the roll :");
		n.roll=sc.nextInt();
		n.next=null;
		start=n;
		System.out.println("Do you want to add more(0/1)");
		int ch=sc.nextInt();
		while(ch!=0) {
			Node m=n;
			n=new Node();
			System.out.println("Enter the name:");
			n.name=sc.next();
			System.out.println("Enter the roll");
			n.roll=sc.nextInt();
			n.next=null;
			m.next=n;
			System.out.println("Do you want to add more(0/1):");
			ch=sc.nextInt();
		}
	}
	int count() {
		Node temp=start;
		while(temp!=null) {
			c++;
			temp=temp.next;
		}
		return c;
	}
	void display() {
		Node temp=start;
		while(temp!=null) {
			System.out.println("Name="+temp.name+"  "+"Roll="+temp.roll+"  "+temp.next);
			temp=temp.next;
		}
	}
	void DelBeg() {
		if(start==null) {
			System.out.println("Underflow.");
		}
		else {
			Node temp=start;
			start=start.next;
			temp.next=null;
			temp=null;
		}
	}
	void DelEnd() {
		if(start==null) {
			System.out.println("Underflow.");
		}
		else if(start.next==null){
			start=null;
		}
		else {
			Node temp=start;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
		}
	}
	void DelAny() {
		System.out.println("Enter the Node no to delete :");
		int pos=sc.nextInt();
		int c=count();
		if(pos<1 || pos>c) {
			System.out.println("Invalid Node number.");
		}
		else {
			if(pos==1) {
				DelBeg();
			}
			else if(pos==c) {
				DelEnd();
			}
			else {
				if(start==null) {
					System.out.println("Underflow.");
				}
				else {
					int i=1;
					Node temp=start;
					while(i<pos-1) {
						temp=temp.next;
						i++;
					}
					Node q=temp.next;
					temp.next=temp.next.next;
					q.next=null;
					q=null;
				}
			}
		}
	}
}
