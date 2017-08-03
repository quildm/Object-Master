
public class Wizard extends Human {
//Wizard: Set default health to 50
//Wizard: Set default intelligence to 8
	
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void displayhealth() {
		showHealth();
	}
//Wizard: Add a method heal(Human) that heals the other human by the wizard's intelligence
	public void heal(Human h) {
		h.health += (this.intelligence);
	}
	
//Wizard: Add a method fireball(Human) that decreases the other human's health by the wizard's intelligence * 3
	public void fireball(Human h) {
		h.health -= (this.intelligence * 3);
	}
}
