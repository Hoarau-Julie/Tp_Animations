package Effets;

import bandeau.Bandeau;
import java.awt.Color;

/**
 * @author Hoarau Julie
 */

public abstract class AnimationEffects {
    
    private String message;
    private Bandeau monBandeau;
    public Color color;
    
    public AnimationEffects(Bandeau bandeau) {
        this.monBandeau = bandeau;
    }
    
    public Bandeau getBandeau() {
        return this.monBandeau;
    }
    
    public void setBandeau(Bandeau bandeau) {
        this.monBandeau = bandeau;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public Color getColor() {
        return this.color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public abstract void draw();
}


