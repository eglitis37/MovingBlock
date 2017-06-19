import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Yellow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yellow extends Actor
{
    
    /**
     * Constructor for objects of class Yellow.
     * 
     */
    public Yellow()
    {
        GreenfootImage yellowImage = new GreenfootImage(40, 40);
        
        yellowImage.setColor(Color.YELLOW);
        yellowImage.fillRect(0, 0, 40, 40);
        
        setImage(yellowImage);
    }
    
    /**
     * Act - do whatever the Yellow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
