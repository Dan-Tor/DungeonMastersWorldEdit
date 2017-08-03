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
                System.out.println("\n========= " + n + " =============" +
                        "\nSword of Fury and Fire" +
                        "\n======================");
                break;
            case 2:
                System.out.println("\n========= " + n + " =============" +
                        "\n1000 Gold" +
                        "\n======================");
                break;
            case 3:
                System.out.println("\n========= " + n + " =============" +
                        "\nShield of Purity" +
                        "\n======================");
                break;
            case 4:
                System.out.println("\n========= " + n + " =============" +
                        "\nNecromancer's Book of the Occult" +
                        "\n======================");
                break;
            case 5:
                System.out.println("\n========= " + n + " =============" +
                        "\nPriestess Flask of Salvation" +
                        "\n======================");
                break;
            case 6:
                System.out.println("\n========= " + n + " =============" +
                        "\nSmall Kit of Potions" +
                        "\n======================");
                break;

        }
    }

        public void rollD4() {
            Random rand = new Random();
            int n = rand.nextInt(4) + 1;
            switch (n) {
                case 1:
                    System.out.println("\n========= " + n + " =============" +
                            "\nRagnarok, Sword of Elemental Fury" +
                            "\n======================");
                    break;
                case 2:
                    System.out.println("\n========= " + n + " =============" +
                            "\nAndromeda, Hammer of the Stars" +
                            "\n======================");
                    break;
                case 3:
                    System.out.println("\n========= " + n + " =============" +
                            "\nColdera, Spear of the Frost-Lords" +
                            "\n======================");
                    break;
                case 4:
                    System.out.println("\n========= " + n + " =============" +
                            "\nTwilight Blade of Athomir" +
                            "\n======================");
                    break;

            }
        }

    public void rollD10() {
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;
        switch (n) {
            case 1:
                System.out.println("\n========= " + n + " =============" +
                        "\nRagnarok, Sword of Elemental Fury" +
                        "\n======================");
                break;
            case 2:
                System.out.println("\n========= " + n + " =============" +
                        "\nAndromeda, Hammer of the Stars" +
                        "\n======================");
                break;
            case 3:
                System.out.println("\n========= " + n + " =============" +
                        "\nColdera, Spear of the Frost-Lords" +
                        "\n======================");
                break;
            case 4:
                System.out.println("\n========= " + n + " =============" +
                        "\nTwilight Blade of Athomir" +
                        "\n======================");
                break;
            case 5:
                System.out.println("\n========= " + n + " =============" +
                        "\nSun Shard Staff" +
                        "\n======================");
                break;
            case 6:
                System.out.println("\n========= " + n + " =============" +
                        "\nFlask of Invisibility" +
                        "\n======================");
                break;
            case 7:
                System.out.println("\n========= " + n + " =============" +
                        "\nStorm Stomper Boots" +
                        "\n======================");
                break;
            case 8:
                System.out.println("\n========= " + n + " =============" +
                        "\nGauntlet of SpellCasting" +
                        "\n======================");
                break;
            case 9:
                System.out.println("\n========= " + n + " =============" +
                        "\nWarcaster Spell-Scythe" +
                        "\n======================");
                break;
            case 10:
                System.out.println("\n========= " + n + " =============" +
                        "\nCape of Starstuff" +
                        "\n======================");
                break;
        }
    }

    public void rollD100(){
        Random rand = new Random();
        int  n = rand.nextInt(100) + 1;

        System.out.println("\n//// "+ n +" ////");
    }


    public void rollD20(){
        Random rand = new Random();
        int  n = rand.nextInt(20) + 1;
        switch (n){
            case 1:
                System.out.println("\n========= " + n + " =============" +
                        "\n100 Gold" +
                        "\n======================");
                break;
            case 2:
                System.out.println("\n========= " + n + " =============" +
                        "\n1000 Gold" +
                        "\n======================");
                break;
            case 3:
                System.out.println("\n========= " + n + " =============" +
                        "\nStaff of Unrelenting Fury" +
                        "\n======================");
                break;
            case 4:
                System.out.println("\n========= " + n + " =============" +
                        "\nDread-Lords Helmet of Fear" +
                        "\n======================");
                break;
            case 5:
                System.out.println("\n========= " + n + " =============" +
                        "\nWarlock's Scepter of Disarray" +
                        "\n======================");
                break;
            case 6:
                System.out.println("\n========= " + n + " =============" +
                        "\nPriestess Holy Book of Healing" +
                        "\n======================");
                break;
            case 7:
                System.out.println("\n========= " + n + " =============" +
                        "\nWarlords Fur Coat of Cold Winters" +
                        "\n======================");
                break;
            case 8:
                System.out.println("\n========= " + n + " =============" +
                        "\nStone Hatchet of Barbaric Fury" +
                        "\n======================");
                break;
            case 9:
                System.out.println("\n========= " + n + " =============" +
                        "\nScholars Tome of Spells" +
                        "\n======================");
                break;
            case 10:
                System.out.println("\n========= " + n + " =============" +
                        "\nLarge Kit of Potions" +
                        "\n======================");
                break;
            case 11:
                System.out.println("\n========= " + n + " =============" +
                        "\nEnchanted Boots of Jumping" +
                        "\n======================");
                break;
            case 12:
                System.out.println("\n========= " + n + " =============" +
                        "\nNecklace of Leaves" +
                        "\n======================");
                break;
            case 13:
                System.out.println("\n========= " + n + " =============" +
                        "\nElite Ranger's Bow" +
                        "\n======================");
                break;
            case 14:
                System.out.println("\n========= " + n + " =============" +
                        "\nBrute Spike-Shield" +
                        "\n======================");
                break;
            case 15:
                System.out.println("\n========= " + n + " =============" +
                        "\nGladiator's Chestpiece of Combat" +
                        "\n======================");
                break;
            case 16:
                System.out.println("\n========= " + n + " =============" +
                        "\nPoisonous Machete" +
                        "\n======================");
                break;
            case 17:
                System.out.println("\n========= " + n + " =============" +
                        "\nAssassin's Dagger" +
                        "\n======================");
                break;
            case 18:
                System.out.println("\n========= " + n + " =============" +
                        "\nGauntlet of Might" +
                        "\n======================");
                break;
            case 19:
                System.out.println("\n========= " + n + " =============" +
                        "\nFancy Pants of Fancydom" +
                        "\n======================");
                break;
            case 20:
                System.out.println("\n========= " + n + " =============" +
                        "\nCrime-Lords Hold Out Dagger" +
                        "\n======================");
                break;


        }

    }



    };



