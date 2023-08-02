package InsBeg;
import java.util.Scanner;
public class LinkedList {
	Node start;
	Scanner sc=new Scanner(System.in);
	void create() {
		Node p=new Node();
		System.out.println("Enter the Regd Number:");
		p.regdNo=sc.nextInt();
		System.out.println("Enter the mark:");
		p.mark=sc.nextDouble();
		p.next=null;
		start=p;
		System.out.println("Do you want to add more :(0/1)");
		int ch=sc.nextInt();
		if(ch!=0) {
			Node q=p;
			p =new Node();
			System.out.println("Enter the Regd Number:");
			p.regdNo=sc.nextInt();
			System.out.println("Enter the mark:");
			p.mark=sc.nextDouble();
			p.next=null;
			q.next=p;
			System.out.println("Do you want to add more :(0/1)");
			ch=sc.nextInt();
		}
	}
	void show() {
		Node temp=start;
		while(temp!=null) {
			System.out.println("Student detils :");
			System.out.println("Regd no: "+temp.regdNo+"\n"+"Mark: "+temp.mark+"\n"+temp.next);
			System.out.println();
			temp=temp.next;
		}
	}
	void InsBeg() {
		System.out.println("Enter one more Node to add at first :");
		Node m=new Node();
		System.out.println("Enter the Regd Number:");
		m.regdNo=sc.nextInt();
		System.out.println("Enter the mark:");
		m.mark=sc.nextDouble();
		m.next=null;
		m.next=start;
		start =m;
	}
	
}
