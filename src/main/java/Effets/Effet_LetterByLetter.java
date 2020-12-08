package Effets;

import bandeau.Bandeau;

/**
 * @author Hoarau Julie
 */
public class Effet_LetterByLetter extends AnimationEffects {
    
    public Effet_LetterByLetter(Bandeau bandeau, String message) {
        super(bandeau);
        setMessage(message);
    }
    
    public void draw() {
        String s = "";
        for (int i=0; i<this.getMessage().length(); i++) {
            s += this.getMessage().substring(i,i+1);
            this.getBandeau().setMessage(s);
            this.getBandeau().sleep(100);
        }
        this.getBandeau().sleep(500);
        
    }
}

