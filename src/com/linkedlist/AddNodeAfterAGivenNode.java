package com.linkedlist;

public class AddNodeAfterAGivenNode {
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
            } else {
                tail.next = newNode;
                newNode.next = null;
            }
            tail = newNode;
        }

        //Add the node in the middle.
        public void addAfterParticularNode(int value) {
            Node current = head;
            while (current != null) {
                if (!(current.data == 56)) {
                    current = current.next;
                } else if (current.data == 56) {
                    break;
                }
            }
            Node newNode = new Node(value);
            Node temp = current.next;
            current.next = newNode;
            newNode.next = temp;
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
            list.addToLinkedList(56);//56 is added first
            list.addToLinkedList(70);
            list.printLinkedList();
            list.addAfterParticularNode(30);
            System.out.println();
            list.printLinkedList();
        }
    }
}
