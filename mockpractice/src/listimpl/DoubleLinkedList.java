package listimpl;

public class DoubleLinkedList {
	private Node1 first=null;
	private int count=0;
	
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node1(e,null,null);
			count++;
			return;
		}
		Node1 curr=first;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node1(e,curr,null);
		count++;
	}
	
	public void add(int index,Object e)
	{
		if(index<=-1||index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		if(index==0)
		{
			Node1 n=new Node1(e,null,first);
			first.prev=n;
			first=n;
			count++;
			return;
		}
		Node1 curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		Node1 n=new Node1(e,curr,curr.next);
		curr.next.prev=n;
		curr.next=n;
		count++;
	}
	
	public int size()
	{
		return count;
	}
	
	public Object get(int index)
	{
		if(index<=-1||index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		Node1 curr=first;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;	
	}
	
	public void remove(int index)
	{
		if(index<=-1||index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		if(index==0)
		{
			first=first.next;
			if(first!=null)first.prev=null;
			count--;
			return;
		}
		Node1 curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		if(curr.next!=null)curr.next.prev=curr;
		count--;
	}
	
	public void reverse()
	{
		Node1 prev=null;
		Node1 curr=first;
		Node1 next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			curr.prev=next;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
}
