/* This class uses factory to create different kinds of pizzas
 * and as pizza creation is in a different class, this class
 * will not be modified when the pizza creation changes
 * */

package com.pizza.mine;

public class PizzaStore 
{
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory)
	{
		this.factory = factory;
		
	}
	
	public Pizza orderPizza(String type)
	{
		Pizza pizza;
		//No more concrete instantiation, replaced with a method
		pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
