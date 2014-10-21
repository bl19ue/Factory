/*All concrete Pizza wil derive from this abstract class*/
package com.pizza.mine;

import java.util.ArrayList;

public abstract class Pizza 
{
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	void prepare()
	{
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough");
		System.out.println("Adding sauce");
		System.out.println("Adding toppings : ");
		
		for(int i=00;i<toppings.size();i++)
			System.out.println("   " + toppings.get(i));
	}
	
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
