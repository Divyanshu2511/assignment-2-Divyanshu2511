/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args) {

        TraversalOperations t = new TraversalOperations();
        MyBinarySearchTree mst = new MyBinarySearchTree();
        TreeNode root = new TreeNode(10);
        mst.insert(root, 6);
        mst.insert(root, 10);
        mst.insert(root, 11);
        mst.insert(root, 7);
        mst.insert(root, 8);
        mst.insert(root, 12);
        mst.insert(root, 3);
        mst.insert(root, 25);
        mst.insert(root, 20);
        mst.insert(root, 45);
        mst.insert(root, 21);
        mst.insert(root, 5);
        t.printPreorder(root);
        System.out.println();
        t.printPostorder(root);
    }
}
