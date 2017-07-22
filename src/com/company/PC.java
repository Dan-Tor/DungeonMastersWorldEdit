package com.company;

/**
 * Created by danny on 7/21/17.
 */
public class PC {
    /*
    Last minute addition in creating Player Characters. Not sure how deep I'd want to get into this as the original intention was to
    develop this for keeping track of NPCs but I figured I might as well.
     */

    private String pcName;
    private String pcClass;
    private String pcSpecies;
    private double pcHP;
  //  private String pcBag; //Holds their items, although most likely to be a seperate object than this
  //  private String abilities; //Similar to bag, will likely be an object
  //  private String attributes;
    private int pcGold;
    private String pcDescription;
    //Seperate stats
    private int pcInt;
    private int pcChar;
    private int pcEnd;
    private int pcCon;
    private int pcStr;
    private int pcDex;


    public PC(){

    }

    public PC(String name, String pcClass, String species, String desc, double hp, int gold, int intel, int charisma, int end, int con, int str, int dex){
      this.pcName = name;
      this.pcClass = pcClass;
      this.pcSpecies = species;
      this.pcHP = hp;
      this.pcGold = gold;
      this.pcInt = intel;
      this.pcChar = charisma;
      this.pcEnd = end;
      this.pcCon = con;
      this.pcStr = str;
      this.pcDex = dex;

    }

    public PC (PC generatedPC){

        this.pcName = generatedPC.pcName;
        this.pcClass = generatedPC.pcClass;
        this.pcSpecies = generatedPC.pcSpecies;
        this.pcHP = generatedPC.pcHP;
        this.pcGold = generatedPC.pcGold;
        this.pcInt = generatedPC.pcInt;
        this.pcChar = generatedPC.pcChar;
        this.pcEnd = generatedPC.pcEnd;
        this.pcCon = generatedPC.pcCon;
        this.pcStr = generatedPC.pcStr;
        this.pcDex = generatedPC.pcDex;
    }

}
