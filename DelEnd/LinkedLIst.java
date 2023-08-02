package DelEnd;
import java.util.Scanner;
public class LinkedLIst {
	Node start;
	Scanner sc=new Scanner(System.in);
	void create() {
		Node n=new Node();
		System.out.println("Enter the name :");
		n.name=sc.next();
		System.out.println("ENter the age :");
		n.age=sc.nextInt();
		n.next=null;
		start=n;
		System.out.println("Do you want to add more (0/1):");
		int ch=sc.nextInt();
		while(ch!=0) {
			Node q=n;
			n=new Node();
			System.out.println("Enter the name :");
			n.name=sc.next();
			System.out.println("ENter the age :");
			n.age=sc.nextInt();
			n.next=null;
			q.next=n;
			System.out.println("Do you want to add more (0\1):");
			ch=sc.nextInt();
		}
	}
	void display() {
		Node temp=start;
		while(temp!=null) {
			System.out.println("Name="+temp.name+"  "+"Age="+temp.age+"  "+temp.next);
			temp=temp.next;
		}
	}
	void DelEnd() {
		if(start==null) {
			System.out.println("Underflow.");
		}
		else if(start.next==null) {
			start=null;
		}
		else {
			Node p=start;
			while(p.next.next!=null) {
				p=p.next;
			}
			p.next=null;
		}
	}
}
