package com.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNode {

    @Test
    public void given3Numbers_WhenLinked_ShouldPassedLinkedList_ReturnTrue(){
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        firstNode.setNextNode(secondNode);
        secondNode.setNextNode(thirdNode);
        boolean result = firstNode.getNextNode().equals(secondNode) &&
                secondNode.getNextNode().equals(thirdNode);
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
