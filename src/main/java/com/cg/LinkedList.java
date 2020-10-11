package com.cg;

public class LinkedList {
	private INode head;
	private INode tail;
	
	private int count = 0;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode getHead() {
		return head;
	}

	public INode getTail() {
		return tail;
	}
}
