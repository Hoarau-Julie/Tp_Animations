package Effets;

import bandeau.Bandeau;
import java.awt.Font;

/**
 * @author Hoarau Julie
 */

public class Effet_ZoomRotation extends AnimationEffects {
    
    public Effet_ZoomRotation(Bandeau bandeau, String message) {
        super(bandeau);
        setMessage(message);
        
    }
    
    public void draw() {
        this.getBandeau().setMessage(this.getMessage());
	for (int i = 5; i < 40 ; i+=5) {
                this.getBandeau().setFont(new Font("MONOSPACED",Font.BOLD,5+i));
                this.getBandeau().sleep(70);
                for (int j = 0; j <= 10; j++) {
                    this.getBandeau().setRotation(2*Math.PI*j / 10);
                    this.getBandeau().sleep(10);
                }
        this.getBandeau().sleep(100);
        }
    }
}
    