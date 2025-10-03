// Program to demonstrate usage of the "HAS-A" relationship
package day5.association.hasaa;

public class Exceutor {

	public static void main(String[] args) {
		Address address = new Address("405 Laxmi Enclave, Pandit Colony", "Nashik", "Maharashtra", "422003");
		Person person = new Person("Aniket Pawar", address);
		person.displayInfo();
	}
}
