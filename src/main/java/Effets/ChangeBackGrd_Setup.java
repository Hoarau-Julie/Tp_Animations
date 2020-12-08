package Effets;

import bandeau.Bandeau;
import java.awt.Color;

/**
 * @author Hoarau Julie
 */

public class ChangeBackGrd_Setup extends AnimationEffects {
    
    Color[] ColorsList = {
        Color.RED,
        Color.ORANGE,
        Color.YELLOW,
        Color.GREEN,
        Color.CYAN,
        Color.BLUE,
        Color.PINK,
        Color.MAGENTA,
        Color.LIGHT_GRAY,
        Color.DARK_GRAY,
        Color.WHITE,
    };
    
    public ChangeBackGrd_Setup(Bandeau bandeau, String message) {
        super(bandeau);
        setMessage(message);
    }
    
    public void draw() {
        this.getBandeau().setMessage(this.getMessage());
        this.getBandeau().sleep(500);
        for (int i=0; i<ColorsList.length; i++) {
            this.getBandeau().setBackground(ColorsList[i]);
            this.getBandeau().sleep(200);
        }
    }
}
