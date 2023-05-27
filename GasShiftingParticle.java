import java.awt.*;

// Abstract base class for gas shifting particles
public abstract class GasShiftingParticle extends Particle {

  public GasShiftingParticle(){}
    
  public GasShiftingParticle(Grid grid, int x, int y){
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
          {
            grid.set(i, j, new Butane(grid, i, j));
            if (((i + 25) < (grid.getWidth() - 1)) && ((j + 25) < (grid.getHeight() - 1)))
                grid.set(i, j, new Methane(grid, i + 25, j + 25));
          }
      }
    }
  }
}}

