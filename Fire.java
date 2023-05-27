import java.awt.*;

// Fire particles
public class Fire extends FlameCreatingParticle {
  
  public Fire(){};
  
  public Fire(Grid grid, int x, int y){
    super(grid, x, y);      
  }  
  public Color color()
  {
    return new Color(226, 88, 34);
  }
  // YOUR CODE HERE: write a color() method
}