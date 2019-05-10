/**
 * @author : Sayaka Tamura
 * May 10, 2019
 * Udemy Java Concurrency
 * https://www.youtube.com/watch?v=2Bvz_jsQPHk&list=WL&index=6
 */
package com.in28minutes.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	// add - CopyOnWriteArrayList "copy" the array

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();

		// Threads - 3
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		// Threads - 10000
		for (String element : list) {
			System.out.println(element);
		}
	}
}
