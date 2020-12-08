package Effets;

import bandeau.Bandeau;
import java.awt.Color;

/**
 * @author Hoarau Julie
 */

public class Effet_Flash extends AnimationEffects {
    
    private final Color C1;
    private final Color C2;
    
    public Effet_Flash (Bandeau bandeau, String message, Color color1, Color color2) {
        super(bandeau);
        setMessage(message);
        this.C1 = color1;
        this.C2 = color2;
    }
    
   
    public void draw() {
        this.getBandeau().setMessage(this.getMessage());
        for (int i=1; i<10; i++) {
            if (i%2 == 0) {
                this.getBandeau().setForeground(this.C1);
                this.getBandeau().setBackground(this.C2);
                this.getBandeau().sleep(100);
            } 
            else {
            this.getBandeau().setForeground(this.C2);
            this.getBandeau().setBackground(this.C1);
            this.getBandeau().sleep(100);
            }
        }
        this.getBandeau().sleep(500);
    }
    
}
