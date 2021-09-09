import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class trap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Actor
{
    /**
     * Act - do whatever the trap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //public bomb()
    //{
       // GreenfootImage gfi = new GreenfootImage("bomb.png");
       // gfi.scale(60,60);//gfi.rotate(270);
        //this.setImage(gfi);
    //}
    public void act()
    {
        this.setLocation(this.getX(),this.getY()+4);
        
        if(this.isAtEdge())
        {
            World w = this.getWorld();
            w.removeObject(this);
        }
    
    }
}
