package com.linkedlist;

public class Node<K> {

    private K key;
    private Node<K> nextNode;

    Node(K value){
        this.key = value;
    }

    public Node<K> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<K> nextNode) {
        this.nextNode = nextNode;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
