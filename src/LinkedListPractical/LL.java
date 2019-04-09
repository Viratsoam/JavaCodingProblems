package LinkedListPractical;

public class LL {
	
	private class Node{
		int data;
		Node next;
	}
private Node head;
private Node tail;
private int size;
public void display()
{
	Node temp = this.head;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp = temp.next;
	}
}

public void addFirst(int item)
{
	//create a new Node
	
	Node nn = new Node();
	nn.data = item;
	nn.next = null;
	
	//attach
	if(this.size>=1)
	{
		nn.next=this.head;
	}
	
	//summary object
	
	if(this.size==0)
	{
		this.head = nn;
		this.tail = nn;
		this.size++;
	}else
	{
		this.head = nn;
		this.size++;
	}
}
public int getFirst() throws Exception
{
	if(this.size==0)
	{
		throw new Exception("LL is Empty");
	}
	return this.head.data;
}

public int getLast()throws Exception
{
	if(this.size==0)
	{
		throw new Exception("LL is Empty");
	}
	return this.tail.data;
}
public int getAt(int idx) throws Exception
{
	if(this.size==0)
	{
		throw new Exception("LL is Empty");
	}
	
	if(idx<0 && idx>this.size)
	{
		throw new Exception("Index is invalid");
	}
	
	Node temp = this.head;
	for(int i=1;i<=idx;i++)
	{
		temp = temp.next;
	}
	return temp.data;
}
public int removeFirst() throws Exception
{
	if(this.size==0)
	{
		throw new Exception("LL is Empty");
	}
	int rv = this.head.data;
	if(this.size==1)
	{
		this.head=null;
		this.tail=null;
		this.size--;
	}else
	{
		this.head=this.head.next;
		this.size--;
	}
	return rv;
}
public void addLast(int item)
{
	//create new Node
	
	Node nn = new Node();
	nn.data = item;
	nn.next = null;
	
	//attach
	if(this.size>=1)
	{
		this.tail.next = nn;
	}
	
	//summary object
	if(this.size==0)
	{
		this.head = nn;
		this.tail = nn;
		this.size++;
	}else
	{
		this.tail = nn;
		this.size++;
	}
}
}
