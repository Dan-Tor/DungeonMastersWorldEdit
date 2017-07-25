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


    public void rollD6() {

        Random rand = new Random();
//Testing with a basic 6 sided dice
        int n = rand.nextInt(6) + 1;
        switch (n) {
            case 1:
                System.out.println("\n======================" +
                        "\nSword of Fury and Fire" +
                        "\n======================");
                break;
            case 2:
                System.out.println("\n======================" +
                        "\n1000 Gold" +
                        "\n======================");
                break;
            case 3:
                System.out.println("\n======================" +
                        "\nShield of Purity" +
                        "\n======================");
                break;
            case 4:
                System.out.println("\n======================" +
                        "\nNecromancer's Book of the Occult" +
                        "\n======================");
                break;
            case 5:
                System.out.println("\n======================" +
                        "\nPriestess Flask of Salvation" +
                        "\n======================");
                break;
            case 6:
                System.out.println("\n======================" +
                        "\nSmall Kit of Potions" +
                        "\n======================");
                break;

        }
    }

        public void rollD3(){
        Random rand = new Random();
        int  n = rand.nextInt(3) + 1;
        switch (n){
            case 1:
                System.out.println("\n======================" +
                        "\nRagnarok, Sword of Elemental Fury" +
                        "\n======================");
                break;
            case 2:
                System.out.println("\n======================" +
                        "\nAndromeda, Hammer of the Stars" +
                        "\n======================");
                break;
            case 3:
                System.out.println("\n======================" +
                        "\nColdera, Spear of the Frost-Lords" +
                        "\n======================");
                break;

    }


    }

    };



