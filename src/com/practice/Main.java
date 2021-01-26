package com.practice;

import com.practice.LinkedList.Node;

public class Main {
	
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		LinkedList.insert(l1, 1);
		LinkedList.insert(l1, 3);
		LinkedList.insert(l1, 5);
		
		System.out.println("List1: ");
		LinkedList.print(l1);
		
		LinkedList l2 = new LinkedList();	
		LinkedList.insert(l2, 2);
		LinkedList.insert(l2, 4);
		LinkedList.insert(l2, 6);
		LinkedList.insert(l2, 7);

		
		System.out.println("List2: ");
		LinkedList.print(l2);
		
		//calling this function to merge two sorted list
		merge(l1,l2);
	}
	public static void merge(LinkedList l1, LinkedList l2) {
		
		LinkedList l3 = new LinkedList();
		Node n1 = l1.head;
		Node n2 = l2.head;
		Node n3 = null;
		
		while(n1!=null && n2!=null) {
			
			//Comparing values of List1 & List2 and storing them in the New List i.e. l3
			
			if(n1.data < n2.data) {
				Node new_node = new Node(n1.data);
				if(l3.head == null) {
					l3.head = new_node;
					n1 = n1.next;
					n3 = l3.head;
				}
				else {
					n3.next = new_node;
					n3 = n3.next;
					n1 = n1.next;
				}
			}
			else {
				Node new_node = new Node(n2.data);
				if(l3.head == null) {
					l3.head = new_node;
					n2 = n2.next;
					n3 = l3.head;
				}
				else {
					n3.next = new_node;
					n3 = n3.next;
					n2 = n2.next;
				}
			}			
		}
		
		//Adding the leftover values of the list which can't be compared as
		//one list is completed in the above loop
		
		if(n1!=null) {
			while(n1!=null) {
				Node new_Node = new Node(n1.data);
				n3.next = new_Node;
				n3 = n3.next;
				n1 = n1.next;
			}
		}
		
		if(n2!=null) {
			while(n2!=null) {
				Node new_Node = new Node(n2.data);
				n3.next = new_Node;
				n3 = n3.next;
				n2 = n2.next;
			}
		}
		
		//Printing the Merge List
		System.out.println("Merged List: ");
		LinkedList.print(l3);
	}

}
