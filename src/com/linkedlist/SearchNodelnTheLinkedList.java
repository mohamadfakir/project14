package com.linkedlist;

public class SearchNodelnTheLinkedList {
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

        //Search the LinkedList to find a particular node
        public void checkNode(int value)
        {
            Node current = head;
            int count = 1;
            while (current != null)
            {
                if (current.data == value)
                {
                    System.out.println("Searched key : "+value+" is present at node : "+count);
                    return;
                }
                current = current.next;
                count++;
            }
            System.out.println("Searched key is not present in the LinkedList");
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
            list.addToLinkedList(70);
            list.printLinkedList();
            System.out.println();
            list.checkNode(30);
        }
    }
}
