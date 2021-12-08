package ru.mirea.gibo0119.pr7;

import javax.swing.*;
import java.awt.*;

  public class Main {
  public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, world!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel primary = new JPanel();
        primary.setBackground(Color.ORANGE);
        primary.setPreferredSize(new Dimension(300,100));
        JLabel label1 = new JLabel("I LOVE JAVA");
        primary.add(label1);
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
        }

  public static void setBounds(int p1, int p2, int p3, int p4) {
  }
  }
