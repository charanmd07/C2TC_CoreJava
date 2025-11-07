//Program to demonstrate generic interface
package com.Charan.tnsif.day15.generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

