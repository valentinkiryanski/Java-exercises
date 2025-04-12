package com.myapp;
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {

    private Map <String,Item> cartList;

    public ShoppingCart(){
        this.cartList = new HashMap<>();
    }

    public void add(String product, int price){
        for(String i : cartList.keySet()){
            if(i.equals(product)){
                cartList.get(i).increaseQuantity();
                return;
            }
        }
        cartList.put(product,new Item(product,1,price));
    }

    public int price(){
        int total = 0;
        for(String i : cartList.keySet()){
            total += cartList.get(i).price();
        }
        return total;
    }

    public void print(){
        for(String i : cartList.keySet()){
            System.out.println(i + ": " + cartList.get(i).getQty());
        }
    }


}
