package Effets;

import bandeau.Bandeau;
import java.awt.Color;
import java.util.ArrayList;

/**
 * @author Hoarau Julie
 */
        
public class MotionScenario {
    
    private final ArrayList<AnimationEffects> Effects = new ArrayList<AnimationEffects>();
    
    public void addEffect(AnimationEffects effet, int nbRepeat) {
        for (int i=0; i<nbRepeat; i++) {
            this.Effects.add(effet);
        }   
    }
    
    public void Frame() {
        for (AnimationEffects e : Effects) {
            e.draw();
        }
        
    }
    
    public static void main(String[] args) {
        
        Bandeau monBandeau = new Bandeau();
        MotionScenario Motion = new MotionScenario();
        
        String newLine = System.getProperty("line.separator");
        
        Effet_LetterByLetter ObO = new Effet_LetterByLetter(monBandeau, "Hi how are you ? ");
        Effet_Flash flashBDG = new Effet_Flash(monBandeau, "FLASH", Color.YELLOW, Color.DARK_GRAY);
        Effet_ZoomRotation ZR = new Effet_ZoomRotation(monBandeau, "It's a new day !");
        ChangeBackGrd_Setup Rainbow = new ChangeBackGrd_Setup(monBandeau, "Put Colors in your life");
        ColorFont textColor = new ColorFont(monBandeau, "BLACK ON WHITE", Color.BLACK);
        ChangeBackGrd FontColor = new ChangeBackGrd(monBandeau, "BE HAPPY", Color.ORANGE);
        ChangeBackGrd_Setup Rainbow2 = new ChangeBackGrd_Setup(monBandeau, "BE HAPPY");
        
       
        Motion.addEffect(ObO, 1);
        Motion.addEffect(flashBDG,2);
        Motion.addEffect(ZR, 3);
        Motion.addEffect(Rainbow, 1);
        Motion.addEffect(textColor, 1);
        Motion.addEffect(FontColor, 1);
        Motion.addEffect(Rainbow2, 1);
        
        Motion.Frame();
        monBandeau.close();
        
    }
}
