public class HumanTest {

	public static void main(String[] args) {
		Human peasant = new Human();
		peasant.showHealth();
		
		Samurai jack = new Samurai();
		jack.showHealth();
		
		Wizard cranky = new Wizard();
		cranky.showHealth();
		
		Ninja ashi =  new Ninja();
		ashi.showHealth();
		
		ashi.steal(jack);
		jack.showHealth();
		

	}

}
