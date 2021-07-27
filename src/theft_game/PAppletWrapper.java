
package theft_game;

import processing.core.PApplet;

/**
 *
 * @author Kelvin Spátola (Ov3rM1nD_)
 */

public class PAppletWrapper extends PApplet {
    
    public static void init() {
        PApplet.main(PAppletWrapper.class);
    }
    
    @Override
    public void settings(){
        size(700, 700);
    }
    
    @Override
    public void setup() {
        
    }
    
    @Override
    public void draw(){
        background(255);
        
    }
    
}
