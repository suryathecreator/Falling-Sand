import java.awt.*;

// Abstract base class for gravity particles
public abstract class GravityParticle extends Particle {
    
  public GravityParticle(){}
    
  public GravityParticle(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
  
  public void step() {
    // YOUR CODE HERE: swap with (x, y-1) if it is Air
  //  System.out.println("x: " + x);
  //  System.out.println("y-1: " + (y-1));
  //  System.out.println("Grid.get: " + grid.get(x, y-1) + "And instof: " + (grid.get(x, y-1) instanceof Air));
    if(grid.get(x, y-1) instanceof Air || (grid.get(x, y-1) instanceof LiquidParticle)) // Why both Air and LiquidParticle? Sand goes through air AND water.
    {
      grid.get(x, y-1).swapWith(x, y);
    }
    
  }
}