package com.company;

import java.util.Scanner;

/**
 * Created by danny on 7/12/17.
 */
public class NPC {
    private String npcName; //Name, including title
    private double npcHP; //Health Points
    private String npcLoot; //What loot does it drop
    private String npcDescription; //What does this NPC do
    private String npcClass; //Hero, Boss, Villain, Henchman, Vendor, etc
    private String npcSpecies; //Goblin, Human, etc
    private String npcLOC; //What village, or plane is it in
//Empty Constructor
    public NPC(){

    }

    //Argument Constructor
    public NPC(String name, double hp, String loot, String description, String classType, String speciesType, String location){


        this.npcName = name;
        this.npcHP = hp;
        this.npcLoot = loot;
        this.npcDescription = description;
        this.npcClass = classType;
        this.npcSpecies = speciesType;
        this.npcLOC = location;
    }
//Copy Constructor
    public NPC(NPC generatedNPC){
        this.npcName = generatedNPC.npcName;
        this.npcHP = generatedNPC.npcHP;
        this.npcLoot = generatedNPC.npcLoot;
        this.npcDescription = generatedNPC.npcDescription;
        this.npcClass = generatedNPC.npcClass;
        this.npcSpecies = generatedNPC.npcSpecies;
        this.npcLOC = generatedNPC.npcLOC;
    }



//Displays all the stats
    public void DisplayStats(){
        System.out.println("NPC is called "+npcName + " the "+npcSpecies + " "+ npcClass
                + "\nHas HP of: "+ npcHP
                + "\nShort Description: " + npcDescription
                + "\nCurrent Location: " + npcLOC
                + "\nPossible Loot: " + npcLoot
        );


    }


    //Getters & Setters

    public String getNpcName() {
        return npcName;
    }

    public void setNpcName(String npcName) {
        this.npcName = npcName;
    }

    public double getNpcHP() {
        return npcHP;
    }

    public void setNpcHP(double npcHP) {
        this.npcHP = npcHP;
    }

    public String getNpcLootDrop() {
        return npcLoot;
    }

    public void setNpcLootDrop(String npcLootDrop) {
        this.npcLoot = npcLootDrop;
    }

    public String getNpcDescription() {
        return npcDescription;
    }

    public void setNpcDescription(String npcDescription) {
        this.npcDescription = npcDescription;
    }

    public String getNpcClass() {
        return npcClass;
    }

    public void setNpcClass(String npcClass) {
        this.npcClass = npcClass;
    }

    public String getNpcSpecies() {
        return npcSpecies;
    }

    public void setNpcSpecies(String npcSpecies) {
        this.npcSpecies = npcSpecies;
    }

    public String getNpcLOC() {
        return npcLOC;
    }

    public void setNpcLOC(String npcLOC) {
        this.npcLOC = npcLOC;
    }


    public void getStats(String npcName, double npcHP,String npcLootDrop,String npcDescription,String npcClass,String npcSpecies, String npcLOC  ){

        this.npcName = npcName;
        this.npcHP = npcHP;
        this.npcLoot= npcLootDrop;
        this.npcDescription = npcDescription;
        this.npcClass = npcClass;
        this.npcSpecies = npcSpecies;
        this.npcLOC = npcLOC;

    };




}

