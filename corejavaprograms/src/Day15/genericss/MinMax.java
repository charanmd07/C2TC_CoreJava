//Program to demonstrate generic interface
package Day15.genericss;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

