import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flowerEater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flowerEater extends Actor
{
 

    
    
    private int score;
    public int life;
    
    //defualt constructer--without permaters (gives starting vlaues to the int)
    
    public flowerEater()
    {
        this.score = 0;
        this.life = 3;
    }
    /**
     * Act - do whatever the flowerEater wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        if(life>0)
        {
            this.getWorld().showText("Score:"+this.score,300,10);
            this.getWorld().showText ("lives: "+this.life, 35, 10);
        }
        this.mover();
        
        if(this.isTouching(flower.class) ==true )
        {
            this.removeTouching(flower.class);
            this.score = this.score +1;
            World w = this.getWorld();
            //w.showText ("Score: "+this.score, 300, 10);
            this.spawn();
        }
        if(isTouching(bomb.class))
        {
            this.removeTouching(bomb.class);
            this.setLocation(30,50);
            this.life = this.life -1;
           
            
          if(life>=0)
            {
              this.getWorld().showText ("Score: "+this.score, 300, 10);
              this.getWorld().showText ("lives: "+this.life, 35, 10);
            }
            if(life>0)
            {
                this.score = 0;
                this.getWorld().showText ("Score: "+this.score, 300, 10);

                Greenfoot.delay(75);
            }
             
        }
        if(life==0)
        {
            this.getWorld().addObject(new lose(),300,200);

        }  
        
        if(this.score==25)
        {
            this.getWorld().removeObjects(this.getWorld().getObjects(bomb.class));
            this.getWorld().removeObjects(this.getWorld().getObjects(flower.class));;
            this.getWorld().addObject(new win(),300,200);
        }
    }
   
    private void mover()
    {
         if(Greenfoot.isKeyDown("up") == true)
        {this.setLocation(this.getX(),this.getY()-4);
        }
        else if(Greenfoot.isKeyDown("down") == true)
        {this.setLocation(this.getX(),this.getY()+4);
        }
        else if(Greenfoot.isKeyDown("left") == true)
        {this.setLocation(this.getX() -4,this.getY());
        }
        else if(Greenfoot.isKeyDown("right") == true)
        {this.setLocation(this.getX() +4,this.getY());
        }
    }
    
    private void spawn()
    { 
     World w = this.getWorld();
     int X = Greenfoot.getRandomNumber(w.getHeight());
     int Y = Greenfoot.getRandomNumber(w.getWidth());
     w.addObject(new flower(),X,Y);
    }
}
    
