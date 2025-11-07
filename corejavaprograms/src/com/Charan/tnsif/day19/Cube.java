//Program to demonstrate Functional Interface

package com.Charan.tnsif.day19;

@FunctionalInterface
interface Cube {
	int calculate(int a); // only one abstract method
	//int sqr(int n);
}