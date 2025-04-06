package com.myproject2;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<OrderItem> order = new ArrayList<>();
        ArrayList <ProductForSale> productsList = new ArrayList<>();

        Burger burger = new Burger("CHEESEBURGER",12,"A deliciously sliced burger combined with cheese, ham and tomatoes");
        HotDog hotdog = new HotDog("BASIC ",6,"basic hotdog with ketchup");
        Sandwitch sandwitch = new Sandwitch("AVENUE",10,"sandwitch with salami,cheese and tomatoes");

        OrderItem b = new OrderItem(2,burger);
        OrderItem h = new OrderItem (3,hotdog);
        OrderItem s = new OrderItem(1,sandwitch);

        order.add(b);
        order.add(h);


        productsList.add(burger);
        productsList.add(hotdog);
        productsList.add(sandwitch);


        addItem(order,s);




    }

    private static void manageProductsForSale(ArrayList <ProductForSale> product){
        for(ProductForSale p : product){
            p.showDetails();
        }

    }

    private static void addItem(ArrayList<OrderItem> order, OrderItem item){
        order.add(item);
        int total = 0;
        System.out.println("ORDER DETAILS:");
        for(OrderItem ot: order){
            total = total + (ot.getProduct().price * ot.getQuantity());
            System.out.printf("""
                    PRODUCT TYPE: %s
                    PRODUCT PRICE: %d
                    QUANTITY: %d
                    TOTAL: %d        
                    """,ot.getProduct().getType(),ot.getProduct().price,ot.getQuantity(),(ot.getProduct().price*ot.getQuantity()));
            System.out.println();
        }
        System.out.println("---".repeat(7));
        System.out.println("TOTAL: " + total);


    }
}
