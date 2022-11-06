package com.linkedlist;

public class AddANodeToNextlnLinkedList {
    public class LinkedList {

        static class Node
        {
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
        }
        Node head = null;
        Node tail = null;

        //Adding to linked list.
        public void addToLinkedList(int data)
        {
            Node newNode = new Node(data);
            if (head == null)
            {
                head = newNode;
            }
            else
            {
                tail.next = newNode;
                newNode.next = null;
            }
            tail = newNode;
        }

        //Print LinkedList
        public void printLinkedList()
        {
            Node current = head;
            while (current != null)
            {
                System.out.print(current.data+"  ");
                current = current.next;
            }
        }

        public void main(String[] args) {
            LinkedList list = new LinkedList();
            System.out.println("Welcome to LinkedList program");
            list.addToLinkedList(56);//56 is added first
            list.addToLinkedList(30);//30 is added after 56
            list.addToLinkedList(70);//70 is added after 30
            list.printLinkedList();
        }
    }
}
