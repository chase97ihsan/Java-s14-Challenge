package com.workintech.challange.burgers;

public  class Hamburger {

    private String name;
    private  String meat;
    private  double price;
    private  BreadRollType breadRollType;
   private  Addition addition1;
    private  Addition addition2;
    private  Addition addition3;
    private  Addition addition4;

    public Hamburger(String name,  double price, BreadRollType breadRollType) {
        this.name = name;
        this.meat ="Normal";
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addAddition(String name,double price){
        if(addition1==null){
            addition1=new Addition( name, price);
        } else if (addition2==null) {
            addition2=new Addition(name,price);
        } else if (addition3==null) {
            addition3=new Addition(name,price);
        } else if (addition4==null) {
            addition4=new Addition(name,price);
        }
    }
    public String itemize(){

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Name: "+name+"\n");
        stringBuilder.append("Meat: "+meat+"\n");
        stringBuilder.append("BreadRollType: "+breadRollType+"\n");

        if(addition1!=null){
            stringBuilder.append("Addiction1: "+addition1.getAdditionName()+"\n"
            );
            price=price+addition1.getAdditionPrice();
        }
        if(addition2!=null){
            stringBuilder.append("Addiction2: "+addition2.getAdditionName()+"\n"
            );
            price=price+addition2.getAdditionPrice();
        }
        if(addition3!=null){
            stringBuilder.append("Addiction3: "+addition3.getAdditionName()+"\n"
            );
            price=price+addition3.getAdditionPrice();
        }
        if(addition4!=null){
            stringBuilder.append("Addiction4: "+addition4.getAdditionName()+"\n"
            );
            price=price+addition4.getAdditionPrice();
        }
        return stringBuilder.toString();

    }
    public double itemizeHamburger(){
        System.out.println(itemize()+"Price: "+price);
        return price;
    }

    public double getPrice() {
        return price;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
