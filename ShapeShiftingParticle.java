import java.awt.*;

// Abstract base class for shape shifting particles
public abstract class ShapeShiftingParticle extends Particle {

  public ShapeShiftingParticle(){}
    
  public ShapeShiftingParticle(Grid grid, int x, int y){
    super(grid, x, y);      
  }  
  
  public void step() {
    if(grid.get(x, y + 1) instanceof SuspiciousOrangeLiquid)
    {
      for (int i = x; i < x + 20; i++)
      {
        for (int j = y; j < y + 20; j++)
        {
      //    System.out.println("i: " + i + " and j: " + j);
          if ((i < (grid.getWidth() - 1)) && (j < (grid.getHeight() - 1)))
            grid.set(i, j, new Water(grid, i, j));
        }
      }
    }
  }
}
