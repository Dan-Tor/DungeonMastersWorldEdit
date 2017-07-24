package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by danny on 7/19/17.
 */
public class MainWindow {
    private JButton createNPCButton;
    private JPanel panelMain;
    private JButton displayNPCListButton;
    private JButton currentSizeOfListButton;


    //List components
    static int i = 1;

    static ArrayList<NPC> npcList = new ArrayList<NPC>();
    static NPC[] npc = new NPC[10000];
//Ashley Test
        NPC npc2 = new NPC("Ashley Test", 20, "Ruby Sword", "Barbarian on the Hunt", "Barbarian", "Human", "Wildlands");
//Adding to list
    public  ArrayList<NPC> addNpcList() {
        npcList.add(npc2);
        return npcList;
    }





    public MainWindow() {
        createNPCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hey");
                newNPC();

            }
        });
        displayNPCListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNpcList();
                JOptionPane.showMessageDialog(null,npcList.toString());
            }
        });
        currentSizeOfListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,npcList.size());
            }
        });
    }


    public static void main(String[] args) {
        //Main Window code
        JFrame mainWin = new JFrame("Dungeon Master's World Edit");
        mainWin.setContentPane(new MainWindow().panelMain);
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);



    }
    public void newNPC(){
        int i = 1;
        Scanner input = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "NPC Name: ");
        System.out.println("\nThis is the number of loops "+ i + "\n");
        npc[i] = new NPC();
        System.out.println("Get NPC Name");
        String npcName = input.nextLine();
        npc[i].setNpcName(npcName);


        JOptionPane.showMessageDialog(null, "NPC Loot: ");
        String npcLoot = input.nextLine();
        npc[i].setNpcLootDrop(npcLoot);

        JOptionPane.showMessageDialog(null, "NPC Description: ");
        String npcDescription = input.nextLine();
        npc[i].setNpcDescription(npcDescription);

        JOptionPane.showMessageDialog(null, "NPC Class: ");
        String npcClass = input.nextLine();
        npc[i].setNpcClass(npcClass);

        JOptionPane.showMessageDialog(null, "NPC Species: ");
        String npcSpecies = input.nextLine();
        npc[i].setNpcSpecies(npcSpecies);

        JOptionPane.showMessageDialog(null, "NPC Location: ");
        String npcLocation = input.nextLine();
        npc[i].setNpcLOC(npcLocation);

        JOptionPane.showMessageDialog(null, "NPC HP: ");
        double npcHP = input.nextDouble();
        npc[i].setNpcHP(npcHP);

        npcList.add(npc[i]);
        i++;

    }

}
