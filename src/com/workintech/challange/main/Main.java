package com.workintech.challange.main;

import com.workintech.challange.burgers.BreadRollType;
import com.workintech.challange.burgers.DeluxeBurger;
import com.workintech.challange.burgers.HealthyBurger;
import com.workintech.challange.burgers.Hamburger;


public class Main {
    public static void main(String[] args) {
        examples();
    }

    public static void examples() {
        Hamburger hamburger = new Hamburger("Basic", 3.56, BreadRollType.WRAP);

        hamburger.addAddition("Tomato", 0.27);

        hamburger.addAddition("Lettuce", 0.75);

        hamburger.addAddition("Cheese", 1.13);

        hamburger.itemizeHamburger();
        System.out.println("----------------------------------");

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, BreadRollType.SANDWICH);

        healthyBurger.addAddition("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        healthyBurger.itemizeHamburger();
        System.out.println("---------------------------------------");

        DeluxeBurger db = new DeluxeBurger();

        db.addAddition("Should not do this", 50.53);

        db.itemizeHamburger();


    }
}