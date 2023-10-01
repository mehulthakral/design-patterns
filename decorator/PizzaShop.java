package decorator;

import decorator.pizza.BasePizza;
import decorator.pizza.Margherita;
import decorator.topping.ExtraCheese;
import decorator.topping.Mushroom;

public class PizzaShop {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(pizza.cost());
    }
}
