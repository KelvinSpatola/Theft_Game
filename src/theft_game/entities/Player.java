package theft_game.entities;

/**
 *
 * @author Kelvin Spátola (Ov3rM1nD_)
 */

import processing.core.*;

public class Player extends GameEntity {
    
    
    // CONSTRUCTOR
    public Player(float x, float y){
        super(x, y);
    }
    
    @Override
    public GameEntity render() {
        
        return this;
    }
    
    
}
