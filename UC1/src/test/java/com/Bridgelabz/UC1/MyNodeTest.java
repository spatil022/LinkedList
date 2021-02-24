package com.Bridgelabz.UC1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyNodeTest {

	@Test
	public void givenThreeNumbersToLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThreeNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThreeNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThreeNode);
		assertTrue(result);
	}

}
