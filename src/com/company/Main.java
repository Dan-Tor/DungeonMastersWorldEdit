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

Log (7/15/17)
- Issues with the switch, simple fix that should be done soon.
- Manually creating a user causes "Loot" to be skipped from input, this is happens regardless of order so its something to fix.
- The opposite of this is, previously adding values to the constructors will succesfully display ALL the NPCs stats. Kinda odd it skips out
during user input.


 */



public class Main {




    public static void main(String[] args) {
//This is the list
        ArrayList <NPC> npcList = new ArrayList<NPC>();
        System.out.println("Initial Size: "+npcList.size());

//This is the limit of new NPC, this needs to be changed to unlimited in the near future
        NPC[] npc = new NPC[10000];

       //Testing NPC object
       NPC npc2 = new NPC("Ashley Test", 20, "Ruby Sword", "Barbarian on the Hunt", "Barbarian", "Human", "Wildlands");
       npcList.add(npc2);



//The 3 npc testing limit is just for debuggin purposes
for (int i = 1; i <= 3 ; i++){
    Scanner input = new Scanner(System.in);
  System.out.println("\nThis is the number of loops "+ i + "\n");
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
}

        System.out.println("New Initial Size: "+npcList.size());

        npc2.DisplayStats();
        System.out.println("\n");

        System.out.println(" ***************************** ");
        System.out.println("\nCurrent Size " + npcList.size());

        System.out.print("\nAll Current NPCs: " + npcList.toString());


    }



}
