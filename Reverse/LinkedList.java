package Reverse;
import java.util.Scanner;
public class LinkedList {
	Node start;
	Scanner sc=new Scanner(System.in);
	void create() {
		Node n=new Node();
		System.out.println("Enter the name:");
		n.name=sc.next();
		System.out.println("Enter the age:");
		n.age=sc.nextInt();
		n.next=null;
		start=n;
		System.out.println("Do you want add more (0/1)");
		int ch=sc.nextInt();
		while(ch!=0) {
			Node q=n;
			n=new Node();
			System.out.println("Enter the name:");
			n.name=sc.next();
			System.out.println("Enter the age:");
			n.age=sc.nextInt();
			n.next=null;
			q.next=n;
			System.out.println("Do you want add more (0/1)");
			ch=sc.nextInt();
		}
	}
	void show() {
		Node temp=start;
		while(temp!=null) {
			System.out.println("Name="+temp.name+"  "+"Age="+temp.age+"  "+temp.next);
			temp=temp.next;
		}
	}
	void reverse() {
		if(start==null) {
			System.out.println("Undeflow.");
		}
		else if(start.next==null) {
			System.out.println("Reverse not required.");
		}
		else {
			Node curnode=start;
			Node prev=null;
			while(curnode!=null) {
				Node temp=curnode.next;
				curnode.next=prev;
				prev=curnode;
				curnode=temp;
			}
		}
		
	}
}
