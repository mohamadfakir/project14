package com.linkedlist;

public class CreateASimpleLinkedList {

    public class LinkedList {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;

        //Adding to linked list.
        public void addToLinkedList(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.next = null;
                tail = newNode;
            }
        }

        //Print LinkedList
        public void printLinkedList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "  ");
                current = current.next;
            }
        }

        public void main(String[] args) {
            LinkedList list = new LinkedList();
            System.out.println("Welcome to LinkedList program");
            list.addToLinkedList(56);
            list.addToLinkedList(30);
            list.addToLinkedList(70);
            list.printLinkedList();
        }
    }
}
