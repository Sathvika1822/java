package listimpl;

public class Node1 {
	Object ele;
	Node1 prev;
	Node1 next;
	public Node1(Object e)
	{
		ele=e;
		prev=null;
		next=null;
	}
	public Node1(Object e,Node1 p,Node1 n)
	{
		ele=e;
		prev=p;
		next=n;
	}

}
