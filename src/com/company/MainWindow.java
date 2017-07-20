package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by danny on 7/19/17.
 */
public class MainWindow {
    private JButton createNPCButton;
    private JPanel panelMain;
    private JButton displayNPCListButton;
    private JButton currentSizeOfListButton;

    public MainWindow() {
        createNPCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hey");
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
}
