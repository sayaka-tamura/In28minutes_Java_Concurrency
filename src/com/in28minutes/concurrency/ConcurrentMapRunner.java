/**
 * @author : Sayaka Tamura
 * May 10, 2019
 * Udemy Java Concurrency
 * https://www.youtube.com/watch?v=2Bvz_jsQPHk&list=WL&index=6
 */
package com.in28minutes.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();

		String str = "ABCD ABCD ABCD";

		for (char character : str.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();

			/*
			 * // the above sentence alternates this part LongAdder longAdder =
			 * occurances.get(character);
			 * 
			 * if (longAdder == null) longAdder = new LongAdder();
			 * 
			 * longAdder.increment(); occurances.put(character, longAdder);
			 */
		}

		System.out.println(occurances); // { =2, A=3, D=3, C=3, B=3}
	}

}
