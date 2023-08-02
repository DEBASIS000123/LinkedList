package Student;
import java.util.Scanner;
public class linkedlist {
	node start;
	int c=0;
	Scanner sc=new Scanner(System.in);
	void create() {
		node n=new node();
		System.out.println("Input Regd no and mark:");
		n.regdno=sc.nextInt();
		n.dsamark=sc.nextDouble();
		n.next=null;
		start=n;
		System.out.println("***********************");
		System.out.println("Do you want to add more nodes(0/1):");
		int ch=sc.nextInt();
		while(ch!=0) {
			node q=n;
			n=new node();
			System.out.println("Input Regd no and mark:");
			n.regdno=sc.nextInt();
			n.dsamark=sc.nextDouble();
			n.next=null;
			q.next=n;
			System.out.println("***********************");
			System.out.println("Do you want to add more nodes(0/1):");
			ch=sc.nextInt();
		}
	}
	void display() {
		System.out.println("The linkedList is:");
		System.out.println("Start ="+start);
		node temp=start;
		while(temp!=null) {
			System.out.println("Regd No. "+temp.regdno+"\n"+"DSA Mark:"+temp.dsamark+"\n"+temp.next);
			temp=temp.next;
			System.out.println();
		}
		
	}
	int passedstudent() {
		node curnode=start;
		while(curnode!=null) {
			if(curnode.dsamark>40) {
				c++;
			}
			curnode=curnode.next;
		}
		return c;
	}
}
