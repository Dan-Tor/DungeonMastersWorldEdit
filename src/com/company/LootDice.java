package com.company;
import java.util.Random;

/**
 * Created by danny on 7/24/17.
 */
public class LootDice {

    //this is the lootDice, seperate by faces. The user generates a dice of their choice and fills in their desired loot
    //ex user spawns a d20, a 20 slot prompt is initilized asking the user to enter the loot. Dice is saved and can then be rerolled for future occassiosn.


   private int diceFace;


   public LootDice(){

   }

   public LootDice(int side){
       this.diceFace = side;
   }

   public LootDice (LootDice aDice){
       this.diceFace = aDice.diceFace;
   }

    public int getDiceFace() {
        return diceFace;
    }

    public void setDiceFace(int diceFace) {
        this.diceFace = diceFace;
    }


    public void rollDice(){

        Random rand = new Random();
//Testing with a basic 6 sided dice
        int  n = rand.nextInt(6) + 1;
        switch (n){
            case 1:
                System.out.println("Sword of Fury and Fire");
                break;
            case 2:
                System.out.println("1000 Gold");
                break;
            case 3:
                System.out.println("Shield of Purity");
                break;
            case 4:
                System.out.println("Necromancer's Book of the Occult");
                break;
            case 5:
                System.out.println("Priestess Flask of Salvation");
                break;
            case 6:
                System.out.println("Small Kit of Potions");
                break;

        }

    };
}


