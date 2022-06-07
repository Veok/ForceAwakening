package pl.pjait;

import pl.pjait.profession.Fighter;
import pl.pjait.race.Human;
import pl.pjait.profession.Wizard;
import pl.pjait.race.Race;

public class Main {

    public static void main(String[] args) {

        System.out.println("Just human:");
        Race human = new Human();
        human.abilities().forEach(System.out::println);

        System.out.println("\nHuman after gaining fighter profession");
        human = new Fighter(human);
        human.abilities().forEach(System.out::println);

        System.out.println("\nHuman after gaining fighter and wizard profession");
        human = new Wizard(human);
        human.abilities().forEach(System.out::println);
    }
}
