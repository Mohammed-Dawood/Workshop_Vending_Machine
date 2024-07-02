package se.lexicon;

import se.lexicon.model.Drink;
import se.lexicon.model.Snack;
import se.lexicon.model.Toy;

public class App {
    public static void main(String[] args) {

        Snack snack = new Snack("123-abc", 100 , "Kex" , "Chocolate");

        Drink drink = new Drink("456-def", 200 , "Cola" , 33);

        Toy toy = new Toy("456-def", 300 , "Pistol" , 3);

        System.out.println(snack.examine());
        System.out.println(snack.use());

        System.out.println(drink.examine());
        System.out.println(drink.use());

        System.out.println(toy.examine());
        System.out.println(toy.use());
    }
}
