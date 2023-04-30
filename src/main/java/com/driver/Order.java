package com.driver;

public class Order {

    private final String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        this.id=id;
        this.deliveryTime=convrt(deliveryTime);
    }
    private int convrt(String dT){
        String h="";
        String m="";
        boolean met=false;
        for(char c:dT){
            if(c==':'){
                met=true;
                continue;
            }
            if(met){
                m+=c;
            }
            else{
                h+=c;
            }
        }
        return (Integer.parseInt(h))*60+(Integer.parseInt(m));
    }
    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}