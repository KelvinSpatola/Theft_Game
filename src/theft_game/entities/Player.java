package theft_game.entities;

/**
 *
 * @author Kelvin Spátola (Ov3rM1nD_)
 */

import processing.core.*;
import theft_game.util.GameController;

public class Player extends GameEntity {
    private final PVector vel = new PVector();
    private final float speed = 10;
    
    // CONSTRUCTOR
    public Player(PApplet p, float x, float y){
        super(p, x, y);
        
        GameController.init(p);
    }
    
    @Override
    public void render() {
        p.push();
        p.translate(pos.x, pos.y);
        p.fill(0);
        p.circle(0, 0, 50);
        p.pop();
    }
    
    @Override
    public void update() {        
        vel.set(GameController.getDirectionVector());
        vel.setMag(speed);
        pos.add(vel);
    }
}
