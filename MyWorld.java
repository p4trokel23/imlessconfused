import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    public int stepCounter;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        GreenfootImage gfi = new GreenfootImage("grass.jfif");
        setBackground​(gfi);
        flower f = new flower ();
        this.addObject(f,300,200);
        
        flowerEater a = new flowerEater ();
        this.addObject(a,30,50);
        
        stepCounter=0;
        
        
    
    }
    public void act()
    {
        this.stepCounter++;
        
        bomb b = new bomb();
        
        if (stepCounter % 100==0)
        {
        this.addObject(b,Greenfoot.getRandomNumber(getWidth()),5);
        }
        
         

    }
}
