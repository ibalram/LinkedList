package com.cg;

import org.junit.Test;

import com.cg.Node;

import static org.junit.Assert.*;

public class LinkedListTest {

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

	@Test
	public void given3NumbersWhenAppendedToLinkedListTestShouldBeAddedOnLast() {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		LinkedList linkedList = new LinkedList();
		linkedList.append(thirdNode);
		linkedList.append(secondNode);
		linkedList.append(firstNode);
		assertEquals("56->30->70", linkedList.toString());
	}

	@Test
	public void given3NumbersWhenAddedToLinkedListTestShouldBeAddedOnMiddle() {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		LinkedList linkedList = new LinkedList();
		linkedList.append(thirdNode);
		linkedList.append(firstNode);
		linkedList.addAtMiddle(secondNode);
		assertEquals("56->30->70", linkedList.toString());
	}

	@Test
	public void givenLinkedListTestShouldDeleteFirstElement() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		Node poppedNode = (Node) linkedList.pop();
		assertEquals(firstNode, poppedNode);
	}
}
