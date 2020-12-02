/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Effets;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Hoarau Julie
 */
public class Effet_ZoomRotation {
     public static void main(String[] args) {
	    new Effet_ZoomRotation().EffetsZR();
    }
    
    public void EffetsZR() {
        
        
	Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        
        monBandeau.setBackground(Color.WHITE);
        monBandeau.setForeground(Color.BLACK);
        monBandeau.sleep(300);
        monBandeau.setForeground(Color.WHITE);
        monBandeau.setBackground(Color.BLACK);
        monBandeau.sleep(300);
        monBandeau.setBackground(Color.WHITE);
        monBandeau.setMessage("         Bonjour M.Bastide");
        monBandeau.sleep(400);
        monBandeau.setForeground(Color.BLACK);
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.GRAY);
        monBandeau.sleep(300);
	monBandeau.setMessage("          Voici un tp original      ");
        monBandeau.setForeground(Color.WHITE);
        for (int i = 5; i < 40 ; i+=5) {
                monBandeau.setFont(new Font("MONOSPACED", Font.BOLD, 5+i));
                monBandeau.sleep(100);
                for (int j = 0; j <= 10; j++) {
                    monBandeau.setRotation(2*Math.PI*j / 10);
                    monBandeau.sleep(10);
                }
        }
         
	
	monBandeau.sleep(500);
        monBandeau.setBackground(Color.GRAY);
        monBandeau.close();
       
}
}
    