package com.pizza.mine;

/*
 * Few franchises were using inferior ingredients to lower their costs
 * and that is why, we have to build a factory to produce those ingredients
 * But each different franchise can be at different places and therefore
 * the factory for this will be creating different types of ingredients for franchises at
 * different place
 * 
 * So an interface is required for this which will act as an Ingredient Factory
 * */

public interface PizzaIngredientFactory
{
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Peperoni createPeperoni();
	public Clams createClam();
}
