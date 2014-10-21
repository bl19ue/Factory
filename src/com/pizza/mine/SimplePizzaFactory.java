/* This class acts like a factory for all kinds of pizzas
 * Which means we took out all the code that can change in future
 * */

package com.pizza.mine;


public class SimplePizzaFactory 
{
	public Pizza createPizza(String type)
	{
		Pizza pizza = null;
		if(type.equals("cheese"))
		{
			pizza = new CheesePizza();
		}
		else if(type.equals("peperoni"))
		{
			pizza = new PeperoniPizza();
		}
		else if(type.equals("clam"))
		{
			pizza = new ClamPizza();
		}
		else if(type.equals("veggie"))
		{
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
