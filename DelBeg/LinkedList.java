package DelBeg;
import java.util.Scanner;
public class LinkedList {
	Node start;
	Scanner sc=new Scanner(System.in);
	void create() {
		Node n=new Node();
		System.out.println("Enter the name :");
		n.name=sc.next();
		System.out.println("Enter the age :");
		n.age=sc.nextInt();
		n.next=null;
		start=n;
		System.out.println("Do you want add more :(0/1)");
		int ch=sc.nextInt();
		while(ch!=0) {
			Node m=n;
			n=new Node();
			System.out.println("Enter the name :");
			n.name=sc.next();
			System.out.println("Enter the age :");
			n.age=sc.nextInt();
			n.next=null;
			m.next=n;
			System.out.println("Do you want add more :(0/1)");
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
}
