package com.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLInkedList {

    @Test
    public void given3IntegersAddedToLinkedListShouldReturnToTop(){
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);
        linkedList.printNode();
        boolean result = linkedList.head.equals(thirdNode) &&
                linkedList.head.getNextNode().equals(secondNode) &&
                linkedList.tail.equals(firstNode);
        Assertions.assertTrue(result);

    }
}
