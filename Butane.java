import java.awt.*;

// Butane particles
public class Butane extends FlammableGasParticle {
  
  public Butane(){};
  
  public Butane(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
  public Color color()
  {
    return new Color(0, 127, 255);
  }
  // YOUR CODE HERE: write a color() method
}