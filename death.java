import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class death here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class death extends Actor
{
    public death()
    {
    GreenfootImage gfi = new GreenfootImage("death2.jpg");
        gfi.scale(600,400);
        this.setImage(gfi);
    }
    public void act()
    {
       Greenfoot.stop();
    }
}
