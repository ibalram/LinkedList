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

	@Test
	public void givenLinkedListTestShouldDeleteLastElement() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		Node poppedNode = (Node) linkedList.popLast();
		assertEquals(thirdNode, poppedNode);
	}

	@Test
	public void givenLinkedListTestFindNodeWithValue() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		Node nodeWithValue = (Node) linkedList.find((Integer) 30);
		assertEquals(30, nodeWithValue.getKey());
	}

	@Test
	public void givenLinkedListTestInsertNodeAfterGivenNode() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		Node nodeWithValue = (Node) linkedList.find((Integer) 30);
		linkedList.insertAfterNode(nodeWithValue, (Integer) 40);
		assertEquals("56->30->40->70", linkedList.toString());
	}

	@Test
	public void givenLinkedListTestDeleteNodeWithGivenValue() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		Node nodeWithValue = (Node) linkedList.find((Integer) 30);
		linkedList.insertAfterNode(nodeWithValue, (Integer) 40);
		linkedList.remove(40);
		assertEquals(3, linkedList.size());
	}

	@Test
	public void givenOrderedLinkedListTest() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		Node<Integer> fourthNode = new Node<>(40);
		OrderedLinkedList orderedLinkedList = new OrderedLinkedList();
		orderedLinkedList.add(firstNode);
		orderedLinkedList.add(secondNode);
		orderedLinkedList.add(thirdNode);
		orderedLinkedList.add(fourthNode);
		assertEquals("30->40->56->70", orderedLinkedList.toString());
	}
}
