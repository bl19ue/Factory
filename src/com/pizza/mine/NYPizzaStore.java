package com.pizza.mine;

public class NYPizzaStore extends PizzaStore
{

	@Override
	public Pizza createPizza(String type) 
	{
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(type.equals("cheese"))
		{
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New york stye cheese pizza");
			//Same should be for all below 
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
		return pizza;
	}
	//The orderPizza in superclass has no idea which pizza we are creating
	//It just knows it can prepare, bake, cut and box it.
}
