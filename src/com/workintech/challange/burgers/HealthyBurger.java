package com.workintech.challange.burgers;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, price, breadRollType);
        super.setMeat("Tofu");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
    @Override
    public double itemizeHamburger() {
        String vegan=super.itemize();
        StringBuilder stringBuilder = new StringBuilder();


        if (healthyExtra1Name != null) {
            stringBuilder.append("healthyExtra1Name: " + healthyExtra1Name + "\n"
            );

        }
        if (healthyExtra2Name != null) {
            stringBuilder.append("Addiction2: " + healthyExtra2Name + "\n"
            );
        }
        double total = super.getPrice() + healthyExtra1Price + healthyExtra2Price;
        stringBuilder.append("TotalPrice: " + total);
        System.out.println(vegan+stringBuilder.toString());
        return total;

    }
}
