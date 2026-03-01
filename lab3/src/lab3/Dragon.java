package lab3;

import java.util.Vector;
enum Gender  {BOY, GIRL};


public class Dragon {
	
	private Vector<Person> victims = new Vector<>();
	
	public void kidnap(Person p) {
		victims.add(p);
	}
	
	
	
	public boolean willDragonEatOrNot() {
		int boysWaiting = 0;
		
		for (Person p : victims) {
			if (p.getGender() == Gender.BOY) {
				boysWaiting++;
			
			}else {
				if (boysWaiting > 0) {
					boysWaiting--;
				}
				else {
					return true;
				}
			}
			
		}
		return boysWaiting > 0;
	}
	
	
	
	public static void main(String[] args) {
		Dragon dragon = new Dragon();

        
        dragon.kidnap(new Person(Gender.BOY));
        dragon.kidnap(new Person(Gender.BOY));
        dragon.kidnap(new Person(Gender.GIRL));
        dragon.kidnap(new Person(Gender.GIRL));

        System.out.println("Will dragon eat BBGG? " + dragon.willDragonEatOrNot());

        
        Dragon dragon2 = new Dragon();
        dragon2.kidnap(new Person(Gender.GIRL));
        dragon2.kidnap(new Person(Gender.BOY));
        dragon2.kidnap(new Person(Gender.GIRL));
        dragon2.kidnap(new Person(Gender.BOY));

        System.out.println("Will dragon eat GBGB? " + dragon2.willDragonEatOrNot());
    }

	

}
