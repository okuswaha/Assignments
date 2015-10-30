package com.bfs;

public class BinaryTreeTest {
	public static void main(String args[]){
		BinaryTree tree= new BinaryTree();
		tree.insert("Country Safety");
		tree.insert("army");
		tree.insert("navy");
		tree.insert("army weapon 1");
		tree.insert("army weapon 2");
		tree.insert("navy weapon 1");
		tree.insert("navy weapon 2");
		tree.postorder();
	}

}
