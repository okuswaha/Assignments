package com.bfs;

public class BinaryTree {
	private Node root;
	
    public BinaryTree() {
        root = null;
    }

    /* Function to check if tree is empty */

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(String data) {
        root = insert(root, data);
    }

    /* Function to insert data recursively */

    private Node insert(Node node, String data) {
        if (node == null)
            node = new Node(data);
        else   {
            if (node.getRight() == null)
                node.right = insert(node.right, data);
            else
                node.left = insert(node.left, data);             
        }
        return node;
    }
    public void inorder() {
        inorder(root);
    }

    private void inorder(Node r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.println(r.getValue());
            inorder(r.getRight());
        }
    }
    
    public void preorder() {
        preorder(root);
    }

    private void preorder(Node r) {
        if (r != null)
        {
            System.out.println(r.getValue());
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
    public void postorder()  {
        postorder(root);
    }

    private void postorder(Node r) {
        if (r != null)
        {
            postorder(r.getLeft());             
            postorder(r.getRight());
            System.out.println(r.getValue());
        }
    }     
}
