import java.awt.*;

// Abstract base class for explosive particles
public abstract class ExplosiveParticle extends Particle {

  public ExplosiveParticle(){}
    
  public ExplosiveParticle(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
  
  public void step() {
    if((grid.get(x, y + 1) instanceof SuspiciousOrangeLiquid) || (grid.get(x, y + 1) instanceof Fire)) 
    {
      for (int i = x; i < x + 20; i++)
      {
        for (int j = y; j < y + 20; j++)
        {
      //    System.out.println("i: " + i + " and j: " + j);
          if ((i < (grid.getWidth() - 1)) && (j < (grid.getHeight() - 1)))
            grid.set(i, j, new Air(grid, i, j));
        }
      }
    }
  }
}
