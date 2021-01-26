package com.practice;

public class LinkedList {
	
	Node head;
	
	static class Node{
		  int data;
		  Node next;
		  Node(int data){
			  this.data = data;
			  this.next = null;
		  }
	}
	
	//insert the values in the list
	public static LinkedList insert(LinkedList list, int data) {
		
		Node new_node = new Node(data);
		if(list.head == null) {
			list.head = new_node;
		}
		else {
			Node n = list.head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = new_node;
		}
		return list;
	}
	
	//print the list
	public static void print(LinkedList list) {
		Node n = list.head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}
	
}
