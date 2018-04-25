package com.hr.ds.tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class NodeUtil {

	public static Node createNode(int data){
		Node newNode = new Node();
		newNode.data = data;
		
		return newNode;
	}
	
	public static void setLeftChild(Node parent, Node left){
		parent.left = left;
	}
	
	public static void setRightChild(Node parent, Node right){
		parent.right = right;
	}
	
	public static void preOrder(Node root) {
		System.out.print(root.data + " ");
		if (root.left != null) {
			preOrder(root.left);
		}
		if (root.right != null) {
			preOrder(root.right);
		}
	}
	
	public static void inOrder(Node root) {
		if (root.left != null) {
			inOrder(root.left);
		}
		System.out.print(root.data + " ");
		if (root.right != null) {
			inOrder(root.right);
		}
	}
	
	public static void postOrder(Node root) {
		if (root.left != null) {
			postOrder(root.left);
		}
		if (root.right != null) {
			postOrder(root.right);
		}
		System.out.print(root.data + " ");
	}
	
	public static int getHeight(Node root){ 
		int leftMaxHeight = 0;
		int rightMaxHeight = 0;
		
		if(root.left == null && root.right == null)
			return 0;
		if(root.left != null){
			leftMaxHeight = 1 + getHeight(root.left);
		}
		
		if(root.right != null){
			rightMaxHeight = 1 + getHeight(root.right);
		}
		
		return Math.max(leftMaxHeight, rightMaxHeight);
	}
	
	public static void topView(Node root){
		
		if(root != null){
			
			if(root.left != null){
				leftTraversal(root.left);
			}
			
			System.out.print(root.data + " ");
			
			if(root.right != null){
				rightTraversal(root.right);
			}
		}
	}
	
	private static void leftTraversal(Node root){
		if(root.left != null)
			leftTraversal(root.left);
		System.out.print(root.data + " ");
	}
	
	private static void rightTraversal(Node root){
		System.out.print(root.data + " ");
		if(root.right != null)
			rightTraversal(root.right);
	}
	
	// consider subtree also if subtree's any node pops out of outer top view
	private static void topViewWithSubTreeIncluded(Node root){
		Queue<Object[]> q = new LinkedList<>();
		Set<Integer> horizontalWeight = new HashSet<>();
		
		int currentWeight = 0;
		q.add(new Object[]{root, currentWeight});
		
		while(!q.isEmpty()){
			if(null != q.peek()){
				Object[] currentObject =  q.poll();
				currentWeight = (int) currentObject[1];
				Node node = (Node) currentObject[0];
				
				if(!horizontalWeight.contains(currentWeight)){
					horizontalWeight.add(currentWeight);
					System.out.print(node.data + " ");
				}
				
				if(node.left != null){
					q.add(new Object[]{node.left, currentWeight - 1});
				}
				if(node.right != null){
					q.add(new Object[]{node.right, currentWeight + 1});
				}
			}
		}
	}

	// does not maintain according to height of the element
	private static void findTopView(Node root, Set<Integer> horizontalWeight, int currentWeight) {
		
		if(!horizontalWeight.contains(currentWeight)){
			horizontalWeight.add(currentWeight);
			System.out.print(root.data + " ");
		}
		
		if(root.left != null){
			findTopView(root.left, horizontalWeight, currentWeight - 1);
		}
		
		if(root.right != null){
			findTopView(root.right, horizontalWeight, currentWeight + 1);
		}
	}
	
	public static void levelOrderTraversal(Node root){
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(null != queue.peek()){
			
			Node node = queue.poll();
			System.out.print(node.data + " ");
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
	}
	
	public static Node insertBST(Node root, int value){
		
		Node newNode = createNode(value);
		
		if(root == null){
			
			return newNode;
		}
		
		Node temp = root;
		while(temp.left != null || temp.right != null){
			if(temp.data >= value)
				temp = temp.left;
			else
				temp = temp.right;
		}
		
		if(temp.data >= value)
			temp.left = newNode;
		else
			temp.right = newNode;
		
		return root;
	}
}
