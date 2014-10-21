package com.pizza.mine;

public class ChicagoStyleCheesePizza extends Pizza
{
	public ChicagoStyleCheesePizza()
	{
		name = "Chicago style deep dish and cheese pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato Sauce";
		
		toppings.add("Shredded mozzarella Cheese");
	}
	
	//Chicago style do override the cut method
	void cut()
	{
		System.out.println("Cutting the pizza into squares");
	}
}
