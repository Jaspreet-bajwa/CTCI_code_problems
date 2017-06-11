package Chapter2;

import java.util.*;

public class RemoveDups {
	
	public static void main(String args[]) {
		ListNode list = null;
		int arr[] = { 4, 2, 3, 4, 1, 3, 1, 0 ,23 };
		for (int i = 0; i < arr.length; i++) {
			list = Insert(list, arr[i]);
		}
		printElements(list);
		removeDups(list);
		System.out.println("New List:");
		printElements(list);
	}

	static ListNode Insert(ListNode head, int data) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		ListNode ListNode = new ListNode();
		ListNode.data = data;
		ListNode.next = null;

		if (head == null) {
			head = ListNode;
			return head;
		} else {
			ListNode newList = head;
			while (head.next != null) {
				head = head.next;
			}
			head.next = ListNode;
			return newList;
		}
	}

	static void printElements(ListNode list) {
		if (list == null) {
			System.out.print(list.data + " -> ");
		} else {
			while (list != null) {
				System.out.print(list.data + " -> ");
				list = list.next;
			}
		}
	}
		
	static ListNode removeDups(ListNode node){
		ArrayList<Integer> values = new ArrayList<Integer>();
		ListNode head = node;
		while(head!=null){
				if(values.contains(head.data)){
					head.data = head.next.data;
					head.next = head.next.next;
				} else {
					values.add(head.data);
					head = head.next;
				}				
			}
		return node;
	}
	
	static void removeDupsWithoutBuffer(ListNode node){
		ListNode head = node;
		while(head!=null){
			ListNode rev1 = head;
			while(rev1.next!=null){
				if(rev1.next.data==head.data){
					rev1.next = rev1.next.next;
				} else {
					rev1 = rev1.next;
				}
			}
			head = head.next;			
		}
	}
}
