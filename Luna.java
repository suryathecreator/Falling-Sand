import java.awt.*;

// Luna particles
public class Luna extends ShapeShiftingParticle {
    
  public Luna(){}
  
  public Luna(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
  public Color color()
  {
    return new Color(218, 112, 214);
  }
  // YOUR CODE HERE: write a color() method
}