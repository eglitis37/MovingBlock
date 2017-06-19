import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{
    
    /**
     * Constructor for objects of class Portal.
     * 
     */
    public Portal()
    {
        GreenfootImage portalImage = new GreenfootImage(40, 40);
        Color c = new Color(101, 19, 173);
        portalImage.setColor(c);
        portalImage.fillRect(0, 0, 40, 40);
        
        setImage(portalImage);
    }
    
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
