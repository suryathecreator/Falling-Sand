import java.awt.*;

// TNT particles
public class TNT extends ExplosiveParticle 
{
    public TNT(){};
  
    public TNT(Grid grid, int x, int y){
              super(grid, x, y);      
    }  
    public Color color()
    {
      return new Color(255, 0, 0);
    }    
}