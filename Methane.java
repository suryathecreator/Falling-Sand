import java.awt.*;

// Methane particles
public class Methane extends FlammableGasParticle {

    public Methane(){};

    public Methane(Grid grid, int x, int y){
        super(grid, x, y);
    }
    public Color color() 
    {
        return new Color(211, 211, 211);
    }

}