import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world to put objects in
 * 
 * @author Marlene Inoue
 * @version 1.2 31 October 2018
 */
public class AWorld extends World {
    public static final Vector GRAVITY = new Vector(0.0, 0.5);

    //all actors individual projectors
    private Projector chandlerProjector = new Projector();
    private Projector philipProjector = new Projector();
    private Projector camilleProjector = new Projector();
    private Projector tylerProjector = new Projector();

    //locations of the projectors
    private static final int PROJECTOR_MIN = 20;
    private static final int PROJECTOR_MAX_X = 785;
    private static final int PROJECTOR_MAX_Y = 585;
    
    private int textTime = 0;
    
    //target locations
    private int[] xLocation = {Greenfoot.getRandomNumber(600) + 100,
                               Greenfoot.getRandomNumber(600) + 100,
                               Greenfoot.getRandomNumber(600) + 100,
                               Greenfoot.getRandomNumber(600) + 100,
                               Greenfoot.getRandomNumber(600) + 100,
                               Greenfoot.getRandomNumber(600) + 100,
                               Greenfoot.getRandomNumber(600) + 100,
                               Greenfoot.getRandomNumber(600) + 100};
    private int[] yLocation = {Greenfoot.getRandomNumber(400) + 100,
                               Greenfoot.getRandomNumber(400) + 100,
                               Greenfoot.getRandomNumber(400) + 100,
                               Greenfoot.getRandomNumber(400) + 100,
                               Greenfoot.getRandomNumber(400) + 100,
                               Greenfoot.getRandomNumber(400) + 100,
                               Greenfoot.getRandomNumber(400) + 100,
                               Greenfoot.getRandomNumber(400) + 100};
    
    /**
     * Constructor for objects of class AWorld.
     */
    public AWorld() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setUp();
    }

    /**
     * Setting locations and angle for each projector
     */
    private void setUp() {
        addObject(chandlerProjector, PROJECTOR_MIN, PROJECTOR_MAX_Y);
        chandlerProjector.setRotation(330);

        addObject(philipProjector, PROJECTOR_MAX_X, PROJECTOR_MAX_Y);
        philipProjector.setRotation(260);

        addObject(camilleProjector, PROJECTOR_MIN, PROJECTOR_MIN);
        camilleProjector.setRotation(45);

        addObject(tylerProjector, PROJECTOR_MAX_X, PROJECTOR_MIN);
        tylerProjector.setRotation(120);

        for (int i = 0; i < xLocation.length; i++) {
            addObject(new Target(), xLocation[i], yLocation[i]);
        }
    }

    /**
     * Showing instructions within some time frame
     */
    private void instructions() {
        if (textTime <= 300) {
            textTime++;
            showText("Press \"e\" to project the upper left projector", 800 / 2, (600 / 2) - 30);
            showText("Press \"f\" to project the lower left projector", 800 / 2, 600 / 2);
            showText("Press \"i\" to project the upper left projector", 800 / 2, (600 / 2) + 30);
            showText("Press \"j\" to project the lower left projector", 800 / 2, (600 / 2) + 60);
        } else if (textTime > 300) {
            showText(null, 800 / 2, (600 / 2) - 30);
            showText(null, 800 / 2, 600 / 2);
            showText(null, 800 / 2, (600 / 2) + 30);
            showText(null, 800 / 2, (600 / 2) + 60);
        }
    }
    
    /**
     * Returns the current x location of chandlerProjector
     */
    public int getChandlerX(){
        return chandlerProjector.getX();
    }

    /**
     * Returns the current x location of philipProjector
     */
    public int getPhilipX(){
        return philipProjector.getX();
    }

    /**
     * Returns the current x location of camilleProjector
     */
    public int getCamilleX(){
        return camilleProjector.getX();
    }

    /**
     * Returns the current x location of tylerProjector
     */
    public int getTylerX(){
        return tylerProjector.getX();
    }

    /**
     * Returns the current y location of chandlerProjector
     */
    public int getChandlerY(){
        return chandlerProjector.getY();
    }

    /**
     * Returns the current y location of philipProjector
     */
    public int getPhilipY(){
        return philipProjector.getY();
    }

    /**
     * Returns the current y location of ca,o;;eProjector
     */
    public int getCamilleY(){
        return camilleProjector.getY();
    }

    /**
     * Returns the current y location of tylerProjector
     */
    public int getTylerY(){
        return tylerProjector.getY();
    }
    
    /**
     * What the world will repeat
     */
    public void act() {
        instructions();
    }

}