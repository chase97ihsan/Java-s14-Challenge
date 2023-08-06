package com.workintech.challange.burgers;

public class DeluxeBurger extends Hamburger {

    private String cips;
    private  String drink;

    public DeluxeBurger() {
        super("DeluxeBurger", 19.10, BreadRollType.DOUBLEBURGER);
        super.setMeat("Double");
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("Malzeme eklenemez!");
    }
}
