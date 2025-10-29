//Program to define generic functional interface Palindrome

package Day19.vv1;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
