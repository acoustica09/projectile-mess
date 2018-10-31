import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile_3 here.
 * 
 * @author Camille Otillio
 * @version (a version number or a date)
 */
public class Projectile_3 extends SmoothMover
{
    /**
     * 
     */
    public Projectile_3(Vector velocity) {
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
