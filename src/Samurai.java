public class Samurai extends Human{
	//Samurai: Set a default health of 200
	public Samurai () {
		this.health = 200;
	}
	
	public void displayhealth() {
		showHealth();
	}
	
	//Samurai: Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half
	public void deathBlow(Human h) {
		h.health = 0;
	}
	
//Samurai: Add a method meditate() that heals the Samurai for half of their current health.
	public void  meditate() {
		this.health += this.health / 2;
	}
//	Samurai: Add a method howMany() that returns the total current number of Samurai.

	
}
