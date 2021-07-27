
package theft_game;

import processing.core.PApplet;
import theft_game.entities.GameEntity;
import theft_game.entities.*;

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
    
    GameEntity player;
    
    @Override
    public void setup() {
        surface.setTitle(GAME_TITLE);
        
        player = new Player(this, width/2, height/2);
    }
    
    @Override
    public void draw(){
        surface.setTitle(GAME_TITLE + " | fps: " + (int) frameRate);
        
        background(255);
        
        player.render();
        player.update();
    }
    
    @Override
    public void keyPressed() {
        
    }
    
    @Override
    public void mousePressed() {
        
    }
}
