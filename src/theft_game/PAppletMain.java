
package theft_game;

import processing.core.PApplet;
import theft_game.entities.GameEntity;
import theft_game.entities.*;
import theft_game.scenes.TestScene;

/**
 *
 * @author Kelvin Spátola (Ov3rM1nD_)
 */

public class PAppletMain extends PApplet {
    
    public static void init() {
        PApplet.main(PAppletMain.class);
    }
    
    
    private final String GAME_TITLE = "THEFT";
    private final String RENDERER = JAVA2D;
    private final int[] viewport = {700, 700};
    
    
    @Override
    public void settings(){
        size(viewport[0], viewport[1], RENDERER);
    }
    
    TestScene game;
    
    @Override
    public void setup() {
        surface.setTitle(GAME_TITLE);
        
        game = new TestScene(this);
    }
    
    @Override
    public void draw(){
        surface.setTitle(GAME_TITLE + " | fps: " + (int) frameRate);
                
        game.run();
    }
    
    @Override
    public void keyPressed() {
        
    }
    
    @Override
    public void mousePressed() {
        
    }
}
