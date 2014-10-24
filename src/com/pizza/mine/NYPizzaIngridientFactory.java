package com.pizza.mine;

/*
 * This is NY ingredient factory which implemets all the methods in the factory
 * */

public class NYPizzaIngridientFactory implements PizzaIngredientFactory
{

	@Override
	public Dough createDough() 
	{
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() 
	{
		return new MarianaSauce();
	}

	@Override
	public Cheese createCheese() 
	{
		return new ReggianCheese();
	}

	@Override
	public Veggies[] createVeggies() 
	{
		Veggoes veggies[] = {new Garlic(), new Mushroom(), new RedPepper()};
		return Veggies;
	}

	@Override
	public Peperoni createPeperoni() 
	{
		return new SlicedPeperoni();
	}

	@Override
	public Clams createClam() 
	{
		return new FreshClams();
	}

}
