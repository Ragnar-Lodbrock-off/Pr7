package ru.mirea.gibo0119.pr7;

import java.awt.*;
import javax.swing.*;

  public class General {
public static void main(String[] args) {
        JFrame frame = new JFrame("Hi, dear user!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // создание первой панели
        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(300, 100));
        panel1.setBackground(Color.YELLOW);
        JLabel label1 = new JLabel("I LOVE JAVA!");
        panel1.add(label1);

        // создание второй панели
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(300, 100));
        panel2.setBackground(Color.RED);
        JLabel label2 = new JLabel("JAVA - GREAT LANGUAGE!");
        panel2.add(label2);

        // добавим primary панель
        JPanel primary = new JPanel();
        primary.setBackground(Color.GREEN);

        primary.add(panel1);
        primary.add(panel2);
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
        }
        }
