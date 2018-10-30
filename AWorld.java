import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world is a mess or throwable objects
 * 
 * @author Marlene Inoue
 * @version 1.0 29 October 2018
 */
public class AWorld extends World {
    public static final Vector GRAVITY = new Vector(0.0, 0.5);
    
    /**
     * Constructor for objects of class AWorld.
     * 
     */
    public AWorld() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setUp();
    }
    
    /**
     * 
     */
    private void setUp() {
        addObject(new Target(), Greenfoot.getRandomNumber(700) + 50, 585);
    }
}
