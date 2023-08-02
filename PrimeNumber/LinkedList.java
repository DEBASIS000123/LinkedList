package PrimeNumber;
import java.util.Scanner;
public class LinkedList {
	Node start;
	int c;
	Scanner sc=new Scanner(System.in);
	void insert() {
		Node n=new Node();
		System.out.println("Enter the number:");
		n.data=sc.nextInt();
		n.next=null;
		start=n;
		System.out.println("Want to add more number 1.add 0.exit :");
		int ch=sc.nextInt();
		while(ch!=0) {
			Node m=n;
			n=new Node();
			System.out.println("Enter the number:");
			n.data=sc.nextInt();
			n.next=null;
			m.next=n;
			System.out.println("Want to add more number 1.add 0.exit :");
			ch=sc.nextInt();
		}
	}
	int checkprime() {
		
		Node temp=start;
		while(temp!=null) {
			if(isprime(temp.data)) {
				c++;
			}
			temp=temp.next;
		}
		return c;
	}
	boolean isprime(int n) {
		int i;
		for(i=2;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				break;
			}
		}
			if(i==(int)Math.sqrt(n)+1) {
				return true;
			}
			else {
				return false;
			}
	}
	
}
