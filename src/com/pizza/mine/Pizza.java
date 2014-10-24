/*All concrete Pizza wil derive from this abstract class*/
package com.pizza.mine;

import java.util.ArrayList;

public abstract class Pizza 
{
	String name;
	String dough;
	String sauce;
	String cheese;
	ArrayList toppings = new ArrayList();
	
	//As the preparing part for every kind of pizza will be different, therefore we will make the prepare method abstract
	abstract void prepare();
	//Now they will use right ingredients
	//As we have different cheese classes for NY and Chicago, the only thing that changes is use of regional ingredients
	//rest of the things like dough, sauce, cheese doesn't change.

	//So we don't need NYStyleCheese, and ChicagoStyleCheese, we just need one as added
	void bake()
	{
		System.out.println("Baking for 35 mins at 250");
	}
	void cut()
	{
		System.out.println("Cutting in 10 pieces");
	}
	void box()
	{
		System.out.println("Place pizza in official box");
	}
	public String getName()
	{
		return name;
	}
}
