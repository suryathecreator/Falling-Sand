import java.awt.*;

// Dynamite particles
public class Dynamite extends ExplosiveParticle {
  
  public Dynamite(){};
  
  public Dynamite(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
  public Color color()
  {
    return new Color(138, 3, 3);
  }
  // YOUR CODE HERE: write a color() method
}