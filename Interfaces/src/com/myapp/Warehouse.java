package com.myapp;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {

    private Map <String,Integer> namePriceMap;
    private Map <String, Integer> nameBalanceMap;

    public Warehouse(){
        this.namePriceMap = new HashMap<>();
        this.nameBalanceMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        namePriceMap.put(product,price);
        nameBalanceMap.put(product,stock);
    }

    public int price(String product){
        for(String p : namePriceMap.keySet()){
            if(p.equals(product)){
                return namePriceMap.get(p);
            }
            }
                return -99;
            }

    public int stock(String product){
        for(String name : nameBalanceMap.keySet()){
            if(name.equals(product)){
                return nameBalanceMap.get(name);
            }
        }
        return 0;
    }

    public boolean take(String product){
        for(String name : nameBalanceMap.keySet()){
            if(name.equals(product)){
                if(nameBalanceMap.get(product) > 0){
                    nameBalanceMap.put(product,nameBalanceMap.get(product) -1);
                    if(nameBalanceMap.get(product) < 0){
                        nameBalanceMap.put(product,0);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public Set<String> products(){
        Set<String> p = new HashSet<>();
        for(String name : namePriceMap.keySet()){
            p.add(name);
        }
        return p;
    }

        }


