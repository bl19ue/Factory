package com.pizza.mine;

public class CheesePizza extends Pizza
{
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory)
	{
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	void prepare() 
	{
		System.out.println("preparing" + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
	
}
//Similar will be for clam, with extra things