import java.awt.*;
import java.util.*;

// Main driver class
// Runs the FallingParticles simulation
public class Simulator
{
  // Main method
  // Creates and runs a new simulator
  public static void main(String[] args) {
    // YOUR CODE HERE: create and run a new Simulator
    Simulator simulator = new Simulator(100, 100);
    simulator.run();
  }
  
  // Instance variables
  private Grid grid;
  private ParticleDisplay display;
  private ArrayList<String> classes;
  private int width, height;
  
  public Simulator(int width, int height) {
    this.width = width;
    this.height = height;
    // Initialize instance variables
    // YOUR CODE HERE: set width and height

    // Add new particle types here
    // Names must match class names EXACTLY
    classes = new ArrayList<String>();
    classes.add("Air");
    classes.add("Stone");
    classes.add("Sand");
    classes.add("Water");
    classes.add("SuspiciousOrangeLiquid");
    classes.add("Sponge");
    classes.add("Fire");
    classes.add("TNT");
    classes.add("Dynamite");
    classes.add("C4");
    classes.add("Methane");
    classes.add("Butane");
    classes.add("Luna");
    classes.add("Wyatt");
    // Create ParticleDisplay
    // YOUR CODE HERE: set display to a new ParticleDisplay
    this.display = new ParticleDisplay("Falling Sand", height, width, classes);
    // Create grid
    // YOUR CODE HERE: set grid to a new Grid
    this.grid = new Grid(width, height); 
  }
  
  // Called when the user clicks on a location using the given tool
  @SuppressWarnings({"unchecked"})
  private void locationClicked(int x, int y, Class tool) {
    // Barriers are permanent
    if (this.grid.get(x,y) instanceof Barrier) {
      return;
    }
    // Add special cases here, if any

    // Set particle at x,y to new instance of tool
    // Do not modify
    else {
      try {
        {
        this.grid.set(x, y, (Particle) tool.getDeclaredConstructor().newInstance());
        }
        this.grid.get(x,y).initialize(grid, x, y);
      }
      catch (Exception e) {
        System.out.println("Error during instantiation");
        System.out.println(e);
      }
    }
  }

  // Set display colors based on grid
  public void updateDisplay()
  {
    for (int i = 0; i < this.width; i++)
    {
      for (int j = 0; j < this.height; j++)
      {
        display.setColor(i, j, grid.get(i, j).color());
      }
    }
    // YOUR CODE HERE: set display colors based on grid
  }

  // Called repeatedly.
  // Causes one random particle to maybe do something.
  public void step() {
      int x = (int) (Math.random() * (width));
      int y = (int) (Math.random() * (height));
      this.grid.get(x,y).step();
    // YOUR CODE HERE: ask a random particle to step
  }
  
  //do not modify
  public void run() {
    while (true) {
      for (int i = 0; i < display.getSpeed(); i++) {
        step();
      }
      updateDisplay();
      display.repaint();
      display.pause(1);  //wait for redrawing and for mouse
      int[] mouseLoc = display.getMouseLocation();
      if (mouseLoc != null)  {//test if mouse clicked
        try {
          locationClicked(mouseLoc[1], height - (mouseLoc[0]+1), Class.forName(classes.get(display.getTool())));
        }
        catch (Exception e) {
          System.out.println("You added an invalid class name.");
          System.out.println(e);
        }
      }
    }
  }
}
