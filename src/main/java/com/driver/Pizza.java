package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
     protected int extraCheese=0;
     protected int extraToppings=0;
    private int paperBag=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
            this.price=300;
        else
            this.price=400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.extraCheese==0)
            extraCheese=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.extraToppings==0 && isVeg==true)
            extraToppings=70;
        else if(this.extraToppings==0 && isVeg==false)
            extraToppings=120;
    }

    public void addTakeaway(){
        // your code goes here
        if(this.paperBag==0)
            paperBag=20;
    }

    public String getBill(){
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
        if(extraCheese!=0)
            this.bill+="Extra Cheese Added: "+this.extraCheese+"\n";
        if(extraToppings!=0)
            this.bill+="Extra Toppings Added: "+this.extraToppings+"\n";
        if(paperBag!=0){
            this.bill+="Paperbag Added: "+this.paperBag+"\n";
        }
        this.bill+="Total Price: "+(this.price+this.extraCheese+this.extraToppings+this.paperBag)+"\n";
    return this.bill;
    }
}
