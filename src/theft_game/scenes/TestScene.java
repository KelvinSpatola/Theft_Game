package theft_game.scenes;

/**
 *
 * @author Kelvin Spátola (Ov3rM1nD_)
 */

import java.util.ArrayList;
import java.util.List;
import processing.core.*;
import theft_game.entities.*;

public class TestScene {
    PApplet p;
    GameEntity player;
    List<Scene> levels = new ArrayList<>();
    int levelIndex = 0;
    
    
    // CONSTRUCTOR
    public TestScene(PApplet p) {
        this.p = p;
        player = new Player(p, p.width/2, p.height/2);
        
        Scene lvl_1 = () -> {
            //p.background(255);
            player.render();
            player.update();
        };
        levels.add(lvl_1);
        
        Scene lvl_2 = () -> {
            p.background(255, 0, 0);
            player.render();
            player.update();
        };
        levels.add(lvl_2);
        
        Scene lvl_3 = () -> {
            p.background(0, 255, 0);
            player.render();
        };
        levels.add(lvl_3);
        
        Scene lvl_4 = () -> {
            p.background(0, 0, 255);
            //player.render();
            //player.update();
        };
        levels.add(lvl_4);
        
        Scene lvl_5 = () -> {
            p.background(255, 255, 0);
            player.render();
        };
        levels.add(lvl_5);
        
        class Fade {
            int val;
            
            int update() {
                if(val <= 255) val += 2;
                return val;
            }
        }
        Fade fade = new Fade();
        
        Scene fadeOut = () -> {
            p.fill(0, fade.update());
            p.rect(0, 0, p.width, p.height);
        };
        levels.add(fadeOut);
    }
    
    public void run() {
        //levelIndex = (levelIndex + (p.frameCount % 60 == 0 ? 1 : 0)) % levels.size();
        //levels.get(levelIndex).play();
        
        levels.get(4).play();
        levels.get(0).play();
        levels.get(5).play();
    }
}
