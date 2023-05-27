import java.awt.*;

// Sand particles
public class Sand extends GravityParticle {
    public Sand(){}
    public Sand(Grid grid, int x, int y){
            super(grid, x, y);      
    }
    public Color color()
    {
      return new Color(150, 150, 50);
    }
  // YOUR CODE HERE: write a color() method
}