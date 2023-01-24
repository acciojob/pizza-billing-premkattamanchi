package com.driver;

public class DeluxePizza extends Pizza {
     public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
         super.extraCheese=80;
         if(isVeg==true){
             super.extraToppings=70;
         }
         else
             super.extraToppings=120;
         addExtraCheese();
    }
}
