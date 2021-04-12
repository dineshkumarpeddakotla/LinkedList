package com.linkedlist;

public class LinkedList<K> {
    public INode<K> tail;
    public INode<K> head;

    LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> node) {
        if(this.tail == null)
            this.tail = node;
        if (this.head == null)
            this.head = node;
        else{
            INode<K> tempNode = this.head;
            this.head = node;
            this.head.setNextNode(tempNode);
        }
    }

    public void printNode(){
        System.out.println("My Nodes: " +head);
    }
}
