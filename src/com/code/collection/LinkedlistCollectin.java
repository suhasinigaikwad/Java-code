package com.code.collection;



	import java.util.LinkedList;
	import java.util.Arrays;
	import java.util.Spliterator;

	public class LinkedlistCollectin {
	    public static void main(String[] args) {
	        // Initialize the LinkedList
	        LinkedList<String> list = new LinkedList<>();

	        // Add elements to the list
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");
	        list.add("Elderberry");

	        // Display the initial list
	        System.out.println("Initial list: " + list);

	        // peek() - Retrieve, but do not remove, the head (first element) of the list
	        System.out.println("peek(): " + list.peek());

	        // peekFirst() - Retrieve, but do not remove, the first element of the list
	        System.out.println("peekFirst(): " + list.peekFirst());

	        // peekLast() - Retrieve, but do not remove, the last element of the list
	        System.out.println("peekLast(): " + list.peekLast());

	        // poll() - Retrieve and remove the head (first element) of the list
	        System.out.println("poll(): " + list.poll());
	        System.out.println("List after poll(): " + list);

	        // pollFirst() - Retrieve and remove the first element of the list
	        System.out.println("pollFirst(): " + list.pollFirst());
	        System.out.println("List after pollFirst(): " + list);

	        // pollLast() - Retrieve and remove the last element of the list
	        System.out.println("pollLast(): " + list.pollLast());
	        System.out.println("List after pollLast(): " + list);

	        // push(E e) - Push an element onto the stack represented by this list
	        list.push("Fig");
	        System.out.println("List after push(\"Fig\"): " + list);

	        // pop() - Pop an element from the stack represented by this list
	        System.out.println("pop(): " + list.pop());
	        System.out.println("List after pop(): " + list);

	        // remove() - Retrieve and remove the head (first element) of the list
	        System.out.println("remove(): " + list.remove());
	        System.out.println("List after remove(): " + list);

	        // remove(int index) - Remove the element at the specified position in the list
	        list.add("Grape");
	        System.out.println("List before remove(1): " + list);
	        list.remove(1);
	        System.out.println("List after remove(1): " + list);

	        // remove(Object o) - Remove the first occurrence of the specified element
	        list.add("Honeydew");
	        System.out.println("List before remove(\"Honeydew\"): " + list);
	        list.remove("Honeydew");
	        System.out.println("List after remove(\"Honeydew\"): " + list);

	        // removeFirst() - Remove and return the first element from the list
	        System.out.println("removeFirst(): " + list.removeFirst());
	        System.out.println("List after removeFirst(): " + list);

	        // removeFirstOccurrence(Object o) - Remove the first occurrence of the specified element
	        list.add("Apple");
	        list.add("Apple");
	        System.out.println("List before removeFirstOccurrence(\"Apple\"): " + list);
	        list.removeFirstOccurrence("Apple");
	        System.out.println("List after removeFirstOccurrence(\"Apple\"): " + list);

	        // removeLast() - Remove and return the last element from the list
	        System.out.println("removeLast(): " + list.removeLast());
	        System.out.println("List after removeLast(): " + list);

	        // removeLastOccurrence(Object o) - Remove the last occurrence of the specified element
	        list.add("Banana");
	        list.add("Banana");
	        System.out.println("List before removeLastOccurrence(\"Banana\"): " + list);
	        list.removeLastOccurrence("Banana");
	        System.out.println("List after removeLastOccurrence(\"Banana\"): " + list);

	        // set(int index, E element) - Replace the element at the specified position
	        list.set(0, "Kiwi");
	        System.out.println("List after set(0, \"Kiwi\"): " + list);

	        // size() - Return the number of elements in the list
	        System.out.println("size(): " + list.size());

	        // spliterator() - Create a Spliterator over the elements in the list
	        Spliterator<String> spliterator = list.spliterator();
	        System.out.println("Spliterator characteristics: " + spliterator.characteristics());

	        // toArray() - Return an array containing all elements in the list
	        Object[] array = list.toArray();
	        System.out.println("toArray(): " + Arrays.toString(array));

	        // toArray(T[] a) - Return an array containing all elements in the list; the runtime type of the returned array is that of the specified array
	        String[] array2 = list.toArray(new String[0]);
	        System.out.println("toArray(new String[0]): " + Arrays.toString(array2));

	        // toString() - Return a string containing all elements in the list
	        System.out.println("toString(): " + list.toString());
	    }
	}

