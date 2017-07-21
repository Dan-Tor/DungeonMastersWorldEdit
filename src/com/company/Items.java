package com.company;

/**
 * Created by danny on 7/21/17.
 */
public class Items {

    //Items are generated for Merchants, Loot Generators, etc
    //The general idea is for DMs to keep a catalogue of potential item drops or items they can sell without having to
    //make them up on the spot or refer to their manuals.

    private String itemName;
    private String itemDescription;
    private double itemCost;



    public Items(){

    }

    public Items (String name, String descr, double cost){
        this.itemName = name;
        this.itemDescription = descr;
        this.itemCost = cost;

    }


    public Items (Items generatedItem){
        this.itemName = generatedItem.itemName;
        this.itemDescription = generatedItem.itemDescription;
        this.itemCost = generatedItem.itemCost;

    }

//Getters & Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }



    @Override
    public String toString() {
        return
                "\n===================================================="
                        +"\nItem Name: " + itemName
                        + "\nItem Description: "+ itemDescription
                        + "\nCost to Purchase: " + itemCost
                        + "\n===================================================\n";
    }

}
