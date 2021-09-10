import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lose extends Actor
{
    /**
     * Act - do whatever the lose wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage gfi = new GreenfootImage("lose.png");
        gfi.scale(600,400);
        this.setImage(gfi);
        Greenfoot.stop();
    }
}
