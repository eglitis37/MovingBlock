import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Portal2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal2 extends Actor
{
    
    /**
     * Constructor for objects of class Portal2.
     * 
     */
    public Portal2()
    {
        GreenfootImage portalImage = new GreenfootImage(40, 40);
        Color c = new Color(101, 19, 173);
        portalImage.setColor(c);
        portalImage.fillRect(0, 0, 40, 40);
        
        setImage(portalImage);
    }
    
    /**
     * Act - do whatever the Portal2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
