import java.awt.*;

// SuspiciousOrangeLiquid particles
public class SuspiciousOrangeLiquid extends LiquidParticle {
    public SuspiciousOrangeLiquid(){}
  
    public SuspiciousOrangeLiquid(Grid grid, int x, int y){
              super(grid, x, y);      
    }  
    public Color color()
    {
      return new Color(255, 181, 114);
    }
} 