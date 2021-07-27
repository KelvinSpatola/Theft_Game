package theft_game.entities;

/**
 *
 * @author Kelvin Spátola (Ov3rM1nD_)
 */

import processing.core.*;

public abstract class GameEntity {
    private static PApplet papplet;
    private PVector location;

    // CONSTRUCTOR
    public GameEntity(float x, float y){
        this.location = new PVector(x, y);
    }
    
    public abstract GameEntity render();
    
    public void update() { }

}
