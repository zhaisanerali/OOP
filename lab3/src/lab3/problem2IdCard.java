package lab3;

public class problem2IdCard {

	public static void main(String[] args) {
		IdentityCard person1 = new IdentityCard("Ernur Ainur", "040404506070");
		System.out.println(person1.checkValidity());
		System.out.println(person1.checkValidity(25));
		System.out.println(person1.checkValidity(2026, 2027));
		System.out.println(person1.getFullname());
		System.out.println(person1.getIDNumber());

	}

}
