package com.trees;

import java.util.ArrayList;

public class MirrorImageTrees {

    public static void main(String a[]){

        TreeNode tree;

        // TREE 1
        /* Construct the following tree
              1
             /   \
            2     2
           /  \  / \
          3   4  4  3
       */

        tree = new TreeNode(1);

        tree.right = new TreeNode(2);
        tree.left = new TreeNode(2);

        tree.right.right = new TreeNode(3);

        tree.left.right = new TreeNode(4);
        tree.right.left = new TreeNode(4);

        tree.left.left = new TreeNode(3);

        Solution8 solution8 = new Solution8();
        solution8.isSymmetric(tree);
    }
}

/**
 * Definition for a binary tree node.
 */
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Solution8 {
    public boolean isSymmetric(TreeNode root) {
        System.out.println(root);
        if(root.left==null || root.right == null){
            return false;
        }

        printInorder(root.left);
        printInorderInReverse(root.right);
        System.out.println(arr1.toString());
        System.out.println(arr2.toString());
        return (arr1.equals(arr2));
    }

    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    ArrayList<Integer> arr2 = new ArrayList<Integer>();

    void printInorder(TreeNode node)
    {
        if (node == null)
            return;
        System.out.println(node.val);

        // First recur on left child
        printInorder(node.left);

        // Then print the data of node
        arr1.add(node.val);

        // Now recur on right child
        printInorder(node.right);
    }

    void printInorderInReverse(TreeNode node)
    {
        if (node == null)
            return;
        System.out.println("2 :::: "+node.val);

        // First recur on left child
        printInorder(node.right);

        // Then print the data of node
        arr2.add(node.val);

        // Now recur on right child
        printInorder(node.left);
    }
}