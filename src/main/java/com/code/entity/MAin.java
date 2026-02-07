package com.code.entity;

import com.code.test.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MAin {
    public  static void main(String[] args){
        List<String> add = Arrays.asList("Delhi", "Mumbai", "BAnglore");

        Emplyee emp = new Emplyee("Shubham", 45000, add);
        System.out.println(emp.getAddress());

        List<String> var = emp.getAddress();
        var.add("Chennai");
    }

}


//package com.code.entity;
//
//import java.util.*;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//}
//
//public class BinaryTreeLevelOrder {
//
//    public static List<List<Integer>> levelOver(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null) return result;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            List<Integer> level = new ArrayList<>();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                level.add(node.val);
//                if (node.left != null) queue.add(node.left);
//                if (node.right != null) queue.add(node.right);
//            }
//            result.add(level);
//        }
//        return result;
//    }
//
//    public static List<Integer> levelOrderFlat(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        if (root == null) return result;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            result.add(node.val);
//            if (node.left != null) queue.add(node.left);
//            if (node.right != null) queue.add(node.right);
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//
//        System.out.println("Level Order (Flat List): ");
//        System.out.println(levelOrderFlat(root));
//
//        System.out.println("Level Order (List of Levels): ");
//        System.out.println(levelOver(root));
//    }
//}
