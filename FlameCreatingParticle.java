import java.awt.*;

// Abstract base class for flame creating particles
public abstract class FlameCreatingParticle extends Particle {
    
    public FlameCreatingParticle(){};

    public FlameCreatingParticle(Grid grid, int x, int y){
        super(grid, x, y);      
    }        
    
    public void step() {
        if(grid.get(x, y+1) instanceof FlammableGasParticle)
        {
            if ((x < (grid.getWidth() - 1)) && ((y+1) < (grid.getHeight() - 1)))
                grid.set(x, y+1, new Fire(grid, x, y+1));
        }
        if(grid.get(x-1, y) instanceof FlammableGasParticle)
        {
            if (((x-1) < (grid.getWidth() - 1)) && (y < (grid.getHeight() - 1)))
                grid.set(x-1, y, new Fire(grid, x-1, y));
        }
        if((grid.get(x+1, y) instanceof FlammableGasParticle))
        {
            if (((x+1) < (grid.getWidth() - 1)) && (y < (grid.getHeight() - 1)))
                grid.set(x+1, y, new Fire(grid, x+1, y));
        }
        if((grid.get(x, y-1) instanceof FlammableGasParticle))
        {
            if ((x < (grid.getWidth() - 1)) && ((y-1) < (grid.getHeight() - 1)))
                grid.set(x, y-1, new Fire(grid, x, y-1));
        }
        if(grid.get(x, y+1) instanceof Water)
        {
            grid.set(x, y, new Air(grid, x, y));
        }
    }
}


