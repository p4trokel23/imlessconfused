import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class win extends Actor
{
    /**
     * Act - do whatever the win wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage gfi = new GreenfootImage("win.jpg");
        gfi.scale(600,400);
        this.setImage(gfi);
        Greenfoot.stop();
    }
}
