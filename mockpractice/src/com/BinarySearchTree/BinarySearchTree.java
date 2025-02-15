package com.BinarySearchTree;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	Node root;
	int count=0;
	boolean flag;
	
	public boolean add(int key)
	{
		flag=true;
		root=add(root,key);
		return flag;
	}
	
	public Node add(Node n,int k)
	{
		if(n==null)
		{
			n=new Node(k);
			count++;
			return n;
		}
		else if(k<n.key)
		{
			n.left=add(n.left, k);
		}
		else if(k>n.key)
		{
			n.right=add(n.right, k);
		}
		else
		{
			flag=false;
		}
		return n;
	}
	
	public int size()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		return size()==0;
	}
	
	public void postOrder()
	{
		postOrder(root);
	}
	public void postOrder(Node n)
	{
		if(n==null) return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	
	public void preOrder()
	{
		preOrder(root);
	}
	public void preOrder(Node n)
	{
		if(n==null) return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	
	public void inOrder()
	{
		inOrder(root);
	}
	public void inOrder(Node n)
	{
		if(n==null) return;
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right);
	}
	
	public void levelOrder()
	{
		Queue q=new LinkedList();
		if(root!=null) q.add(root);
		while(!q.isEmpty())
		{
			Node  n=(Node) q.poll();
			System.out.print(n.key+" ");
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
			
		}
		System.out.println();
	}

}
