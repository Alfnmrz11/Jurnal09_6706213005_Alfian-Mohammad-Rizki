package com.company;

/* Class Node Tree */
public class NodeTree {
    NodeTree left, right;
    int data;

    /* Constructor */
    public NodeTree() {
        left = null;
        right = null;
        data = 0;
    }

    /* Constructor */
    public NodeTree(int n) {
        left = null;
        right = null;
        data = n;
    }

    /* Function to set left node */
    public void setLeft(NodeTree n) {
        left = n;
    }

    /* Function to set right node */
    public void setRight(NodeTree n) {
        right = n;
    }

    /* Function to get left node */
    public NodeTree getLeft() {
        return left;
    }

    /* Function to get right node */
    public NodeTree getRight() {
        return right;
    }

    /* Function to set data to node */
    public void setData(int d) {
        data = d;
    }

    /* Function to get data from node */
    public int getData() {
        return data;
    }
}
