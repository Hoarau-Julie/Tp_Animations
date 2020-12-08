package Effets;

import bandeau.Bandeau;
import java.awt.Color;

/**
 * @author Hoarau Julie
 */
 
public class ColorFont extends AnimationEffects {
    
    public ColorFont(Bandeau bandeau, String message, Color color) {
        super(bandeau);
        setMessage(message);
        setColor(color);
    }
    
    public void draw() {
        this.getBandeau().setMessage(this.getMessage());
	this.getBandeau().sleep(1000);
	this.getBandeau().setForeground(this.getColor());
        this.getBandeau().sleep(1000);
    }
}
