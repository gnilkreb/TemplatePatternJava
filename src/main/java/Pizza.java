/**
 * 
 */

/**
 * @author Berkling
 *
 */
public abstract class Pizza {

	public Pizza(){
		makeDough();
		addSauce();
		addCheese();
		addToppings();
	}
	
	private void makeDough(){
		System.out.println("making the dough");
	}
	
	private void addSauce(){
		System.out.println("add sauce");
	}
	
	private void addCheese(){
		System.out.println("add cheese");
	}
	
	public void addToppings(){
	}
	
}
