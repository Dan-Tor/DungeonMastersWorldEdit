package com.company;
import java.util.Scanner;
import java.util.Vector;


public class Main {



    public static void main(String[] args) {
        //Vector NPC List
       Vector NPClist = new Vector();
       //Testing NPC object
       NPC npc1 = new NPC();
       NPC npc2 = new NPC("Ashley Test", 20, "Ruby Sword", "Barbarian on the Hunt", "Barbarian", "Human", "Wildlands");
       //Adding it to the list
       NPClist.add(npc1);
       NPClist.add(npc2);

       System.out.println("1.Add A new NPC" +
               "\n2.Display List" +
               "\n3. Exit"

       );
        //Crappy switch statement

        Scanner menu = new Scanner(System.in);
        int choice = menu.nextInt();
       while(choice !=3) {
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
        //Getting user input
       Scanner input = new Scanner(System.in);


       System.out.println("Get NPC Name");
       String npcName = input.nextLine();
       npc1.setNpcName(npcName);



        System.out.println("Get NPC HP");
        double npcHP = input.nextDouble();
        npc1.setNpcHP(npcHP);

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

        npc1.DisplayStats();
        npc2.DisplayStats();










    }
}
