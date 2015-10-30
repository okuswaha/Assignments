package com.bfs;

public class Node {
	public Node left;
	public Node right;
	public String value;
	
	public Node() {
		left = null;
		right = null;
		value = null;
	}
		
	public Node(String value) {
		this.value = value;
	}


	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
