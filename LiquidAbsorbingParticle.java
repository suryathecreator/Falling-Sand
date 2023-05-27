import java.awt.*;

// Abstract base class for liquid absorbing particles
public abstract class LiquidAbsorbingParticle extends Particle {

  public LiquidAbsorbingParticle(){}
    
  public LiquidAbsorbingParticle(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
  
  public void step() {
    if((grid.get(x, y + 1) instanceof SuspiciousOrangeLiquid) || (grid.get(x, y + 1) instanceof Water)) 
    {
      for (int i = x; i < x + 40; i++)
      {
        for (int j = y; j < y + 40; j++)
        {
      //    System.out.println("i: " + i + " and j: " + j);
          if ((i < (grid.getWidth() - 1)) && (j < (grid.getHeight() - 1)))
            grid.set(i, j, new Air(grid, i, j));
        }
      }
    }
  }
}
