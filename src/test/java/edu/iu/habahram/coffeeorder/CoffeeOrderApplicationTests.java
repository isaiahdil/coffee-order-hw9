package edu.iu.habahram.coffeeorder;

import edu.iu.habahram.coffeeorder.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CoffeeOrderApplicationTests {

	@Test
	void test1() {
		// Test each beverage and condiment decorator
		Decaf decaf = new Decaf();
		assert(decaf.cost() == 1.05F);
		assert(decaf.getDescription().equals("Decaf"));

	}
	@Test
	void test2() {
		// Test each beverage and condiment decorator
		DarkRoast darkRoast = new DarkRoast();
		assert(darkRoast.cost() == 1.99F);
		assert(darkRoast.getDescription().equals("Dark roast"));
	}
	@Test
	void test3() {
		// Test each beverage and condiment decorator
		Espresso espresso = new Espresso();
		assert(espresso.cost() == 2.99F);
		assert(espresso.getDescription().equals("Espresso"));
	}
	@Test
	void test4(){
		HouseBlend houseBlend = new HouseBlend();
		assert(houseBlend.cost() == 0.89F);
		assert(houseBlend.getDescription().equals("House blend"));
	}
	@Test
	void test5(){
		Mocha mocha = new Mocha(new Espresso());
		assert(mocha.cost() == 3.29F);
		assert(mocha.getDescription().equals("Espresso, Mocha"));
	}
	@Test
	void test6(){
		Mocha mocha = new Mocha(new DarkRoast());
		assert(mocha.cost() == 2.29F);
		assert(mocha.getDescription().equals("Dark roast, Mocha"));
	}
	@Test
	void test7(){
		Mocha mocha = new Mocha(new Decaf());
		assertEquals(mocha.cost(), 1.3499999F);
		assert(mocha.getDescription().equals("Decaf, Mocha"));
	}
	@Test
	void test8(){
		Mocha mocha = new Mocha(new HouseBlend());
		assert(mocha.cost() == 1.19F);
		assert(mocha.getDescription().equals("House blend, Mocha"));
	}
	@Test
	void test9(){
		Milk milk = new Milk(new Espresso());
		assert(milk.cost() == 3.39F);
		assert(milk.getDescription().equals("Espresso, Milk"));
	}
	@Test
	void test10(){
		Milk milk = new Milk(new DarkRoast());
		assert(milk.cost() == 2.39F);
		assert(milk.getDescription().equals("Dark roast, Milk"));
	}
	@Test
	void test11(){
		Milk milk = new Milk(new Decaf());
		assertEquals(milk.cost(), 1.4499999F);
		assert(milk.getDescription().equals("Decaf, Milk"));
	}
	@Test
	void test12(){
		Milk milk = new Milk(new HouseBlend());
		assert(milk.cost() == 1.29F);
		assert(milk.getDescription().equals("House blend, Milk"));
	}
	@Test
	void test13(){
		Mocha mocha = new Mocha(new Espresso());
		Milk milk = new Milk(mocha);
		assert(milk.cost() == 3.69F);
		assert(milk.getDescription().equals("Espresso, Mocha, Milk"));
	}
	@Test
	void test14(){
		Mocha mocha = new Mocha(new DarkRoast());
		Milk milk = new Milk(mocha);
		assert(milk.cost() == 2.69F);
		assert(milk.getDescription().equals("Dark roast, Mocha, Milk"));
	}
	@Test
	void test15(){
		Mocha mocha = new Mocha(new Decaf());
		Milk milk = new Milk(mocha);
		assertEquals(milk.cost(),1.7499999F);
		assert(milk.getDescription().equals("Decaf, Mocha, Milk"));
	}
	@Test
	void test16(){
		Mocha mocha = new Mocha(new HouseBlend());
		Milk milk = new Milk(mocha);
		assertEquals(milk.cost(),1.59F);
		assert(milk.getDescription().equals("House blend, Mocha, Milk"));
	}

}
