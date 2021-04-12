package com.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLinkedList {

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

    @Test
    public void given3IntegersAddedToLinkedListShouldBeLastReturnTrue(){
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        boolean result = linkedList.head.equals(firstNode) &&
                linkedList.head.getNextNode().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(result);
        linkedList.printNode();
    }
}
