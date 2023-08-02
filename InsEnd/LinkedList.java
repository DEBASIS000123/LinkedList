package InsEnd;
import java.util.Scanner;
public class LinkedList {
	Node start;
	Scanner sc=new Scanner(System.in);
	void create() {
		Node p=new Node();
		System.out.println("Enter the Regd Number :");
		p.regdNo=sc.nextInt();
		System.out.println("Enter the Mark:");
		p.mark=sc.nextDouble();
		p.next=null;
		start=p; 
		System.out.println("Do you want to add more (0/1)");
		int ch=sc.nextInt();
		if(ch!=0) {
			Node q=p;
			p=new Node();
			System.out.println("Enter the Regd number :");
			p.regdNo=sc.nextInt();
			System.out.println("Enter the Mark:");
			p.mark=sc.nextDouble();
			p.next=null;
			q.next=p;
			System.out.println("Do you want to add more (0/1)");
			ch=sc.nextInt();
		}
			
	}
	void show() {
		Node temp=start;
		System.out.println("Student Detils :");
		while(temp!=null) {
			System.out.println("Regd No :"+temp.regdNo+"\n"+"Mark :"+temp.mark+"\n"+temp.next);
			System.out.println();
			temp=temp.next;
		}
	}
	void InsEnd() {
		Node n=new Node();
		System.out.println("Enter the new student detils to Insert at end :");
		System.out.println("Enter Regd no:");
		n.regdNo=sc.nextInt();
		System.out.println("Enter the Mark :");
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
}
