package com.hr.ds.tree;

public class NodeMain {

	public static void main(String[] args) {
		
		Node node1 = NodeUtil.createNode(1);
		Node node2 = NodeUtil.createNode(2);
		Node node3 = NodeUtil.createNode(3);
		Node node4 = NodeUtil.createNode(4);
		Node node5 = NodeUtil.createNode(5);
		Node node6 = NodeUtil.createNode(6);
		Node node7 = NodeUtil.createNode(7);

		NodeUtil.setRightChild(node1, node2);
		//NodeUtil.setLeftChild(node1, node2);
		
		NodeUtil.setRightChild(node2, node5);
		//NodeUtil.setLeftChild(node2, node4);
		
		NodeUtil.setLeftChild(node5, node3);
		NodeUtil.setRightChild(node5, node7);
		
		NodeUtil.setRightChild(node3, node4);
		//NodeUtil.setLeftChild(node3, node6);

		NodeUtil.preOrder(node1);
		
		System.out.println();
		NodeUtil.inOrder(node1);
		
		System.out.println();
		NodeUtil.postOrder(node1);
		
		System.out.println();
		System.out.println(NodeUtil.getHeight(node1));
		
		System.out.println();
		NodeUtil.topView(node1);
		
		System.out.println();
		NodeUtil.levelOrderTraversal(node1);
		
		System.out.println();
		node1 = NodeUtil.insertBST(node1, 6);
	}
	
}
