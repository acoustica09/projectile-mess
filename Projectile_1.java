import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile_1 here.
 * 
 * @author Chandler Clarke
 * @version (a version number or a date)
 */
public class Projectile_1 extends SmoothMover
{
    /**
     * 
     */
    public Projectile_1(Vector velocity) {
        super(velocity);
    }
    /**
     * Act - do whatever the Projectile_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        addToVelocity(AWorld.GRAVITY);
        move();
    }    
}
