package Mini_Project;
import java.util.Scanner;
public class LinkedList {
	Node start;
	int c;
	Scanner sc=new Scanner(System.in);
	void create() {
		Node n=new Node();
		System.out.println("Enter the name :");
		n.name=sc.next();
		System.out.println("Enter the Regd Number:");
		n.regdno=sc.nextInt();
		System.out.println("Enter the mark :");
		n.mark=sc.nextDouble();
		n.next=null;
		start=n;
		System.out.println("Do you want to add more:(0/1)");
		int ch=sc.nextInt();
		while(ch!=0) {
			Node temp=n;
			n=new Node();
			System.out.println("Enter the name :");
			n.name=sc.next();
			System.out.println("Enter the Regd Number:");
			n.regdno=sc.nextInt();
			System.out.println("Enter the mark :");
			n.mark=sc.nextDouble();
			n.next=null;
			temp.next=n;
			System.out.println("Do youwant to add more(0/1):");
			ch=sc.nextInt();
		}
	}
	void display() {
		Node temp=start;
		while(temp!=null) {
			System.out.println("Name="+temp.name+"  "+"Regd no.="+temp.regdno+"  "+"Mark="+temp.mark+"  "+temp.next);
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
	void countd() {
		int c=count();
		System.out.println("No. of Nodes present in the Linked List="+c);
	}
	void searchregd() {
		System.out.println("Enter the Regd number to search.");
		int n=sc.nextInt();
		Node temp=start;
		while(temp!=null) {
			if(temp.regdno==n) {
				System.out.println("The Regd Number "+n+" present in the LinkedList at Node :"+temp);
				break;
			}
			temp=temp.next;
		}
	}
	void InsBeg() {
		Node n=new Node();
		System.out.println("Enter One more Node to Add at first.");
		System.out.println();
		System.out.println("Enter the name:");
		n.name=sc.next();
		System.out.println("Enter the Regd No:");
		n.regdno=sc.nextInt();
		System.out.println("Enter the Mark:");
		n.mark=sc.nextDouble();
		n.next=null;
		n.next=start;
		start=n;
		System.out.println("Node added sucessfully.");
	}
	void InsEnd() {
		Node temp=start;
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node n=new Node();
		System.out.println("Enter One more Node to Add at Last.");
		System.out.println();
		System.out.println("Enter the name:");
		n.name=sc.next();
		System.out.println("Enter the Regd No:");
		n.regdno=sc.nextInt();
		System.out.println("Enter the Mark:");
		n.mark=sc.nextDouble();
		n.next=null;
		if(start==null) {
			start=n;
		}
		else {
			temp.next=n;
		}
	}
	void InsAny() {
		System.out.println("Enter the node number to insert :");
		int c=count();
		int pos=sc.nextInt();
		if(pos<1||pos>c+1) {
			System.out.println("Invalid Node number.");
		}
		else {
			if(pos==1) {
				InsBeg();
			}
			else if(pos==c+1) {
				InsEnd();
			}
			else {
				Node n=new Node();
				System.out.println("Enter the name:");
				n.name=sc.next();
				System.out.println("Enter the regd no:");
				n.regdno=sc.nextInt();
				System.out.println("Enter the mark:");
				n.mark=sc.nextDouble();
				n.next=null;
				int i=1;
				Node temp=start;
				while(i<pos-1) {
					i++;
					temp=temp.next;
				}
				n.next=temp.next;
				temp.next=n;
			}
		}
		System.out.println("Node1 sorted sucessfully.");
	}
	void DelBeg() {
		if(start==null) {
			System.out.println("UnderFlow");
		}
		else {
			Node temp=start;
			start=start.next;
			temp.next=null;
			temp=null;
		}
		System.out.println("Node Deleted sucessfully.");
	}
}
