import java.util.*;
import java.awt.*;

// Abstract base class for liquid particles
public abstract class LiquidParticle extends Particle {
    
  public LiquidParticle(){}
  
  public LiquidParticle(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
  // Randomly move left, right, or down
  public void step() {
    // YOUR CODE HERE: randomly swap with a particle to the
    // left, right, or down, if it is Air
    int random = (int) (Math.random() * 3);
    int xTemp, yTemp;
    if ((grid.get(x - 1, y) instanceof Air) || (grid.get(x - 1, y) instanceof LiquidParticle) || (grid.get(x, y - 1) instanceof Air) || (grid.get(x, y - 1) instanceof LiquidParticle) || (grid.get(x + 1, y) instanceof Air) || (grid.get(x + 1, y) instanceof Air))
    {
      if (random == 0) 
      {
        xTemp = x - 1;
        yTemp = y;
      }
      else if (random == 1)
      {
        xTemp = x;
        yTemp = y - 1;
      }
      else
      {
        xTemp = x + 1;
        yTemp = y;
      }
      while (!(grid.get(xTemp, yTemp) instanceof Air) && !(grid.get(xTemp, yTemp) instanceof LiquidParticle))
      {
        random = (int) (Math.random() * 3);
        if (random == 0) 
        {
          xTemp = x - 1;
          yTemp = y;
        }
      else if (random == 1)
        {
          xTemp = x;
          yTemp = y - 1;
        }
        else
        {
          xTemp = x + 1;
          yTemp = y;
        }
      }
      grid.get(xTemp, yTemp).swapWith(x, y);
    }
  // Note: you may want to write a trySwap() helper method here
  // to make your code more concise, but you don't need to.
  }
}