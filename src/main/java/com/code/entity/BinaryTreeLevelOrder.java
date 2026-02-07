package com.code.entity;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeLevelOrder {

    public static List<List<Integer>> levelOver(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(level);
        }
        return result;
    }

    public static List<Integer> levelOrderFlat(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            result.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return result;
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(3);


        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right = new TreeNode(5);
        root.right = new TreeNode(11);

        root.right = new TreeNode(15);
        root.right = new TreeNode(7);


        root.right = new TreeNode(2);
        root.right = new TreeNode(6);

        root.right = new TreeNode(10);
        root.right = new TreeNode(12);

        root.right = new TreeNode(13);
        root.right = new TreeNode(8);

        root.right = new TreeNode(4);


        System.out.println("Level Order (Flat Lists): ");
        System.out.println(levelOrderFlat(root));


    }

}