package com.pizza.mine;

public class ChicagoPizzaStore extends PizzaStore
{
	@Override
	public Pizza createPizza(String type) 
	{
		if(type.equals("cheese"))
		{
			return new ChicagoStyleCheesePizza();
		}
		else if(type.equals("peperoni"))
		{
			//return new ChicagoStylePeperoniPizza();
		}
		else if(type.equals("clam"))
		{
			//return new ChicagoStyleClamPizza();
		}
		else if(type.equals("veggie"))
		{
			//return new ChicagoStyleVeggiePizza();
		}
		return null;
	}
	//The orderPizza in superclass has no idea which pizza we are creating
	//It just knows it can prepare, bake, cut and box it.
}
