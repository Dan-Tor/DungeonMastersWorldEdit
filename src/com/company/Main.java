package com.company;
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





       //Testing NPC object
       NPC npc1 = new NPC();
       NPC npc2 = new NPC("Ashley Test", 20, "Ruby Sword", "Barbarian on the Hunt", "Barbarian", "Human", "Wildlands");
       NPC npc3 = new NPC("Greebo The Great", 5, "100 Gold Coins", "Items Vendor", "Vendor", "Goblin", "Market Place");
       //Adding it to the list
       NPC npc4 = new NPC(npc2);
       npc4.setNpcName("Mike Test");
       npc4.setNpcLootDrop("Golden Hammer");
       npc4.setNpcHP(15);




       System.out.println("1.Add A new NPC" +
               "\n2.Display List" +
               "\n3. Exit"

       );
        //Crappy switch statement

        Scanner menu = new Scanner(System.in);
        int choice = menu.nextInt();
        do {
            {
                switch (choice) {
                    case 0:
                        System.out.println("Add a new NPC");
                        break;
                    case 1:
                        System.out.println("Display List");
                        break;
                    default:
                        System.out.println("Exit");

                }
            }
        }while(choice >=3);

        //Getting user input
       Scanner input = new Scanner(System.in);


       System.out.println("Get NPC Name");
       String npcName = input.nextLine();
       npc1.setNpcName(npcName);






        System.out.println("NPC Loot Table");
        String npcLoot = input.nextLine();
        npc1.setNpcLootDrop(npcLoot);



        System.out.println("Get NPC Description");
        String npcDescription = input.nextLine();
        npc1.setNpcDescription(npcDescription);



        System.out.println("Get NPC Class");
        String npcClass = input.nextLine();
        npc1.setNpcClass(npcClass);


        System.out.println("Get NPC Species");
        String npcSpecies = input.nextLine();
        npc1.setNpcSpecies(npcSpecies);


        System.out.println("Get NPC Location");
        String npcLocation = input.nextLine();
        npc1.setNpcLOC(npcLocation);

        System.out.println("Get NPC HP");
        double npcHP = input.nextDouble();
        npc1.setNpcHP(npcHP);

        npc1.DisplayStats();
        System.out.println("\n");
        npc2.DisplayStats();
        System.out.println("\n");
        npc3.DisplayStats();
        System.out.println("\n");
        npc4.DisplayStats();
        System.out.println("\n");







    }



}
