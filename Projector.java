import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Projects all of the projectiles
 * 
 * @author Marlene Inoue 
 * @version 1.1 31 October 2018
 */
public class Projector extends Actor {
    //times for each projector
    private int chandlerTime = 0, philipTime = 0, camilleTime = 0, tylerTime = 0;

    /**
     * FIXME: write down what your vector rotation will be
     */
    private void chandlerFire() {
        boolean chandlerAim = true;

        if ("f".equals(Greenfoot.getKey())) {
            int angle = getRotation() - 36; // adjust angle for image

            AWorld world = (AWorld) getWorld();
            Projectile_1 ball = new Projectile_1(new Vector(angle, 9));
            getWorld().addObject(ball, world.getChandlerX(), world.getChandlerY());
            ball.setRotation(angle);
            ball.move(42); // clear the cannon barrel
            chandlerTime = 0;
        }
    }

    /**
     * FIXME: write down what your vector rotation will be
     */
    private void philipFire() {
        if ("j".equals(Greenfoot.getKey())) {
            int angle = getRotation() + 180; // adjust angle for image

            AWorld world = (AWorld) getWorld();
            Projectile_2 ball = new Projectile_2(new Vector(angle, 9));
            getWorld().addObject(ball, world.getPhilipX(), world.getPhilipY());
            ball.setRotation(angle);
            ball.move(-42); // clear the cannon barrel
            philipTime = 0;
        }
    }

    /**
     * FIXME: write down what your vector rotation will be
     */
    private void camilleFire() {
        if ("e".equals(Greenfoot.getKey())) {
            int angle = getRotation() - 36; // adjust angle for image

            AWorld world = (AWorld) getWorld();
            Projectile_3 ball = new Projectile_3(new Vector(angle, 9));
            getWorld().addObject(ball, world.getCamilleX(), world.getCamilleY());
            ball.setRotation(angle);
            ball.move(42); // clear the cannon barrel
            camilleTime = 0;
        }
    }

    /**
     * FIXME: write down what your vector rotation will be
     */
    private void tylerFire() {
        if ("i".equals(Greenfoot.getKey())) {
            int angle = getRotation() + 180; // adjust angle for image

            AWorld world = (AWorld) getWorld();
            Projectile_4 ball = new Projectile_4(new Vector(angle, 9));
            getWorld().addObject(ball, world.getTylerX(), world.getTylerY());
            ball.setRotation(angle);
            ball.move(-42); // clear the cannon barrel
            tylerTime = 0;
        }
    }

    /**
     * Resets the all the times when it reaches 100
     */
    private void resetTime() {
        if (chandlerTime > 100) {
            chandlerTime = 100;
        }

        if (philipTime > 100) {
            philipTime = 100;
        }

        if (camilleTime > 100) {
            camilleTime = 100;
        }

        if (tylerTime > 100) {
            tylerTime = 100;
        }
    }

    /**
     * Act - do whatever the Projector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        chandlerTime++;
        philipTime++;
        camilleTime++;
        tylerTime++;

        resetTime();

        if (chandlerTime >= 20) {
            chandlerFire();
        } else if (philipTime >= 40) {
            philipFire();
        } else if (camilleTime >= 60) {
            camilleFire();
        } else if (tylerTime >= 100) {
            tylerFire();
        }
    }

}
