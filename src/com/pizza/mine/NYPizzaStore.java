package com.pizza.mine;

public class NYPizzaStore extends PizzaStore
{

	@Override
	public Pizza createPizza(String type) 
	{
		if(type.equals("cheese"))
		{
			return new NYStyleCheesePizza();
		}
		else if(type.equals("peperoni"))
		{
			//return new NYStylePeperoniPizza();
		}
		else if(type.equals("clam"))
		{
			//return new NYStyleClamPizza();
		}
		else if(type.equals("veggie"))
		{
			//return new NYStyleVeggiePizza();
		}
		return null;
	}
	//The orderPizza in superclass has no idea which pizza we are creating
	//It just knows it can prepare, bake, cut and box it.
}
