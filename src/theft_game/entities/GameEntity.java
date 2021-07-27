package theft_game.entities;

/**
 *
 * @author Kelvin Spátola (Ov3rM1nD_)
 */

import processing.core.*;

public abstract class GameEntity {
    protected PApplet p;
    protected PVector pos;

    // CONSTRUCTOR
    public GameEntity(PApplet p, float x, float y) {
        this.p = p;
        this.pos = new PVector(x, y);
    }
    
    public abstract void render();
    
    public void update() { }

}
