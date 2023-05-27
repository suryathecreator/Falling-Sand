import java.awt.*;

// Wyatt particles
public class Wyatt extends GasShiftingParticle {
    
  public Wyatt(){}
  
  public Wyatt(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
  public Color color()
  {
    return new Color(4, 99, 7);
  }
  // YOUR CODE HERE: write a color() method
}