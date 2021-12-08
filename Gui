package ru.mirea.gibo0119.pr7;

import java.awt.*;
import javax.swing.*;

  public class Gui extends JPanel {

      Image img = new ImageIcon("D:\\MyProfile\\Pictures\\Default Pictures\\usertile01.bmp").getImage();

  public static void main(String[] args) {

      JFrame fr = new JFrame();

      // установка абсолютного позиционирования на фрейме
      fr.setLayout(null);
      fr.setSize(550,550);

      Main m = new Main();

      // установка размеров и координат компонента с абсолютным позиционированием
      m.setBounds(250, 250, 550, 550);
      fr.add(fr);
      fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fr.setVisible(true);
      }

  public void paintComponent(Graphics g) {
      g.drawImage(img, 0, 0, null);
      }
      }
