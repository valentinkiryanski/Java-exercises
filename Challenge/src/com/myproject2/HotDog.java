package com.myproject2;

public class HotDog extends ProductForSale{

    public HotDog(String type, int price,String description){
        super(type,price,description);
    }

    @Override
    public void showDetails() {
        System.out.printf("""
                PRODUCT NAME: %s %s
                PRICE: %d
                DESCRIPTION: %s
                """, getClass().getSimpleName(),getType(),price,description);
        System.out.println("---".repeat(7));
    }
}
