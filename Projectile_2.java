import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile_2 here.
 * 
 * @author Philip Jepkes
 * @version (a version number or a date)
 */
public class Projectile_2 extends SmoothMover
{
    /**
     * 
     */
    public Projectile_2(Vector velocity) {
        super(velocity);
    }
    
    /**
     * Act - do whatever the Projectile_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        addToVelocity(AWorld.GRAVITY);
        move();
    }    
}
