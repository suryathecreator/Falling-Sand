// A grid of particles
public class Grid {
  // Instance Variables
  private Particle[][] world;
  private int width, height;

  // Main constructor
  public Grid(int width, int height) {
    // set width and height
    // YOUR CODE HERE: set width and height
    this.width = width;
    this.height = height;
    // initialize world
    // YOUR CODE HERE: create the 2D-array world
    this.world = new Particle[width][height];
    // fill with air particles
    // and add barriers along edges
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        if ((x == 0) || (y == 0) || (x == width - 1) || (y == height - 1))
        {
          this.set(x, y, new Barrier(this, x, y));
     //     System.out.println("Barrier! x: " + x + " and y: " + y);
        }
        else
        {
          this.set(x, y, new Air(this, x, y));
     //     System.out.println("Air! x: " + x + " and y: " + y + "and WORLD[X][Y]: " + get(x, y));
        }
        // YOUR CODE HERE: set (x, y) to a new particle
        // Hint: you will need to use the this keyword to 
        // reference this Grid instance
      }
    }
  }

  // Grid accessor and mutator
  public Particle get(int x, int y) {
    // YOUR CODE HERE: Return the particle at (x, y)
    return this.world[x][y]; // delete this line of code
  }
  public void set(int x, int y, Particle value) {
    // YOUR CODE HERE: set the particle at (x, y) to value
    this.world[x][y] = value;
  }

  public int getHeight() // Made to help with ExplosiveParticle.java
  {
    return this.height;
  }

  public int getWidth() // Made to help with ExplosiveParticle.java
  {
    return this.width;
  }

  // Utility method to swap particles
  public void swap(int x1, int y1, int x2, int y2) {
    // Move particles
    // YOUR CODE HERE: swap the particles by calling set
    Particle temp = get(x1, y1);
    set(x1, y1, get(x2, y2));
    set(x2, y2, temp);
    // Pass new coords (do not edit)
    get(x1, y1).moveTo(x1,y1);
    get(x2, y2).moveTo(x2, y2);
  }
}