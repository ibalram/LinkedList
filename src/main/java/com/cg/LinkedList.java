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

	public void addAtMiddle(INode node) {
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		INode slow = head;
		INode fast = head.getNext();
		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		node.setNext(slow.getNext());
		slow.setNext(node);
	}

	public INode pop() {
		if (head == null) {
			return null;
		}
		INode ret = head;
		head = head.getNext();
		ret.setNext(null);
		return ret;
	}

	public INode popLast() {
		if (head == null) {
			return null;
		}
		INode prev = null;
		INode root = head;
		while (root != null && root.getNext() != null) {
			prev = root;
			root = root.getNext();
		}
		INode ret = prev.getNext();
		prev.setNext(null);
		ret.setNext(null);
		return ret;
	}

	public <T> INode find(T key) {
		INode root = head;
		while (root != null) {
			if (root.getKey() == key) {
				return root;
			}
			root = root.getNext();
		}
		return null;
	}

	public void printLinkedList() {
		String str = this.toString();
		System.out.println(str.length() != 0 ? str : "LinkedList is empty.");
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
