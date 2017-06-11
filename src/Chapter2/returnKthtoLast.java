package Chapter2;

public class returnKthtoLast {
	
	public static void main(String args[]) {
		ListNode list = null;
		int arr[] = { 4, 2, 3, 4, 1, 3, 1, 0 ,23 };
		for (int i = 0; i < arr.length; i++) {
			list = Insert(list, arr[i]);
		}
		printElements(list);
		removeElements(list,6);
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
	
	static ListNode removeElements(ListNode node, int k) {
		int length = 0;
		ListNode curr = node;
		if (node == null) {
			return node;
		} else {
			while (curr != null) {
				length++;
				curr = curr.next;
			}
			int pos = length - k;
			ListNode res = node;
			int i = 0;
			while (res != null && i < pos-1) {
				res = res.next;
				i++;
			}
			res.next = res.next.next;
		}
		return node;
	}
}
