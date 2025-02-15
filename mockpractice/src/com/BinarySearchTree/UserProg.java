package com.BinarySearchTree;

public class UserProg {

	public static void main(String[] args) {
		BinarySearchTree b=new BinarySearchTree();
		b.add(50);
		b.add(30);
		b.add(60);
		b.add(10);
		b.add(35);
		b.add(55);
		b.add(70);
		System.out.println(b.size());
        b.inOrder();
        System.out.println();
        b.preOrder();
        System.out.println();
        b.postOrder();
        System.out.println();
        b.levelOrder();
	}

}
