package com.linkedlist;

public class SortTheLInkedList {
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
        static int position;

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

        //Sorting the linked list
        public void sortTheLinkedList()
        {
            Node current = head, index = null;
            int temp;
            while (current != null)
            {
                if(head == null)
                {
                    return;
                }
                else
                {
                    index = current.next;
                    while (index != null)
                    {
                        if (current.data > index.data)
                        {
                            temp = current.data;
                            current.data = index.data;
                            index.data = temp;
                        }
                        index = index.next;
                    }
                    current = current.next;
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
            list.addToLinkedList(30);
            list.addToLinkedList(40);
            list.addToLinkedList(70);
            System.out.println("Before sorting the LinkedList");
            list.printLinkedList();
            list.sortTheLinkedList();
            System.out.println();
            System.out.println("After sorting the LinkedList");
            list.printLinkedList();

        }
    }
}
