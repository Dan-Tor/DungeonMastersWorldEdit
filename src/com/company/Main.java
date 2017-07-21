package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/*
                             __             __   ___  __                      __  ___  ___  __  .  __
                            |  \ |  | |\ | / _` |__  /  \ |\ |     |\/|  /\  /__`  |  |__  |__) ' /__`
                            |__/ \__/ | \| \__> |___ \__/ | \|     |  | /~~\ .__/  |  |___ |  \   .__/

                                              __   __        __      ___  __    ___
                                        |  | /  \ |__) |    |  \    |__  |  \ |  |
                                        |/\| \__/ |  \ |___ |__/    |___ |__/ |  |


                                                               ______
                                                            .-"      "-.
                                                           /            \
                                               _          |              |          _
                                              ( \         |,  .-.  .-.  ,|         / )
                                               > "=._     | )(__/  \__)( |     _.=" <
                                              (_/"=._"=._ |/     /\     \| _.="_.="\_)
                                                     "=._ (_     ^^     _)"_.="
                                                         "=\__|IIIIII|__/="
                                                        _.="| \IIIIII/ |"=._
                                              _     _.="_.="\          /"=._"=._     _
                                             ( \_.="_.="     `--------`     "=._"=._/ )
                                              > _.="                            "=._ <
                                             (_/                                    \_)




                                                  created by: Daniel Torres 7/15/17

Dungeon Master's World Edit (DMWE) is intended to help fellow DM's managed games of D&D (or any game they please)
The idea behind it is to keep track of NPC's and generate random events for the players playing.
Nowhere near finished but some tasks I have in mind to implement are:

    - Creating NPC's
    - Editing NPC's
    - Deleting NPC's
    - Implementing a Vector List to hold NPC's
    - Displaying NPC's
    - Randomly Generate NPC's
    - Being able to read NPC's from a .txt and also save existing NPC's to a .txt
    - GUI to facilitate users
    - A simple economic model to simulate in-game economy for players
    - A simple generator of events, from quests to just random events.

Log (7/19/17)
- Issues with the switch, simple fix that should be done soon.
- Can now generate multiple NPC's on command and add to array. PROGRESS!


 */



public class Main {


    static int i = 1;

    static ArrayList<NPC> npcList = new ArrayList<NPC>();
    static NPC[] npc = new NPC[10000];

    static public void newNPC() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nThis is the number of loops " + i + "\n");
        npc[i] = new NPC();
        System.out.println("Get NPC Name");
        String npcName = input.nextLine();
        npc[i].setNpcName(npcName);


        System.out.println("NPC Loot Table");
        String npcLoot = input.nextLine();
        npc[i].setNpcLootDrop(npcLoot);

        System.out.println("Get NPC Description");
        String npcDescription = input.nextLine();
        npc[i].setNpcDescription(npcDescription);

        System.out.println("Get NPC Class");
        String npcClass = input.nextLine();
        npc[i].setNpcClass(npcClass);

        System.out.println("Get NPC Species");
        String npcSpecies = input.nextLine();
        npc[i].setNpcSpecies(npcSpecies);

        System.out.println("Get NPC Location");
        String npcLocation = input.nextLine();
        npc[i].setNpcLOC(npcLocation);

        System.out.println("Get NPC HP");
        double npcHP = input.nextDouble();
        npc[i].setNpcHP(npcHP);

        npcList.add(npc[i]);
        i++;

    }


    //This is the test block for items
    static int y = 1;
    static ArrayList<Items> itemCatalogue = new ArrayList<Items>();
    static Items[] item = new Items[10000];

    static public void newItem() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nThis is the number of loops " + y + "\n");

        item[y] = new Items();

        System.out.println("Add Item Name: ");
        String itemName = input.nextLine();
        item[y].setItemName(itemName);

        System.out.println("Add Item Description: ");
        String itemDescription = input.nextLine();

        item[y].setItemDescription(itemDescription);
        System.out.println("Add Item Cost: ");
        double itemCost = input.nextDouble();

        item[y].setItemCost(itemCost);
        itemCatalogue.add(item[y]);
        y++;

    }


    public static void main(String[] args) {
//This is the list

        System.out.println("Initial Size: " + npcList.size());

//This is the limit of new NPC, this needs to be changed to unlimited in the near future


        //Testing NPC object
        NPC npc2 = new NPC("Ashley Test", 20, "Ruby Sword", "Barbarian on the Hunt", "Barbarian", "Human", "Wildlands");
        npcList.add(npc2);

//This is a reworked switch statement that is finally looping properly

        int option;
        Scanner in = new Scanner(System.in);
        do {
            do {
                String menu = "\n Please select an option to perform"
                        + "\n(1) Make a new NPC."
                        + "\n(2) Display all NPC."
                        + "\n(3) Display list size"
                        + "\n(4) Make a new Item"
                        + "\n(5) Display Item Catalogue"
                        + "\n(6) Exit Program";
                System.out.println(menu);
                option = in.nextInt();
            }
            while (option < 0 || option > 6); // This will make the menu repeat if option is higher than 6 or lowen than 0.

            switch (option) {
                case 1:
                    System.out.println("Make a New NPC");
                    newNPC();

                    break;
                case 2:
                    System.out.println("Display all NPC");
                    System.out.print("\nAll Current NPCs: " + npcList.toString());
                    break;
                case 3:
                    System.out.println("Display current npc list size");
                    System.out.println("\nCurrent Size " + npcList.size());
                    break;
                case 4:
                    System.out.println("Add Item");
                    newItem();
                    break;
                case 5:
                    System.out.println("Display All items");
                    System.out.println("\nCurrent Catalogue Size: " + itemCatalogue.size());
                    System.out.println("\nAll current items: " + itemCatalogue.toString());
                default:
                    System.out.println("Exit");
                    break;
            }
        } while (option != 0);


    }
}