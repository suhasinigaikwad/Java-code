package com.code.collection;

import java.util.LinkedList;

public class LInkedList1 {
	public static void main(String[] args) {
		// 1. Create a LinkedList
		LinkedList<String> list = new LinkedList<>();

		// 2. Add elements
		list.add("Isha");
		list.add("Vimal");
		list.add("Sachin");
		list.add("Vicky");
		list.add("Harish");
		list.add("Anandi");

		System.out.println("After adding elements: " + list);

		// 3. Add at specific position
		list.add(2, "Mogli");
		System.out.println("1. After adding at index 1: " + list);

		// 4. Add elements at first and last
		list.addFirst("Mohini");
		list.addLast("Avishkar");
		System.out.println("2. After adding first and last: " + list);

		// 5. Get elements
		System.out.println("3A. First Element: " + list.getFirst());
		System.out.println("3B. Last Element: " + list.getLast());
		System.out.println("3C. Element at index 2: " + list.get(2));

		// 6. Update element
		list.set(3, "Tushar");
		System.out.println("4. After updating index 3: " + list);

		// 7. Remove elements
		list.removeFirst();
		list.removeLast();
		list.remove("Harish");
		System.out.println("5. After removals: " + list);

		// 8. Check for element existence
		System.out.println("6A. Contains 'Isha'? " + list.contains("Isha"));
		System.out.println("6B. Contains 'Suvarna'? " + list.contains("Suvarna"));

		// 9. Get size of LinkedList
		System.out.println("7. Size of list: " + list.size());

		// 10. Iterate using for loop 
		System.out.print("8. List Elements: ");
		for (String Group1 : list) {
			System.out.print(Group1 + " ");
		}
		System.out.println();

		// 11. Clear the list
		//list.clear();
		//System.out.println("9. After clearing, is empty? " + list);

		// 12.check for empty
		System.out.println("10. After clearing, is empty? " + list.isEmpty());
	}
}
