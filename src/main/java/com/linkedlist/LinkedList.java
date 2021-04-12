package com.linkedlist;

public class LinkedList<K> {
    public INode<K> tail;
    public INode<K> head;

    LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> node) {
        if(this.tail == null) {
            this.tail = node;
        }
        if (this.head == null) {
            this.head = node;
        } else {
            INode<K> tempNode = this.head;
            this.head = node;
            this.head.setNextNode(tempNode);
        }
    }

    public void append(INode<K> newNode){
        if (tail == null) {
            this.tail = newNode;
        }
        if (head == null) {
            this.head = newNode;
        } else {
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode<K> node, INode<K> newNode){
        INode<K> tempNode = node.getNextNode();
        node.setNextNode(newNode);
        newNode.setNextNode(tempNode);
    }

    public void printNode(){
        System.out.println("My Nodes: " +head);
    }
}
