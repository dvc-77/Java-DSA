package com.project300.data_structures.tree;

public class BinaryTree{

    // tree Node definition
    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val) {
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    // Inserting into a Node
    public void insert(int val) {
        root  = insertNode(root, val);
    }
    private TreeNode insertNode(TreeNode root, int val) {
        if(root == null) {
            root.val = val;
        }
        if(val < root.val) {
            root.left = insertNode(root, val);
        }
        if(val > root.val) {
            root.right = insertNode(root, val);
        }
        return root;
    }


    // In-Order Traversal, Pre-Order Traversal and Post-Order Traversal
    private void printInOrder(TreeNode node) {
        if(node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.println("node data: "+ node.val);
        printInOrder(node.right);

    }

    private void printPostOrder(TreeNode node) {
        if(node == null) {
            return;
        }
        printInOrder(node.left);
        printInOrder(node.right);
        System.out.println("node data: "+ node.val);

    }
}
