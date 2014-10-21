/* This class uses factory to create different kinds of pizzas
 * and as pizza creation is in a different class, this class
 * will not be modified when the pizza creation changes
 * */

package com.pizza.mine;

//Now abstract because PizzaStore has a well defined system for orderPizza
/* and we want to ensure that this PizzaStore's method is consistent
 * across all the franchises
 * 
 * What varies is among the regional pizzas is the style of pizza they make
 * Ex. New York pizza has thin crust, Chicaco one has thick
 * 
 * Therefore, the create pizza method is made abstract too, so that other 
 * concrete pizza classes can modify the style of pizza they make
 * 	
 * */

/* 
 * As now the PizzaStore has been declared as abstract, the method orderPizza has no idea what sort
 * of pizza it will be making, this lets the subclasses of this class decide at runtime, hence loosely-coupled
 * 
 * */
public abstract class PizzaStore 
{
	
	/* Factory not required, as createPizza is made a method in PizzaStore and
	 * other classes can use it.
	public PizzaStore(SimplePizzaFactory factory)
	{
		this.factory = factory;
		
	}
	*/
	public Pizza orderPizza(String type)
	{
		Pizza pizza;
		//No more concrete instantiation, replaced with a method
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	//Making it abstract lets the subclasses decide what to do with it
	abstract Pizza createPizza(String type);//This is the factory method, as implementation of this
	//method is different for all concrete classes.
	
}
