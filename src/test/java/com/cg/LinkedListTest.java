package com.cg;

import org.junit.Test;

import com.cg.Node;

import static org.junit.Assert.*;

public class LinkedListTest {
	// uc2 LinkedListTest
	@Test
	public void given3NumbersWhenAddedToLinkedListTestShouldBeAddedOnTop() {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		LinkedList linkedList = new LinkedList();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		assertEquals("56->30->70", linkedList.toString());
	}
}
