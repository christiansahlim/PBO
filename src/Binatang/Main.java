/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binatang;

import java.util.*;

/**
 *
 * @author Chris
 */
public class Main {

    static void main() {
        Duck DataDuck = new Duck("Donald", "Cacing", 2, 1, "Female");
        DataDuck.printData();
        Dog DataDog = new Dog("Scooby", "Dog food", 2, 0, "Male");
        DataDog.printData();
        Cat DataCat = new Cat("Kitty", "Whiskas", 2, 1, "Female");
        DataCat.printData();
        Horse DataHorse = new Horse("Shaun", "rumput", 5, 1, "Male");
        DataHorse.printData();

        System.out.println(DataDuck.printData());
        System.out.println(DataDog.printData());
        System.out.println(DataHorse.printData());
        System.out.println(DataCat.printData());
    }

    public static void main(String[] args) {
        main();
    }
}
