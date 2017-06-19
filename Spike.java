import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spike extends Actor
{
    private int imageCounter = 3;
    private GreenfootImage spike = new GreenfootImage("spikes.png");
    
    /**
     * Constructor for objects of class Spike.
     * 
     */
    public Spike()
    {
        getImage().scale(40, 25);
        spike.mirrorVertically();
        setImage(spike);
    }
    
    /**
     * Act - do whatever the Spike wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        if(imageCounter >=3)
        {
            getImage().mirrorHorizontally();
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
