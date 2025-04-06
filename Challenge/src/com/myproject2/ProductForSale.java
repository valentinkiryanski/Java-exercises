package com.myproject2;

public abstract class ProductForSale {

        private String type;
        protected int price;
        protected String description;

        public ProductForSale(String type, int price, String description){
            this.type = type;
            this.price = price;
            this.description = description;
        }

        public void getSalesPrice (int quantity){
            int totalCost = price * quantity;
            System.out.printf("""
                    QUANTITY : %d
                    ITEM TYPE : %s
                    TOTAL PRICE: %d
                    """,quantity,type,totalCost);
            System.out.println("---".repeat(7));
        }

        public abstract void showDetails();

        public String getType(){
            return type;
        }

}
