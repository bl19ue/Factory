package com.pizza.mine;

/*
 * This class is the concrete class for NYPizzas, and provides cheese styled pizza
 * */
public class NYStyleCheesePizza extends Pizza
{
	public NYStyleCheesePizza()
	{
		name = "NY style sauce and cheese pizza";
		dough = "Thin crust dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
