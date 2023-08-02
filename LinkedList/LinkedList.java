package LinkedList;

public class LinkedList {
	node head,tail;
	int size;
	public LinkedList() {
		head=tail=null;
		size=0;
	}
	public class node{
		int data;
		node next;
		public node(int data){
			this.data=data;
			this.next=null;
		}
	}
		public void addLast(int newdata) {
			node newnode=new node(newdata);
			if(head==null) {
				head=tail=newnode;
				return;
			}
			else {
				tail.next=newnode;
				tail=newnode;
			}
			size++;
		}
		public void print() {
			node temp=head;
			while(temp!=null){
			System.out.print(temp.data+"->");	
			temp=temp.next;
			}
			System.out.println();
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.addLast(1);
		l1.addLast(3);
		l1.addLast(4);
		l1.addLast(5);
		l1.addLast(6);
		l1.addLast(7);
		l1.print();
		while(l1.head!=null) {
			System.out.print(l1.head.data+"->");
			l1.head=l1.head.next;
		}
		}
	}


