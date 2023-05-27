import java.awt.*;

// C4 particles

public class C4 extends ExplosiveParticle 
{

    public C4(){};

    public C4(Grid grid, int x, int y){
        super(grid, x, y);
    }
    public Color color()
    {
        return new Color(204, 174, 135);
    }
}