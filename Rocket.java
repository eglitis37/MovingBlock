import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    private int imageCounter = 3;
    
    /**
     * Constructor for objects of class Rocket.
     * 
     */
    public Rocket ()
    {
        setImage("Rocket.png");
    }
    
    public void act() 
    {
        move(-1);
        
        if(imageCounter >=3)
        {
            
            imageCounter = 0;
        }
        else
        {
            imageCounter ++;
        }
        
        if (getX() <= 0)
        {
            getWorld().removeObject(this);
        }
    }
}
