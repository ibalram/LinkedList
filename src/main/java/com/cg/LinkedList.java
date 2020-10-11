package com.cg;

public class LinkedList {
	private INode head;
	private INode tail;

	private int count = 0;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode node) {
		if (head == null) {
			this.head = node;
			this.tail = node;
		} else {
			node.setNext(head);
			this.head = node;
		}
	}
	
	public void append(INode node) {
		if (head == null) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.setNext(node);
			this.tail = tail.getNext();
		}
	}
	
	public void printLinkedList() {
		String str = this.toString();
		System.out.println(str.length()!=0? str:"LinkedList is empty.");
	}
	
	public String toString() {
		if (head == null) {
			return "";
		}
		StringBuilder str = new StringBuilder();
		INode root = head;
		str.append(root.getKey());
		root = root.getNext();
		while (root != null) {
			str.append("->" + root.getKey());
			root = root.getNext();
		}
		return str.toString();
	}

	public INode getHead() {
		return head;
	}

	public INode getTail() {
		return tail;
	}
}
