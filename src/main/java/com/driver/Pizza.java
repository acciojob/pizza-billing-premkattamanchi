package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int Cheese;
    private int toppings;
    private int total;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeAwayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheeseAdded=false;
        this.isExtraToppingsAdded=false;
        this.isTakeAwayAdded=false;
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else{
            this.price=400;
            this.toppings=120;
        }
        this.Cheese=80;
        this.total=price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            total+=Cheese;
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            total+=toppings;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            total+=20;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
            this.bill="Base Price Of The Pizza: "+this.price+"\n";
            if(isExtraCheeseAdded)
                this.bill+="Extra Cheese Added: "+this.Cheese+"\n";
            if(isExtraToppingsAdded)
                this.bill+="Extra Toppings Added: "+this.toppings+"\n";
            if(isTakeAwayAdded){
                this.bill+="Paperbag Added: "+"20"+"\n";
            }
            this.bill+="Total Price: "+total+"\n";
        return this.bill;
    }
}
