package com.linkedlist;

public class RemoveLastElementFromLinkedList {
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

        //Add the node in the middle.
        public void addAfterParticularNode(int value)
        {
            Node current = head;
            while (current != null)
            {
                if (!(current.data == 56))
                {
                    current = current.next;
                }
                else if (current.data == 56)
                {
                    break;
                }
            }
            Node newNode = new Node(value);
            Node temp = current.next;
            current.next = newNode;
            newNode.next = temp;
        }

        //Delete the last element in the linked list
        public void popLast()
        {
            if (head == null)
            {
                System.out.println("List is empty");
            }
            else
            {
                if (head != tail)
                {
                    Node current = head;
                    while (current.next.next != null)
                    {
                        current = current.next;
                    }
                    tail = current;
                    tail.next = null;
                }
                else
                {
                    head = tail = null;
                }
            }
        }

        //Print LinkedList
        public void printLinkedList()
        {
            Node current = head;
            if (head == null)
            {
                System.out.println("LinkedList is empty");
                return;
            }
            while (current != null)
            {
                System.out.print(current.data+"  ");
                current = current.next;
            }
        }

        public void main(String[] args) {
            LinkedList list = new LinkedList();
            System.out.println("Welcome to LinkedList program");
            list.addToLinkedList(56);
            list.addToLinkedList(70);
            list.addAfterParticularNode(30);
            System.out.println("Original Linked List");
            list.printLinkedList();
            list.popLast();
            System.out.println();
            System.out.println("After removing last element from Linked List");
            list.printLinkedList();
        }
    }
}
