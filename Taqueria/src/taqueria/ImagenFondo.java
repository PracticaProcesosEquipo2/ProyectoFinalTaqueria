/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taqueria;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author deml
 */
public class ImagenFondo extends JPanel{
        @Override
        public void paint(Graphics g){     
            
            ImageIcon imagen=new ImageIcon(getClass().getResource("/taqueria/img/Menu.jpg"));            
            g.drawImage(imagen.getImage(),0, 0, getWidth(), getHeight(),this);            
            setOpaque(false);            
            super.paint(g);
        }
    }